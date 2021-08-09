package chap19.three.one;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class PerformanceExample {

	public static void main(String[] args) throws Exception {
		
		Path from = Paths.get("C:/temp/house.jpg");
		Path to1 = Paths.get("C:/temp/house2.jpg");
		Path to2 = Paths.get("C:/temp/house3.jpg");
		
		long size = Files.size(from);
		
		FileChannel fileChannel_from = FileChannel.open(from);
		FileChannel fileChannel_to1 = FileChannel.open(to1, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
		FileChannel fileChannel_to2 = FileChannel.open(to2, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
		
		ByteBuffer nonDirecBuffer = ByteBuffer.allocate((int) size);
		ByteBuffer direcBuffer = ByteBuffer.allocateDirect((int) size);
		
		long start, end;
		
		start = System.nanoTime();
		for(int i=0; i<100; i++) {
			fileChannel_from.read(nonDirecBuffer);
			nonDirecBuffer.flip();
			fileChannel_to1.write(nonDirecBuffer);
			nonDirecBuffer.clear();
		}
		end = System.nanoTime();
		System.out.println("넌다이렉트:\t" + (end-start) + " ns");
		
		fileChannel_from.position(0);
		
		start = System.nanoTime();
		for(int i=0; i<100; i++) {
			fileChannel_from.read(direcBuffer);
			direcBuffer.flip();
			fileChannel_to1.write(direcBuffer);
			direcBuffer.clear();
		}
		end = System.nanoTime();
		System.out.println("다이렉트:\t" + (end-start) + " ns");
		
		fileChannel_from.close();
		fileChannel_to1.close();
		fileChannel_to2.close();

	}

}
