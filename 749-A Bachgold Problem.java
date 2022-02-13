import java.util.Scanner;

public class BachgoldProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),c=0;
		if(n%2==0) {
			System.out.println(n/2);
		for(int k=1;k<=n/2;k++) {
			System.out.print("2"+" ");
		}
	}else {
		System.out.println(n/2);
		for(int x=1;x<n/2;x++) {
			System.out.print("2"+" ");
		}
		System.out.print("3");
	}
		System.out.println();
	}
}
