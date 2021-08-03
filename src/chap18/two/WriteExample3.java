package chap18.two;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("c:/temp/test.txt");	
		
		char[] data = "홍길동".toCharArray();
		
		writer.write(data, 1, 2);
		
		writer.flush();
		writer.close();
		
	}

}
