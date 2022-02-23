import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class AntiFibonacciPermutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			List<Integer>list=new ArrayList<>();
			List<Integer>list2=new ArrayList<>();
			for(int i=1;i<=n;i++) {
				list.add(i);
			}
			Collections.reverse(list);
			list2.addAll(list);
			for(int i=n-1;i>0;i--) {
				Collections.swap(list, i, i-1);
				list2.addAll(list);
			}
			List<Integer> list3 = new ArrayList<Integer>(list2);
			  AtomicInteger counter = new AtomicInteger();
			  final Collection<List<Integer>> partitionedList = 
                   list3.stream().collect(Collectors.groupingBy(i -> counter.getAndIncrement() / n))
                          .values(); 
				  for(List<Integer> x : partitionedList) {
					  for(Integer  y: x) {
					  System.out.print(y+" ");
					     }
					  System.out.println();
					  }
		           }	
			}
}

