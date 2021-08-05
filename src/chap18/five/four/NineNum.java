package chap18.five.four;

import java.util.Arrays;

public class NineNum {

	public static void main(String[] args) {
		
		int[] k = {1, 5, 6, 9, 3, 2, 7, 4, 8};
		
		int sum = 0;
		int avg = 0;
		
		System.out.println("데이터: " + Arrays.toString(k));
		
		for(int i=0; i<k.length; i++) {
			sum += k[i];
		}
		
		avg = sum / k.length;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		if(k.length % 2 == 0) {
			int mean = (k.length/2)-1;
			System.out.printf("중앙값: %d\n", (k[mean]+k[mean+1])/2);
		} else {
			int mean = (k.length/2);
			System.out.printf("중앙값: %d\n", k[mean]);
		}
		
		
		

	}

}
