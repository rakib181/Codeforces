import java.util.Scanner;

public class GregsWorkout {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),biceps=0,chest=0,back=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(i%3==0) {
				chest+=arr[i];	
			}
			else if(i%3==1) {
				biceps+=arr[i];
			}else{
				back+=arr[i];
			}
		}
		if(chest>biceps && chest>back) {
			System.out.println("chest");
			
		}else if(biceps>chest && biceps>back) {
			System.out.println("biceps");
			
		}else {
			System.out.println("back");
			
		}
	}
}
