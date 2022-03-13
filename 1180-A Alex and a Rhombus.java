/*----->Hope Can Set You free<-----*/
import java.util.*;
public class AlexAndARhombus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),res=1;
		for(int i=1,k=4;i<n;i++,k+=4){
			res+=k;	
		}
		System.out.println(res);
	}
}
