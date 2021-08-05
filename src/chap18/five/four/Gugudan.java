package chap18.five.four;


public class Gugudan {

	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d x %d = %2d\n", i, j, i*j);
			}
			System.out.println();
		}
		
	}

}
