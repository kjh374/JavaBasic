package selfproblem;

import java.util.Arrays;

public class First {

	/*
    - 참가한 사람의 이름이 담긴 배열 participant와
    완주한 사람의 이름이 담긴 배열 completion이 주어질 때
    완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
    완주하지 못한 자는 2명이라고 가정합니다.
	 */

		public static String[] solution(String[] participant, String[] completion) {
			String[] arr = new String[3];
			Arrays.sort(completion);
			int count = 0;
			for(int i=0; i<participant.length; i++) {
				int answer = Arrays.binarySearch(completion, participant[i]);
				if(answer<0) {
					arr[count] = participant[i];
					count++;
				}
			}
			return arr;
		}
		
//	public static String[] solution(String[] participant, String[] completion) {
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		String[] arr = new String[2];
//		int count = 0;
//		for(int i=0; i<completion.length; i++) {
//			if(!participant[i].equals(completion[i])) {
//				arr[count] = participant[i];
//				count++;
//			}
//		}
//		return arr;
//	}

	//	public static String solution(String[] participant, String[] completion) {
	//			Arrays.sort(participant);
	//			Arrays.sort(completion);
	//			for(int i=0; i<completion.length; i++) {
	//			if(participant[i].equals(completion[i])) {
	//				return participant[i];
	//			}
	//		}
	//			return participant[participant.length-1];
	//	}


	public static void main(String[] args) {

		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"};
		String[] completion = {"최철수", "홍길동"};



		String[] arr = solution(participant, completion);
		System.out.println("완주하지 못한 자: " +Arrays.toString(arr));
	}

}
