/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class NoldbachProblem {
	static List<Integer>pri=new ArrayList<>();
 public static void yoSeive(int n) {
	 boolean[] prime=new boolean[n+1];
	 for(int i=2;i<=n;i++) {
		 prime[i]=true;
	 }
	 for(int i=2;i*i<=n;i++) {
		 if(prime[i]==true) {
			 for(int j=2*i;j<=n;j+=i) {
				 prime[j]=false;
			 }
		 }
	 }
	 for(int i=2;i<=n;i++) {
		 if(prime[i]==true) {
			 pri.add(i);
		 }
	 }
 }
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt(),k=sc.nextInt(),cnt=0;
	 yoSeive(n);
	 if(k==0) {
		 System.out.println("YES");
		 return;
	 }
	 for(int i=0;i<pri.size()-1;i++) {
		if(pri.contains((pri.get(i)+pri.get(i+1))+1)) {
			cnt++;
		}
		if(cnt==k) {
			System.out.println("YES");
			return;
		}
	 }
	 System.out.println("NO");
 }
}
