import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt(),w=sc.nextInt();
		int max=Math.max(y,w);
		if(max==1){
			System.out.println("1/1");
		}else if(max==2){
			System.out.println("5/6");
		}else if(max==3){
			System.out.println("2/3");
		}else if(max==4){
			System.out.println("1/2");
		}else if(max==5){
			System.out.println("1/3");
		}else{
			System.out.println("1/6");
		}
	}
}
