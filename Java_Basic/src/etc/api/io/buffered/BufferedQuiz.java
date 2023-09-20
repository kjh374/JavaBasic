package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class BufferedQuiz {

	/*
         1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로
          오늘 날짜 20230908file 이라는 이름으로 폴더를 생성하세요.
         2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
         3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
          파일을 작성합니다. 
          (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
           연결해 주시면 됩니다.)
                각 문장은 줄 개행을 포함합니다.
         4. '그만'으로 파일이 작성되었다면, 아무 방법으로나 
          파일을 읽어서 콘솔에 출력해 보세요.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		File nowDate = new File("C:/MyWork/" + LocalDate.now());
		nowDate.mkdir();
		System.out.print("파일명: ");
		String name = sc.next();
		sc.nextLine();
		FileOutputStream newFile = null;
		FileWriter write = null;
		FileInputStream readFile = null;
		FileReader read = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String text = "";
		
//		if(!nowDate.exists()) {
//			nowDate.mkdir();
//		}
		try {
			newFile = new FileOutputStream(nowDate + "/" + name + ".txt");
			write = new FileWriter(nowDate + "/" + name + ".txt");
			readFile = new FileInputStream(nowDate + "/" + name + ".txt");
			read = new FileReader(nowDate + "/" + name + ".txt");
			br = new BufferedReader(read);
			bw = new BufferedWriter(write);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		String str;
		while(true) {	
			System.out.print("파일내용: ");
			String origin = sc.nextLine();
			str = origin + "\r\n";
			try {
								newFile.write(str.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(origin.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			
			text += (origin + "\r\n");
		}
//		bw.write(text);
		System.out.println("파일 작성 완료!");
		
		//읽기 로직은 쓰기 로직이 끝나야 된다네..
		try {
//								while((read = br.readLine())!= null)
//								System.out.print((char)readFile.read());
								System.out.println(read);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				read.close();
				readFile.close();
				write.close();
				newFile.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//// 파일 읽기 /////
//		FileReader fr = null;
//		bufferedReader br = null;
//		fr = new FileReader();

//		String read;

//		while((read = br.readLine())!= null)
//			System.out.println(read);
	}


}
