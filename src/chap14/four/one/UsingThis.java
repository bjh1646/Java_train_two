package chap14.four.one;

public class UsingThis {

	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			//람다식
			MyfunctionInterface fi = () -> {
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField + "\n");
				
				System.out.println("innererField: " + innerField);
				System.out.println("innererField: " + this.innerField + "\n");
			};
			
			fi.method();
		}
	}
}
