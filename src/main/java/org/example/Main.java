package org.example;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Motivation> motivations = new ArrayList<>();
        int id = 1;
        System.out.println("==명언 앱 실행 ==");
        while (true) {
            System.out.println("명령어)");
            String cmd = sc.nextLine().trim();
            if (cmd.equals("등록")) {
                System.out.println("명언:");
                String content = sc.nextLine().trim();
                System.out.println("작가");
                String author = sc.nextLine().trim();
                LocalDate regDate = LocalDate.now();
                Motivation motivation = new Motivation(id, regDate,content, author);
                motivations.add(motivation);
                System.out.printf(id + "번 명언이 등록되었습니다\n");
                id++;
            } else if (cmd.equals("목록")) {
                System.out.println("     번호    /    작가    /  명언   ");

                // 저장된 motivations에서 꺼내와야하는데..

                System.out.printf("%s  /   %d    /  %d" ,motivations );






            } else if (cmd.startsWith("상세보기")) {
                cmd.split(" ");
                if(cmd.length() == 0 ){
                    System.out.println("명령어를 똑바로 입력해주세요");
                    continue;
                }
          //상세보기 뒤에 숫자 사이를 split으로 나눠 숫자를 id로 입력받고
                //ArrayList 안에 저장된 motivations를 반복문으로 하나씩 맞춰가면서 찾아서
                //못찾으면 못찾았다 출력 후 continue , 찾으면 id , regDate , content , author
                //printf("%d" , getId); ,regDate , content, author 다  printf로 출력한다.


            } else if (cmd.startsWith("수정")) {

                //상세보기 뒤에 숫자 사이를 split으로 나눠 숫자를 id로 입력받고
                //ArrayList 안에 저장된 motivations를 반복문으로 하나씩 맞춰가면서 찾아서
                //못찾으면 못찾았다 출력 후 continue , 찾으면 바꿀 코드입력 입력하면 new content, new author에 저장하여 motivations에 저장.

            } else if (cmd.startsWith("삭제")) {
//상세보기 뒤에 숫자 사이를 split으로 나눠 숫자를 id로 입력받고
                //ArrayList 안에 저장된 motivations를 반복문으로 하나씩 맞춰가면서 찾아서
                //못찾으면 못찾았다 출력 후 continue , 찾으면 remove.motivation 으로 id를 제거한다.

            }
  //죄송합니다 못풀었습니다..
        }
    }


}
//
//- 사용자에게 명령어를 반복해서 입력받는다
//
//
//
//- motivation의 속성(id, regDate, content, author)을 고려하여 클래스를 구현한다.
//
//
//
//- 등록, 목록, 상세보기, 삭제, 수정의 기능을 구현한다
//
//
//
//- 기능에 맞는 적절한 문구가 출력 되어야 한다
//
//
//
//- 모든 클래스는 각각의 파일로 만들어야 한다
//
//