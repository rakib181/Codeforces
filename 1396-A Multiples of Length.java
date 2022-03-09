import java.util.*;
public class MultipleOfLenngth{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}	
		if(n==1){
			System.out.println("1"+" "+"1"+"\n"+"0"+"\n"+"1"+" "+"1"+"\n"+"0"+"\n"+"1"+" "+"1"+"\n"+-arr[0]);
		}else{
			System.out.print("1"+" "+n+"\n");
			for(int i=0;i<n-1;i++){
				System.out.print(((long)-n*(arr[i]))+" ");
			}
			System.out.print("0");
			System.out.println("\n"+"1"+" "+(n-1)+" ");
			for(int i=0;i<n-1;i++){
				System.out.print((long)arr[i]*(n-1)+" ");
			}
				System.out.println("\n"+n+" "+n+"\n"+-arr[n-1]);
			
		}
	}
}
