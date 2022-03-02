import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),min=0;
		String s=sc.next(),t=sc.next();
		char[] c=s.toCharArray();
		char[] h=t.toCharArray();
		for(int i=0;i<n;i++){
			min+=Math.min(Math.abs(Character.getNumericValue(c[i])-Character.getNumericValue(h[i])),(Math.min(10-Character.getNumericValue(c[i]),10-Character.getNumericValue(h[i]))+Math.min(0+Character.getNumericValue(c[i]),0+Character.getNumericValue(h[i]))));
		}
		System.out.println(min);
	}
}
