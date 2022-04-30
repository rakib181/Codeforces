import java.util.*;
public class SSS {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	String s=sc.next();
	char[] ch=s.toCharArray();	int sum=0,a=0,b=0;
	for(int i=0;i<ch.length;i++){
		sum+=(ch[i]-'a')+1;
	}
	a=sum;
	if((ch.length&1)==1){
		a-=Math.min((ch[0]-'a')+1,(ch[ch.length-1]-'a')+1);
	}
	b=sum-a;
	System.out.println(a>b?"Alice "+(a-b):"Bob "+(b-a));
	}
	}
}
