 import java.util.Scanner;

public class DigitsSequenceDividing {
	void solve(String x) {
		if(x.length()==2 && x.charAt(0)>=x.charAt(1)) {
			System.out.println("NO");
		}else {
			System.out.println("YES"+"\n"+"2"+"\n"+x.charAt(0)+" "+x.substring(1,x.length()));
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			String s=sc.next();
			DigitsSequenceDividing obj=new DigitsSequenceDividing();
			obj.solve(s);
		}
	}
}
