import java.util.*;
public class CarrotCakes {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),t=sc.nextInt(),k=sc.nextInt(),d=sc.nextInt(),t1=0,t2=d,h=n,c=0;
	while(n>0){
		t1+=t;
		n-=k;
	}
	 c=d/t;
	 h-=c*k;
	while(h>0){	
		t2+=t;
		h-=(2*k);
	}
	if(t2<t1){
		System.out.println("YES");
	}else{
		System.out.println("NO");
	}
	}
}
