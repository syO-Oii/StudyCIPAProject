package day_13_swingProject;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import day_11_Test_MyBaseballTeam.MyFunction;
import day_11_Test_MyBaseballTeam.PlayerInfo;

public class MyFrame extends JFrame implements ActionListener{
	ArrayList<PlayerInfo> playerList = new ArrayList<>();
	MyFunction myFunction = new MyFunction();
	JButton jb1 = new JButton("전체내용");
	JButton jb2 = new JButton("입력");
	JButton jb3 = new JButton("조회");
	JButton jb4 = new JButton("수정");
	JButton jb5 = new JButton("삭제");
	
	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	JTextField jt3 = new JTextField();
	JTextField jt4 = new JTextField();
	JTextField jt5 = new JTextField();
	
	public MyFrame() {
		Container con = this.getContentPane();
		con.setLayout(null);
		
		JLabel lb1 = new JLabel("선수이름");
		con.add(lb1);
		lb1.setLocation(20, 50);
		lb1.setSize(100, 30);
		
		// jt1
		con.add(jt1);
		jt1.setLocation(80, 50);
		jt1.setSize(100, 30);
		
		JLabel lb2 = new JLabel("선수 등번호");
		con.add(lb2);
		lb2.setLocation(200, 50);
		lb2.setSize(100, 30);
		
		// jt2
		con.add(jt2);
		jt2.setLocation(280, 50);
		jt2.setSize(100, 30);
		
		JLabel lb3 = new JLabel("포지션");
		con.add(lb3);
		lb3.setLocation(400, 50);
		lb3.setSize(100, 30);
		
		// jt3
		con.add(jt3);
		jt3.setLocation(460, 50);
		jt3.setSize(100, 30);
		
		JLabel lb4 = new JLabel("연봉");
		con.add(lb4);
		lb4.setLocation(620, 50);
		lb4.setSize(100, 30);
		
		//jt4
		con.add(jt4);
		jt4.setLocation(670, 50);
		jt4.setSize(100, 30);
		
		JLabel lb5 = new JLabel("전화");
		con.add(lb5);
		lb5.setLocation(20, 80);
		lb5.setSize(100, 30);
		
		// jt5
		con.add(jt5);
		jt5.setLocation(80, 80);
		jt5.setSize(100, 30);
		
		JLabel lb6 = new JLabel("잔고");
		con.add(lb6);
		lb6.setLocation(200, 80);
		lb6.setSize(100, 30);
		
		JTextField jt6 = new JTextField();
		con.add(jt6);
		jt6.setLocation(280, 80);
		jt6.setSize(100, 30);
		
		// jb1 : 전체 내용
		jb1.setLocation(20, 350);
		jb1.setSize(100, 30);
		con.add(jb1);
		jb1.addActionListener(this);
		
		// jb2 : 입력
		jb2.setLocation(200, 350);
		jb2.setSize(100, 30);
		con.add(jb2);
		jb2.addActionListener(this);
		
		
		// jb3 : 조회
		jb3.setLocation(380, 350);
		jb3.setSize(100, 30);
		con.add(jb3);
		jb3.addActionListener(this);
				
		// jb4 : 수정
		jb4.setLocation(560, 350);
		jb4.setSize(100, 30);
		con.add(jb4);
		jb4.addActionListener(this);
		
		// jb5 : 삭제
		jb5.setLocation(740, 350);
		jb5.setSize(100, 30);
		con.add(jb5);
		jb5.addActionListener(this);
		
		JTextArea ta = new JTextArea();
		ta.setLocation(20, 120);
		ta.setSize(830, 200);
		con.add(ta);
		
		this.setLocation(200, 100);
		this.setTitle("스윙 연습");
		this.setVisible(true);  // 윈도우 프레임을 보이게
		this.setSize(900, 500);  // 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
	
	public void actionPerformed(ActionEvent e) {
		// getSource = 액션 이벤트의 값
		
		/*
		 * if(e.getSource() == jb1) { System.out.println("111"); } else if(e.getSource()
		 * == jb2) { System.out.println("222"); } else if(e.getSource() == jb3) {
		 * System.out.println("333"); }
		 */
		
		// 혹은 e.getActionCommand() 사용
		// e.getActionCommand() : 동작을 한 곳의 command를 읽어오는 메소드
		
		switch(e.getActionCommand()) {
		case "전체내용":	// ArrayList 내용을 그대로 출력하기
			myFunction.printPlayers(playerList);
			break;
		case "입력":	// ArrayList에 값 나오게 하기
			System.out.println("입력 실행");
			String name = jt1.getText();
			int backNum = Integer.parseInt(jt2.getText());
			String position = jt3.getText();
			double salary = Double.parseDouble(jt4.getText());
			AddPlayer(playerList, name, backNum, position, salary);
			break;
		case "조회":
			System.out.println("조회 나오기");
			break;
		case "수정":
			System.out.println("수정 나오기");
			break;
		case "삭제":
			System.out.println("삭제 나오기");
			break;
		}
		
		
	}
	
	
	private static void AddPlayer(ArrayList<PlayerInfo> playerList, String name, int backNum, String position,
			double salary) {
		PlayerInfo player = new PlayerInfo(name, backNum, position, salary);
		playerList.add(player);
		
	}
}
























