import java.util.*;
public class ThreePilesOfCandies{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),sum=0;
		sum=a+b+c;
		System.out.println(sum/2);
		}	
	}
}
