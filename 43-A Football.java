import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),c=0;String s="";
		String[] yo=new String[n];
		for(int i=0;i<n;i++){
			yo[i]=sc.next();
		}
		Arrays.sort(yo);
		s=yo[0];
		for(int i=0;i<n;i++){
		   if(yo[i].equals(s)){
		   	c++;
		   }else{
		   	break;
		   }
		}
		if((n-c)>c){
			System.out.println(yo[n-1]);
		}else{
			System.out.println(yo[0]);
		}
		}
	}
