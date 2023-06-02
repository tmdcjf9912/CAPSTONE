package com.ssc.exam.board;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==게시판 v 0.1==");
        System.out.println("==프로그램 시작==");
        int id = 1;

        while(true){
            System.out.printf("입력)");
            String cmd = sc.nextLine();

            if(cmd.equals("exit")){
                break;
            }else if(cmd.equals("/user") || cmd.equals("/article") || cmd.equals("/write")){
                System.out.println("게시물 등록");
                System.out.printf("제목 : ");
                String title = sc.nextLine();
                System.out.printf("내용 : ");
                String contents = sc.nextLine();

                System.out.printf("%d번 게시물이 등록되었습니다.\n", id);
                id++;
            }else{
                System.out.printf("입력된 명령어 : %s\n", cmd);
            }
        }

        System.out.println("==프로그램 종료==");
        sc.close();
    }
}
