package day_11_Test_MyBaseballTeam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		MyFunction myFunction = new MyFunction();
		Scanner sc = new Scanner(System.in);
		LoadPlayerInfo loadInfo;
		ArrayList<PlayerInfo> playerList = new ArrayList<>();	// 선수 명단
		String selectMenu;
		
		
		while(myFunction.getCheckMenu()) {
			myFunction.disp();
			myFunction.select();
			selectMenu = sc.nextLine();
			
			switch(selectMenu) {
			case "1":
				// 회원 출력
				System.out.println("회원 출력");
				printPlayers(playerList);
				myFunction.menuOff();
				break;
			case "2":
				// 회원 등록
				System.out.println("회원 등록");
				{
					String name;
					int backNum;
					String position;
					double salary;
					
					System.out.print("추가할 선수 이름 입력 : ");
					name = sc.nextLine();
					System.out.print(name + "선수 등번호 입력 : ");
					backNum = Integer.parseInt(sc.nextLine());
					System.out.println(name + "선수 포지션 입력 : ");
					position = sc.nextLine();
					System.out.println(name + "연봉 입력 : ");
					salary = Double.parseDouble(sc.nextLine());
					AddPlayer(playerList, name, backNum, position, salary);
					
					System.out.println("선수 정보 입력이 완료되었습니다.");
				}
				break;
			case "3":
				loadInfo = new LoadPlayerInfo();
				
			case "4":
				// 파일 저장
				System.out.println("파일 저장");
				break;
			case "5":
				// 파일 읽기
				System.out.println("파일 읽기");
				break;
			default:
				System.out.println("다시 입력 해 주세요.");
				myFunction.select();
				break;
			}
		}
		
		

	}
	
	private static void AddPlayer(ArrayList<PlayerInfo> playerList, String name, int backNum, String position,
			double salary) {
		PlayerInfo player = new PlayerInfo(name, backNum, position, salary);
		playerList.add(player);
		
	}
	
	// 선수 정보 출력 메소드
    public static void printPlayers(ArrayList<PlayerInfo> list) {
        for (PlayerInfo player : list) {
            System.out.println("이름: " + player.name +
                               ", 등번호: " + player.backNum +
                               ", 포지션: " + player.position +
                               ", 연봉: " + player.salary);
        }
    }


	

	
}


