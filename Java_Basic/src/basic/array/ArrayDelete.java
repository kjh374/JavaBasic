package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {

		int[] arr = {0, 1, 2, 3, 4, 5, 6};
		int[] temp = new int[arr.length-1];
//		arr[3] = arr[4];
//		arr[4] = arr[5];
//		arr[5] = arr[6];
		Scanner sc = new Scanner(System.in);
//		System.out.println("무엇을 삭제할까요?");
//		int name = sc.nextInt();
//		int i = 1;
//		while(i<arr.length) {
//			temp[i-1] = arr[i-1];
//			if(name == arr[i-1]) {
//				while(i<arr.length)
//				temp[i-1] = arr[i];
//				i++;
//			}
//		}
//		System.out.println(i);
//		System.out.println(Arrays.toString(temp));
		
		//삭제되는 값을 기준으로 뒤에 있는 값을 한 칸씩 앞으로 땡기는 작업.
		//추후에 생성될 새 배열에 값을 그대로 대입하기 편하게 하기 위해 하는 작업.
		
		for(int i=3; i<arr.length-1; i++) { 
			arr[i] = arr[i+1];
		}
		
		// 기존의 배열보다 크기가 하나 작은 새 배열을 생성.		
		//원본 배열의 값을 새 배열에 인덱스를 맞춰서 그대로 대입
//		temp[0] = arr[0];
//		temp[1] = arr[1];
//		temp[2] = arr[2];
		
		for(int j=0; j<temp.length; j++) {
			temp[j] = arr[j];
		}
		
		arr = temp; //temp 배열의 주소값을 arr에게 넘긴다.
		temp = null; //주소값을 지워서 메모리에서 temp는 자동 소멸되게 합니다.
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		sc.close();
		
	}

}
