package com.yhb.jtb;

import java.util.Scanner; //scanner 클래스를 사용하기 위해 클래스를 호출

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner 클래스의 객체를 생성
		//여기서 System.in은 사용자로 부터 명령을 입력받기 위한 입력 스트림이다.
		System.out.println("=== 게시판 v 0.2 ===");
		System.out.println("=== 프로그램 시작 ===");
		System.out.println("명령) ");
		String cmd = sc.nextLine(); //String 형 입력 및 리턴
		//개행을 기준으로 한 줄을 읽음
		//변수 sc에 입력된 명령을 문자형 변수 cmd에 저장함
		System.out.printf("입력한 명령어: %s\n", cmd);
		//변수 cmd에 저장된 명령을 출력
		System.out.println("=== 프로그램 종료 ===");
	}
}
