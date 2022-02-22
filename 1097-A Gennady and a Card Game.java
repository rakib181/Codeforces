import java.util.*;

public class GennadyAndACardGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();int flag=0;
		List<String>list=new ArrayList<>();
		List<Character>list1=new ArrayList<>();
		for(int i=0;i<5;i++) {
			list.add(sc.next());
		}
		String result=String.join("", list);
        char[] ch=result.toCharArray();
        for(int i=0;i<result.length();i++) {
        	list1.add(ch[i]);
        }
        char[] ch1=s.toCharArray();
       for(int i=0;i<result.length();i++) {
    	   if((list1.get(i)==ch1[0]) || (list1.get(i)==ch1[1])) {
    		   flag=1;
    		   break;
    	   }
       }
       if(flag==1) {
    	   System.out.println("YES");
    	   
       }else {
    	   System.out.println("NO");
       }
       
	}

}
