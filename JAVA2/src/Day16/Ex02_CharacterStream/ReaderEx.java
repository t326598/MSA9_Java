package Day16.Ex02_CharacterStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderEx {
public static void main(String[] args) {
	String filePath = "sample.txt";
	try (
			// FileReader 객체를 사용하여 파일을 문자 단위로 입력
			FileReader fil = new FileReader(filePath);
			// BufferedReader 객체로 파이 데이터 입력 성능 향상
			BufferedReader bf = new BufferedReader(fil);
			){
		String text;
		// readLine() : 파일의 문자 데이터를 한 줄씩 입력
		//              데이터가 더이상 없으며 null 반환
		while((text = bf.readLine()) != null) {
			System.out.println(text);
		}
	} catch (Exception e) {
	e.printStackTrace();
	}
}
}
