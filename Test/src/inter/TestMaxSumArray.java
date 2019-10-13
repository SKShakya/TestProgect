package inter;

public class TestMaxSumArray {

	public static void main(String[] args) {
		int a[] = {4,2,-4,5,-2};
		int max=0,start =0,end =0,fmax =0,fstart=0,fend=0;
		for(int i =0;i<a.length;i++) {
			if(a[i]>0 && start ==0) {
				max = a[i];
				start =end =i;
				
			}
			else if(a[i]>0){
				max = max+a[i];
				end++;
				
			}
			else {
				if(max>fmax) {
					fmax = max;
					fstart = start;
					fend = end;
					
					
				}
				
			
				if(a[i]+max<=0) {
					max =0;
					end++;
				}
				else {
					max = max+a[i];
					end++;
				}
			}
		
		
			if(max>fmax) {
				fmax = max;
				fstart = start;
				fend = end;
			}
			
		}
		System.out.println("Maxmum sum of subarray  :"+fmax+" From starting endex is :"+fstart+" and end on :"+fend) ;
	}

}
