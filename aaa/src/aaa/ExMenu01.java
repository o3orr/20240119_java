package aaa;

import javax.swing.*;

public class ExMenu01 extends JFrame {
	
	public ExMenu01() {
		setTitle("메뉴 만들기");
		setSize(400, 200);
		
		JMenuBar menu = new JMenuBar(); //메뉴바 생성
		
		JMenu menu01 = new JMenu("File"); //주메뉴 File 생성
		JMenu menu02 = new JMenu("Edit"); //주메뉴 File 생성
		JMenu menu03 = new JMenu("Help"); //주메뉴 File 생성
		menu.add(menu01); //메뉴바에 주메뉴 File추가 
		menu.add(menu02); //메뉴바에 주메뉴 File추가 
		menu.add(menu03); //메뉴바에 주메뉴 File추가 
		
		JMenuItem item01 = new JMenuItem("New"); //부메뉴 
		JMenuItem item02 = new JMenuItem("Open"); //부메뉴
		menu01.add(item01);
		menu01.add(item02);
		
		setJMenuBar(menu);  //프레임에 메뉴바 추가
		
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new ExMenu01();
		

	}

}
