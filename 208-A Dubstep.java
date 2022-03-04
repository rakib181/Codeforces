import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.next());
		for(int i=0;i<sb.length()-2;i++){
			if(sb.charAt(i)=='W'){
				if(sb.substring(i,i+3).equals("WUB")){
					sb.delete(i,i+3);
						sb.insert(i, ' ');
					i=-1;
				}
			}
		}
		System.out.println(sb);
	}
}

	
	
		
		
		
			
				
					
					
						
					
				
			
		
		
	

