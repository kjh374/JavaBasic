package oop.obj_arr;

import java.util.Scanner;

public class ScoreMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Score1[] stuList = new Score1[100];
		int cnt = 0;

		for(int i=cnt; i<stuList.length; i++) {
			System.out.println("*** 새로운 성적 등록을 시작합니다. 중단을 원하시면 '그만'을 입력해주세요.");
			Score1 s = new Score1();

			System.out.print("이름 >");
			String n = sc.next();
			if (n.equals("그만")) break;
			System.out.print("국어성적 >");
			int k = sc.nextInt();
			System.out.print("영어성적 >");
			int e = sc.nextInt();
			System.out.print("수학성적 >");
			int m = sc.nextInt();

			stuList[i] = s;
			stuList[i].setName(n); stuList[i].setKorean(k); stuList[i].setEnglish(e); stuList[i].setMath(m);
			stuList[i].scoreCalc();
			cnt++;
		}
		sc.close();

		System.out.println("********************************************");
		System.out.println("모든 학생의 성적을 출력합니다.");
		for(Score1 s: stuList) {
			if(s == null) break;
			s.scoreInfo();
		}
		System.out.println("출력을 완료했습니다.");


	}

}
