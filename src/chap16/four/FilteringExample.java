package chap16.four;

import java.util.*;

public class FilteringExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		
		names.stream()   //중복제거
		.distinct()                             
		.forEach(n -> System.out.println(n));  // 전체조회
		System.out.println();
		
		names.stream()  //필터링
		.filter(n -> n.startsWith("신"))      // 신씨 성을 가진 사람만   
		.forEach(n -> System.out.println(n));  
		System.out.println();
		
		names.stream()  //중복제거 후 필터링
		.distinct()                            
		.filter(n -> n.startsWith("신"))
		.forEach(n -> System.out.println(n));

	}

}
