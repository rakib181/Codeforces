import java.util.*;

public class DoorsAndKeys {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0) {
			String s=sc.next();
			char[] ch=s.toCharArray();		
			List<Character>list=new ArrayList<>();
			List<String>list1=new ArrayList<>();
			for(int i=0;i<s.length();i++) {
				list.add(ch[i]);
			}
			for(int i=0;i<list.size()-1;i++) {
				if(list.get(i)=='r') {
					for(int j=i+1;j<list.size();j++) {
						if(list.get(j)=='R') {
						list1.add("ok");	
						}
					}
				}
				if(list.get(i)=='b') {
					for(int j=i+1;j<list.size();j++) {
						if(list.get(j)=='B') {
						list1.add("ok");	
						}
					}
			}
				if(list.get(i)=='g') {
					for(int j=i+1;j<list.size();j++) {
						if(list.get(j)=='G') {
						list1.add("ok");	
						}
					}
			
		}
}
			if(list1.size()==3) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
}
	}
}
