package member;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/* - Network 서비스는 반드시 port 필요
   - Socket 통신
   - Thread : 프로그램(프로세스)의 안의 작은 일의 단위
   		- 무전기 : 단일쓰레드
        - 스마트폰 : 멀티쓰레드   */

public class EchoServer {
	
	// java.io, java.net, java.sql은 대부분 예외가능 가능성 있는 생성자 또는 메소드 : try-catch
	public EchoServer() {
		try {
			int port = 8000; // 포트번호
			int cnt = 0; 	 // 접속해있는 클라이언트 수
			ServerSocket server = new ServerSocket(port); // 서버 소켓, ServerSocket은 포트번호가 필요
			System.out.println("ServerSocker Start.....");
			while(true) {
				// Client가 접속할 때까지 대기상태
				Socket sock = server.accept(); 			  // 클라이언트 소켓
				EchoThread client = new EchoThread(sock);
				client.start(); // run 호출
				cnt++;
				System.out.println("Client " + cnt + "Socket");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 내부 클래스로 Client의 대응을 각각 하기 위해 Thread 기능의 클래스 생성
	class EchoThread extends Thread {
		Socket sock;
		BufferedReader in; // Client가 보내는 메시지 받는 스트림
		PrintWriter out;   // Client로 메시지 보내는 스트림
		
		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				// Client가 보내는 메시지 받는 스트림
				in = new BufferedReader(
						new InputStreamReader(
								sock.getInputStream()));
				// Client로 메시지 보내는 스트림
				out = new PrintWriter(
						sock.getOutputStream(),true/*auto flush*/);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void run() {
			try {
				// 클라이언트가 접속하면 처음으로 받는 메시지
				out.println("Hello! Enter BYE to exit");
				while (true) {
					// 클라이언트가 메시지 보낼 때까지 대기 상태
					String line = in.readLine();
					// 클라이언트가 접속을 끊을때 
					if (line == null) {
						break; 
					} else { // 클라이언트가 메시지를 쳤을때
						out.println("Echo : " + line);
						// 클라이언트가 BYE 입력하면 접속 끊음
						if (line.equals("BYE")) {
							break;
						}
					}
				} // --while
						
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} // --EchoThread
	
	public static void main(String[] args) {
		new EchoServer();
	}
}










