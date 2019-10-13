import java.io.*;
import java.net.*;
public class ReadWebContent {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		URL url = new URL("https://www.programcreek.com/2009/04/using-java-to-read-web-page/");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String str;
		while((str = br.readLine())!=null) {
			System.out.println(str);
		}
		}
		catch(Exception e) {
			System.out.println(e);	
			
			
			}
	}

}
