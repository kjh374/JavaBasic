package oop.obj_arr;

import java.util.Scanner;

public class ScoreMain {

	/*
    - Score 객체를 담을 수 있는 배열을 선언하세요.
     배열의 크기는 넉넉하게 100개로 하겠습니다.

    - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
    입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
    총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
    (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
    객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
    이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.

    - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
     scoreInfo()를 모두 불러주세요. (반복문)
     주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
     모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)
	 */


	public static void main(String[] args) {
		
		Score[] scr = new Score[100];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<scr.length; i++) {
			scr[i] = new Score();
			System.out.print("이름: ");
			scr[i].setName(sc.next());
			if(scr[i].name.equals("그만")) break;
			System.out.print("국어: ");
			scr[i].setKor(sc.nextInt());
			System.out.print("영어: ");
			scr[i].setEng(sc.nextInt());
			System.out.print("수학: ");
			scr[i].setMath(sc.nextInt());
			System.out.println();
		}
		System.out.println("학생 정보를 출력합니다.");
		for(Score s : scr) {
			if(s!=null) {				
				s.scoreInfo();
			}
		}
	}

}
