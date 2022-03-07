import java.util.*;

public class SpecialPermutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),flag=0;
			List<Integer>list=new ArrayList<>();
			List<Integer>list1=new ArrayList<>();
			for(int i=n;i>=1;i--) {
				list.add(i);
			}if(a>b) {
				list1.add(a);
				for(int i=0;i<n;i++) {
					if(list1.size()<n/2) {
					if(!list1.contains(list.get(i))&& list.get(i)!=a && list.get(i)!=b) {
						if(list.get(i)<a) {
							flag=1;
						}
					list1.add(list.get(i));
					}
				 }
				}
				list1.add(b);
				for(int i=0;i<n;i++) {
					if(list1.size()<n) {
					if(!list1.contains(list.get(i))&& list.get(i)!=a && list.get(i)!=b) {
						if(list.get(i)>b) {
							flag=1;
						}
					list1.add(list.get(i));
					}
					}
				}
				if(flag==0) {
					for(Integer x:list1) {
						System.out.print(x+" ");
					}
					System.out.println();
				}else {
					System.out.println("-1");
				}
			}else {
				list1.add(a);
				for(int i=0;i<n;i++) {
					if(list1.size()<n/2) {
					if(!list1.contains(list.get(i))&& list.get(i)!=a && list.get(i)!=b) {
						if(list.get(i)<a) {
							flag=1;
						}
					list1.add(list.get(i));
					  }
					}
				}
				list1.add(b);
				for(int i=0;i<n;i++) {
					if(list1.size()<n) {
					if(!list1.contains(list.get(i))&& list.get(i)!=b && list.get(i)!=a) {
						if(list.get(i)>b) {
							flag=1;
						}
					list1.add(list.get(i));
					 }
					}
				}
				if(flag==0) {
					for(Integer x:list1) {
						System.out.print(x+" ");
					}
					System.out.println();
				}else {
					System.out.println("-1");
				}
			  }
			}
		}
	}
