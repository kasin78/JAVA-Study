package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L; // MainFrame warning 제거

	public MainFrame(String title) { // 생성자
		super(title); // 창의 이름을 넣어서 생성
		
		// 1. 레이아웃 설정
		setLayout(new BorderLayout()); // 창에 컴포넌트(버튼등)들을 붙이기 위함
		
//		JPanel panel = new JPanel(); // 패널 생성
//		panel.setBackground(Color.GREEN); // 패널 색 설정
		
		final MainPanel mainPanel = new MainPanel();
//		mainPanel.setBackground(Color.CYAN);
		
		add(new Toolbar(mainPanel), BorderLayout.NORTH); // 툴바를 레이아웃의 위에 붙이기
		add(mainPanel, BorderLayout.CENTER);             // 패널을 레이아웃의 가운데 붙이기
		
		setSize(600, 400); // 실행시 기본 가로 600, 세로 400
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫으면 프로그램 종료
		setVisible(true); // 프로그램이 눈에 보이는가, false면 보이지 않음
	}
}
