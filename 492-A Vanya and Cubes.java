import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0,d=0,e=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			c+=i;
			d+=c;
			e++;
			if((n-d)<c+i+1){
				System.out.println(e);
				break;
			}
		}
	}
}
