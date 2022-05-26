package com.yhb.jtb;

import java.util.Scanner; //scanner 클래스를 사용하기 위해 클래스를 호출
//'exit' 명령을 입력받기 전까지 명령어를 계속 입력할 수 있어야 함
//'exit' 명령을 입력받으면 프로그램 종료가 출력되야함.
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner 클래스의 객체를 생성
		//여기서 System.in은 사용자로 부터 명령을 입력받기 위한 입력 스트림이다.
		System.out.println("=== 게시판 v 0.3 ===");
		System.out.println("=== 프로그램 시작 ===");
		while (true) { //명령어를 계속 입력해야 하므로 반복문인 while문을 사용
			System.out.printf("명령) ");
			String cmd = sc.nextLine(); //String 형 입력 및 리턴
			//변수 sc에 입력된 명령을 문자형 변수 cmd에 저장함
			//변수 cmd에 저장된 명령을 출력
			if (cmd.equals("/usr/article/write")) {
				System.out.println("게시물 등록");
				System.out.printf("제목) ");
				String title = sc.nextLine(); //입력된 명령을 title 변수에 저장
				System.out.printf("내용) ");
				String body = sc.nextLine(); // 입력된 명령을 body 변수에 저장
				System.out.println("1번 게시물이 등록되었습니다.");
			}
			else if (cmd.equals("exit")) {//조건: cmd에 입력된 명령어가 exit일 때 true
				break; //exit 명령어가 입력되면 while 반복문을 종료시킴
			}
			System.out.printf("입력된 명령어 : %s\n", cmd);
		}
		System.out.println("=== 프로그램 종료 ==="); //프로그램 종료 텍스트 출력
		sc.close(); //scanner 입력 종료 메서드
	}
}
