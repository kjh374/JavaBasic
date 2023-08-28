package basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {

		
		
		int[][] score = {
                {79, 80, 99}, //A학생
                {95, 85, 89}, //B학생
                {90, 65, 56}, //C학생
                {69, 78, 77}  //D학생
                //과목: 3과목
        };
        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};
        System.out.println();

        /*
        1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
        2. 각 과목의 평균을 출력해 보세요.
        3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
        */
        
        //1번 답안
        System.out.println("======= 학생 평균 =======");
        int stuNum = 0; //stuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수.
        double totalAvg = 0.0; //학생들의 평균점수 총합.
        for(int[] sc : score) {
        	int total = 0;
        	for(int ore : sc) {
        		total += ore;
        	}
        	totalAvg += (double)total/sc.length;
        	System.out.printf("%s의 평균: %.1f점\n", stuName[stuNum], totalAvg);
        	stuNum++;
        }
        
        //2번 답안
        System.out.println("\n======= 과목 평균 =======");
        for(int i=0; i<score[i].length; i++) { 
        	int count = 0;
        	for(int j=0; j<score.length; j++) {
        		count += score[j][i];
        	}
        	System.out.printf("%s 과목 평균: %.2f점\n", subName[i], (double)count/score.length);
        }
        
        //3번 답안
        System.out.println("\n======= 반 평균 ========");
//        int count = 0;
//        int i = 0;
//        for(int[] arr : score) {
//        	for(int each : arr) {
//        		count += each;
//        		i++;
//        	}
//        }
        System.out.printf("반 평균: %.2f점", (double)totalAvg/score.length);
        System.out.println();
        
        
        
	}

}
