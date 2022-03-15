/*----->Hope Can Set You Free<-----*/
import java.util.*;
public class AAndBAndChess{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int white=0,black=0;
	Map<Character,Integer>mp=new HashMap<>();
	mp.put('Q',9);
	mp.put('R',5);
	mp.put('B',3);
	mp.put('N',3);
	mp.put('P',1);
	mp.put('q',9);
	mp.put('r',5);
	mp.put('b',3);
	mp.put('n',3);
	mp.put('p',1);
		for(int i=0;i<8;i++){
StringBuilder sb=new StringBuilder(sc.next());
  for(int j=0;j<8;j++){
  	if(sb.charAt(j)=='Q'){
  		white+=mp.get('Q');
  	}else if(sb.charAt(j)=='R'){
  		white+=mp.get('R');
  	}else if(sb.charAt(j)=='B'){
  		white+=mp.get('B');
  	}else if(sb.charAt(j)=='N'){
  		white+=mp.get('N');
  	}else if(sb.charAt(j)=='P'){
  		white+=mp.get('P');
  	}else if(sb.charAt(j)=='q'){
  		black+=mp.get('q');
  	}else if(sb.charAt(j)=='r'){
  		black+=mp.get('r');
  	}else if(sb.charAt(j)=='b'){
  		black+=mp.get('b');
  	}
  	else if(sb.charAt(j)=='n'){
  		black+=mp.get('n');
  	}
  	else if(sb.charAt(j)=='p'){
  		black+=mp.get('p');
  }
		}
		}
		if(white==black){
			System.out.println("Draw");
		}else if(white>black){
			System.out.println("White");
		}else{
			System.out.println("Black");
		}
	}
}
