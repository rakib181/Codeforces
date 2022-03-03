import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),cntx=0,cnt=0;
		StringBuilder sb=new StringBuilder(sc.next());
		for(int i=0;i<n;i++){
			if(sb.charAt(i)=='x'){
				cntx++;
				if(cntx==3){
					cnt++;
					cntx=2;
				}
			}else{
				cntx=0;
			}
		}
		System.out.println(cnt);
	}
}
