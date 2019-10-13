
public class ExitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printnumber(1);

	}
	public static void printnumber(int num) {
		if(num<=100) {
			System.out.println(num++);
			printnumber(num);
		}
		else {
			System.exit(0);
		}
	}

}
