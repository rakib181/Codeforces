import java.util.*;

public class SortTheArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),pos=0,idx=0,idxf=0,posf=0;
		int[] arr=new int[n],arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			arr1[i]=arr[i];
		}
		Arrays.sort(arr1);
		if(Arrays.equals(arr, arr1)) {
			System.out.print("yes"+"\n"+"1"+" "+"1");
		}else {
		     for(int i=n-1;i>=0;i--) {
		    	 if(arr[i]!=arr1[i]) {
		    		 idx=i;
		    		 break;
		    	 }
		     }
		     for(int i=0;i<n;i++) {
		    	 if(arr[i]!=arr1[i]) {
		    		 idxf=i;
		    		 break;
		    	 }
		     }
		     pos=idx;posf=idxf;
		     for(int i=posf;i<pos;i++) {
		    	 int tmp=arr[i];
		    	 arr[i]=arr[pos];
		    	 arr[pos]=tmp;
		    	 pos--;
		     }
		    if(Arrays.equals(arr, arr1)) {
		    	System.out.print("yes"+"\n"+(idxf+1)+" "+(idx+1));
		    }else {
		    	System.out.println("no");
		    }
			
		}
	}

}
