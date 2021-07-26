package chap14.two;

public class MyFunctionInterfaceExample {

	public static void main(String[] args) {
		
		MyfunctionInterface fi;
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		
		fi.method();
		
		fi = () -> { System.out.println("method call2"); };
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
	}

}
