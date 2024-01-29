package aaa;

import java.awt.*;
import javax.swing.*;

public class JoinScreen extends JFrame {
	
	String choice = null;
	
	public JoinScreen() {
		setTitle("회원관리 화면");
		
		JLabel title = new JLabel("회원가입", JLabel.CENTER);
		
		title.setForeground(new Color(5, 0 ,153));
		title.setFont(new Font("휴먼편지체", Font.BOLD,30));
		
		JButton join = new JButton("회원가입");
		JButton cancel = new JButton("취소");
		
		JTextField id = new JTextField(10);
		JPasswordField pwd = new JPasswordField(10);
		JTextField name = new JTextField(10);
		JTextField phone = new JTextField(10);
		
		JRadioButton client = new JRadioButton("고객");
		JRadioButton manager = new JRadioButton("관리자");
		JRadioButton etc = new JRadioButton("기타");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(client); bg.add(manager); bg.add(etc);
		
		JPanel radioPanel = new JPanel();
		radioPanel.add(client);
		radioPanel.add(manager);
		radioPanel.add(etc);
		
		JPanel idPanel = new 
		
		
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JoinScreen();

	}

}
