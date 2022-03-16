import java.util.Scanner;

public class PickyEaters {
	public static boolean isPossible(int x,int y) {
		if(x>=y) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt();
		if(isPossible(x,y)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

	}

}
