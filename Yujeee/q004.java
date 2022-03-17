import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q004 {

	public static int n;
	public static ArrayList<Integer> arrayList = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for ( int i = 0; i < n; i++) {
			arrayList.add(sc.nextInt());
			
		}

		Collections.sort(arrayList);
		
		int target = 1;
		for (int i = 0; i < n; i++) {
			
			if (target < arrayList.get(i)) break;
			target = target + arrayList.get(i);
			
		}
		
		System.out.println(target);
		
	}

}
