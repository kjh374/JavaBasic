package basic.method;

import java.util.Arrays;

public class MethodQuiz02 {

	static String[] foods = {"떡볶이", "치킨", "파스타"};
	
	//1. 배열의 맨 마지막 위치에 데이터를 추가하는 함수 (push -> void)
    //기존 배열보다 크기가 하나 큰 배열을 선언해서 값 고대로 내리기
    //매개값으로 전달된 값을 마지막 위치에 채우기
    
	static void push(String data){
		String[] emptyArr = new String[foods.length+1];
		for(int i=0; i<foods.length; i++) {			
			emptyArr[i] = foods[i];
		}
		emptyArr[emptyArr.length-1] = data;
		foods = emptyArr;
		emptyArr = null;
	}
	
    
    //2. 배열 내부 데이터 단순 출력 함수
    static void printFood() {
        System.out.println(Arrays.toString(foods));
    }
    
    
    //3. 배열 내의 특정 음식의 위치를 찾아주는 함수 (indexOf -> int)
    // 매개값을 전달하면 해당 매개값이 배열 내의 몇 번 인덱스인지를 리턴하는 함수
    // 존재하지 않는 값이라면 -1을 리턴.
    
    static int indexOf(String targetName) {
    	for(int i=0; i<foods.length; i++) {
    		if(targetName.equals(foods[i])) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    
    //4. 특정 음식의 배열 포함 여부 (include -> boolean)
    //매개값으로 전달된 음식이 배열에 포함되어있는지의 여부를 판단.
    //힌트 -> indexOf 메서드를 활용하면 쉽게 끝남.
    
    static boolean include(String food) {
    	return indexOf(food) != -1;
//    	boolean flag = false;
//    	if(indexOf(food) != -1) {
//    		flag = true;
//    	}
//    	return flag;
    }
    
    //5. 특정 음식 제거 함수 (remove -> void)
    //전달된 음식을 배열에서 삭제하고 배열의 길이를 줄이면 된다.
    
    static void remove(String food) {
    	String[] emptyArr = new String[foods.length-1];
    	for(int i=0; i<emptyArr.length; i++) {
    		if(food.equals(foods[i])) {
    			for(int j=i; j<emptyArr.length; j++) {
    				emptyArr[j] = foods[j+1];    				
    			}
    			break;
    		}else if(i!=emptyArr.length-1){
    			emptyArr[i] = foods[i];    				    			
    		}else {
    			//System.out.println("존재하지 않는 값입니다.");
    		}
    	}
    	foods = emptyArr;
    	emptyArr = null;
    	
    }
//    static void remove(String targetName) {
//        int idx = indexOf(targetName);
//        if(idx == -1) {
//            System.out.println("존재하지 않는 음식명 입니다.");
//        } else {
//            for(int i=idx; i<foods.length-1; i++) {
//                foods[i] = foods[i+1];
//            }
//            String[] temp = new String[foods.length-1];
//            for(int j=0; j<temp.length; j++) {
//                temp[j] = foods[j];
//            }
//            foods = temp; temp = null;
//        } 
//    }
    
    
    //6. 특정 음식 수정 메서드 (modify -> void)
    //매개값으로 전달한 인덱스의 값을 전달한 값으로 수정해 주는 메서드
	
    static void modify(int idx, String newf) {
    	foods[idx] = newf;
    }
    
	public static void main(String[] args) {
		//배열 내부를 한번 출력 후, '라면', '김치찌개' 추가한 뒤 배열 출력하기
		printFood();
		push("추가");
		push("추가2");
		printFood();
		System.out.println(indexOf("치킨"));
		System.out.println(indexOf("피자"));
		//파스타의 인덱스 알아내기
		
		//김치찌개의 인덱스 알아내기
		//짜장면의 인덱스 알아내기(존재하지 않는 값)
		System.out.println(include("떡볶이"));
		System.out.println(include("피자"));
		modify(1, "수정");
		//김치찌개, 망고 지우기 (망고는 존재하지 않는 값)
		remove("파스타");
		remove("추");
		printFood();
		//라면의 존재 여부 출력
		
		//양념치킨의 존재 여부 출력
		
		//
		
	}

}
