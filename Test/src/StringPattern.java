
public class StringPattern {
	public static void main(String[] args) {
		/*String str ="Hello";
		print(str);*/
		
		for (int i = 0; i <5;) {
			System.out.println("Hello");
		}
	}
	public static  void print(String s) {
		
		
		//for(int i =0;i<s.length();i++) {
			for(int j =s.length();j>0;j--) {
				System.out.println(s.substring(0, j));
			}
			
		//}
	}

}
