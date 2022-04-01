import java.util.*;
public class MakeItDivisibleBy25 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		String s=sc.next();int n=s.length(),k=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if((10*(ch[i]-'0')+(ch[j]-'0'))%25==0){
					k=n-i-2;
				}
			}
		}
		System.out.println(k);
		}	
	}
}
