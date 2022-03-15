/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class AAndBAndCompilationErrors {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt(),yeh=0,yo=0,yes=0;
		int[] Cerr=new int[n];int bugfix[]=new int[n-1];int bugfixed[]=new int[n-2];
		for(int i=0;i<n;i++){
			Cerr[i]=sc.nextInt();
			yeh+=Cerr[i];
		}
		for(int i=0;i<n-1;i++){
			bugfix[i]=sc.nextInt();
			yo+=bugfix[i];
		}
		for(int i=0;i<n-2;i++){
			bugfixed[i]=sc.nextInt();
			yes+=bugfixed[i];
		}
		System.out.println((yeh-yo)+"\n"+(yo-yes));
	}
}
