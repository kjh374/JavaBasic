package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		// 48 ~ 150 사이의 정수 중 8의 배수만
		// 가로로 출력해 보세요.
		int n = 48;
		while(n <= 150) {
			if(n % 8 == 0) {
				System.out.print(n + " ");
			}
			n += 1;
		}
		
		System.out.println(); // 단순 줄 개행
		
		// 1 ~ 100까지의 정수 중 4의 배수이면서
		// 8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int i = 0;
		while(i <= 100) {
			if(i % 8 != 0) {
				System.out.print(i + " ");
			}
			i+=4;
		}
		System.out.println();
		int j = 1;
		while(j <= 100) {
			if(j % 4 == 0 && j % 8 != 0) {
				System.out.print(j + " ");
			}
			j++;
		}
		System.out.println();
		
		// 1~ 30000까지의 정수 중 258의 배수의 개수를 출력.
		int x = 1;
		int count = 0; // 배수의 개수를 세 줄 변수.
		while(x <= 30000) {
			if(x % 258 == 0 ) {
				count++;
			}
			x++;
		}
		System.out.println("1 ~ 30000 중 258의 배수의 개수: " + count + "개");
		
		// 1000의 약수의 개수를 구하세요.
		
		int d = 1;
		int cnt = 0;
		while(d <= 1000) {
			if(1000 % d == 0) {
				cnt++;
			}
			d++;
		}
		System.out.printf("1000의 약수의 개수: %d개\n", cnt);
	}
		
		
}



















