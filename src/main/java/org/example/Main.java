package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        Scanner sc = new Scanner(System.in);

        int id=1;

        while(true){
            System.out.printf("입력: ");
            String cmd = sc.nextLine();

            if(cmd.equals("/exit")){
                break;
            } else if(cmd.equals("/write")){
                System.out.println("게시물 등록");
                System.out.printf("제목입력: ");
                String title = sc.nextLine();
                System.out.printf("내용입력: ");
                String body = sc.nextLine();

                Write wr = new Write(id,title,body);
                System.out.println(wr);
                System.out.printf("%s번째 글입니다.\n", id);
                id++;
            }else{
                System.out.printf("입력한 명령: %s\n", cmd);
            }

        }
        System.out.println("프로그램 종료");
        sc.close();
    }
}

class Write{
    int id;
    String title;
    String body;

    public Write(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("id: %d, title: %s, body: %s", id, title, body);
    }
}