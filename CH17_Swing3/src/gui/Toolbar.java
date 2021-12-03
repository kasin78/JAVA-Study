package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;


//class ColorButtonListener implements ActionListener {
//	private MainPanel mainPanel;
//	private Color color;
//	
//	public ColorButtonListener(MainPanel mainPanel, Color color) {
//		this.mainPanel = mainPanel;
//		this.color = color;
//	}
//	public void actionPerformed(ActionEvent e) {
////		System.out.println("빨간색 버튼 클릭!");
//		mainPanel.setBackground(color);
//	}	
//}

//class BlueButtonListener implements ActionListener {
//	private MainPanel mainPanel;
//	
//	public BlueButtonListener(MainPanel mainPanel) {
//		this.mainPanel = mainPanel;
//	}
//	public void actionPerformed(ActionEvent e) {
////		System.out.println("파란색 버튼 클릭!");
//		mainPanel.setBackground(Color.BLUE);
//	}	
//}

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) {
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		
		// 툴바에 버튼을 붙임
		add(redButton);
		add(blueButton);
		
		// 버튼에 이벤트를 연결('클릭' 이벤트) => 익명 클래스로 표현, 레드는 람다식(추후 배움)
		redButton.addActionListener(e -> mainPanel.setBackground(Color.RED)); 
		
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setBackground(Color.BLUE);
			}
		});
	}
}
