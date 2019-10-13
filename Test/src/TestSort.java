
public class TestSort {

	public static void main(String[] args) {
		int a[] = {2,6,8,1,9,6};
		
		for(int i=1; i<a.length;i++) {
			
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key) {
			a[j+1]	=a[j];
			j=j-1;
				
			}
			 a[j+1] = key;
			
		}
		for(int j=0;j<a.length;j++) {
			System.out.println("Hello"+a[j]);
		}

	}

}
