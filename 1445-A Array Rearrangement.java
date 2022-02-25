
import java.util.*;
public class ArrayRearrangment {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int q=sc.nextInt();
				while(q-->0)
				{
					int n=sc.nextInt(),x=sc.nextInt(),flag=0;
					List<Integer>list=new ArrayList<>();
					List<Integer>list1=new ArrayList<>();
					for(int i=0;i<n;i++){
						list.add(sc.nextInt());
					}
					for(int i=0;i<n;i++){
						list1.add(sc.nextInt());
					}
					Collections.sort(list);
					Collections.reverse(list1);
					for(int i=0;i<n;i++){
						 if(list.get(i)+list1.get(i)>x) { flag=1; break; }	
				}
					if(flag==1) {
						System.out.println("NO");
					}else {
						System.out.println("YES");
					}
			}
				
		}
}
