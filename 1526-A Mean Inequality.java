import java.util.*;

public class MeanInequality {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[] arr=new int[2*n];
			for(int i=0;i<2*n;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			List<Integer>yo=new ArrayList<>();
			int i=0,y=(2*n)-1;
			for(int k=0;k<=(2*n)-1;k++) {
				if((k&1)==0) {
					yo.add(arr[i]);
					i++;
				}else {
					yo.add(arr[y]);
					y--;
				}
			}
			for(Integer x:yo) {
				System.out.print(x+" ");
			}
			System.out.println();
		}

	}

}
