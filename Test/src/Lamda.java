
import inter.*;

public class Lamda {
	
	public static void lambdaTest(Functionl f) {
		f.test();
	}
	
	public static void main(String... ss) {
		/*
		//by lemda expracetion
		Functionl f = () -> System.out.print("Hello Lamda");
		f.test();
		//by annonmus class
		Functionl f2 = new Functionl() {
			@Override
			public void test() {
				System.out.print("Hello Lamda");
			}
		};
		
		f2.test();
		//by method calling
		lambdaTest(f);
		//by method calling
		 
		 */
		lambdaTest(() -> System.out.println("Hello Lambda"));
		
		//MyClass myClass = new MyClass();
		//lambdaTest(myClass);
		
	}
}

//class MyClass implements Functionl{

	//@Override
	//public void test() {
	//	System.out.print("Hello Lamda");
		
	//}
	
//}
