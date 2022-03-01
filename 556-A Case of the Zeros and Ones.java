import java.util.*;

public class CaseOfTheZerosAndOnes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),one=0,zero=0;
		StringBuilder sb=new StringBuilder(sc.next());
        for(int i=0;i<n;i++) {
        	if(sb.charAt(i)=='1') {
        		one++;
        	}else {
        		zero++;
        	}
        }
        System.out.println(Math.abs(zero-one));
	}
	}

