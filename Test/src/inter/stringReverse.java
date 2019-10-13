package inter;

public class stringReverse {

	public static void main(String[] args) {
		Test t= new Test();
		// TODO Auto-generated method stub
		String str ="Hello";
		String result=t.reverse(str);
		System.out.print(result);
	}

}
class Test{
	public String reverse(String str) {
		if(str.isEmpty()) {
			return "";
			//break ;
		}
		else
		{
			return str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
		}
	}
}
