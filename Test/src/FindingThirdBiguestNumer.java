import java.util.*;
public class FindingThirdBiguestNumer {

	public static void main(String[] args) {
		int[] arr = {2,5,5,1,7,8,10,10,10,4,6,12,15,15};
		Map<Integer,Integer> tm = new TreeMap<>();
		for(int z : arr) {
			if(tm.get(z)>1) {
				tm.put(z,tm.get(z)+1);
			}else {
				tm.put(z, 1);
			}
			
		//}
			System.out.println(tm);
		Iterator<Integer> it = tm.keySet().iterator();
		while(it.hasNext()) {
			int zz = it.next();
			System.out.println(tm.get(zz));
		}
		System.out.println(tm);
		}

	}

}
