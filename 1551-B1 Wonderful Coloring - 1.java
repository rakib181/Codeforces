/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class WonderfulColoring1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		String s=sc.next();int red=0,green=0,k=0;
		Map<Character,Integer>mp=new HashMap<>();
		for(int i=0;i<s.length();i++){
			if(!mp.containsKey(s.charAt(i))){
				mp.put(s.charAt(i),1);
			}else{
				mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
			}
		}
	for(char key:mp.keySet()){
		if(mp.get(key)==1){
			if((k&1)==0){
				red++;k++;
			}else{
				green++;k++;
			}
		}else{
			red++;green++;
		}
	}
	if(red!=green || (s.length()&1)==1){
		System.out.println(red-(red-green));
	}else{
		System.out.println(red);
	}
		}	
	}
}
