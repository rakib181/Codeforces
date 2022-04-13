import java.util.*;
public class CoPrimeArray {
	static int isCoprime(int x,int y) {
		if(y==0) {
			return x;
		}
		return isCoprime(y,x%y);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		ArrayList<Integer>new_ans=new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			if(isCoprime(arr[i],arr[i+1])>1) {
				new_ans.add(arr[i]);
				new_ans.add(1);
			}else {
				new_ans.add(arr[i]);	
			}
		}
		new_ans.add(arr[n-1]);
		System.out.println(Math.abs(n-new_ans.size()));
		for(int f:new_ans) {
			System.out.print(f+" ");
		}
	}
}
