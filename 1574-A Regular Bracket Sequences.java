import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s="";
			for(int i=0;i<n;i++){
				for(int x=0;x<i;x++){
					s+='(';
				}
				for(int x=0;x<i;x++){
					s+=')';
				}
				for(int x=0;x<n-i;x++){
					s+='(';
				}
				for(int x=0;x<n-i;x++){
					s+=')';
				}
				System.out.println(s);
				s="";
			}
		}
	}
}
