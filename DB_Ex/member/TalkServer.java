package member;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;

public class TalkServer {
	ServerSocket server;
	Vector<TalkThread> vc;
	int port = 8001;
	TalkMgr mgr;
	
	public TalkServer() {
		try {
			server = new ServerSocket(port);
			vc = new Vector<TalkThread>();
			mgr = new TalkMgr();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("***************************************");
		System.out.println("Welcome Talk Server");
		System.out.println("클라이언트의 접속을 기다리고 있습니다");
		System.out.println("***************************************");
		
		try {
			while (true) {
				Socket sock = server.accept();
				TalkThread client = new TalkThread(sock);
				client.start();
				// Vector에 Client 객체를 저장
				vc.addElement(client);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	// 모든 클라이언트에게 메세지 전달 기능
	public void sendAllMessage(String msg) {
		for (int i = 0; i < vc.size(); i++) {
				TalkThread client = vc.get(i); // Vector에서 Client 가져옴
				client.sendMessage(msg); // 각각의 out 스트림에 메세지 전달
		}
	}
	
	// Client가 연결을 끊을 때 Vector에서 제거
	public void removeClient(TalkThread client) {
		vc.remove(client);
	}
	
	class TalkThread extends Thread {
		
		Socket sock;
		BufferedReader in; // Client가 보내는 메시지 받는 스트림
		PrintWriter out;   // Client로 메시지 보내는 스트림
		
		public TalkThread(Socket sock) {
			try {
				this.sock = sock;
				// Client가 보내는 메시지 받는 스트림
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				// Client로 메시지 보내는 스트림
				out = new PrintWriter(sock.getOutputStream(), true/*auto flush*/);
				System.out.println(sock + "접속됨...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				String data = "", id = "", pwd = "";
				while (true) { // aaa,1234
					data = in.readLine();
					int idx = data.indexOf(';');
					id = data.substring(0, idx);
					pwd = data.substring(idx+1);
					if (mgr.loginChk(id, pwd)) { // 로그인 성공
						sendMessage("T");
						sendAllMessage("["+id+"]님이 입장하였습니다");
						break;
					} 
					else { // 로그인 실패
						sendMessage("F");
					}
				} // -- while
				while (true) {
					data = in.readLine();
					if (data == null) break;
					sendAllMessage("["+id+"]" + data);
				}	
			} catch (Exception e) {
				removeClient(this); // 자신의 객체가 Vector에서 제거
				System.err.println(sock + "끊어짐...");
			}
		}
		
		// Client로 메세지 보내는 기능
		public void sendMessage(String msg) {
			out.println(msg);
		}
	} // -- TalkThread
	
	public static void main(String[] args) {
		new TalkServer();
	}
}
