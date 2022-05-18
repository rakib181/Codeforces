import java.io.*;
import java.util.StringTokenizer;

public class CheckingCalender {
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));
        String[] day=new String[]{"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        String day1=sc.next(),day2=sc.next();int idx1=0,idx2=0;
        for(int i=0;i<7;i++){
            if(day[i].equals(day1)){
                idx1=i;
            }
            if(day[i].equals(day2)){
                idx2=i;
            }
        }
        out.println((idx1+31)%7==idx2 || (idx1+30)%7==idx2 || (idx1+28)%7==idx2 ? "YES":"NO");
        out.flush();
        out.close();
    }
    public static PrintWriter out;
    public static class MyScanner{
        BufferedReader br;
        StringTokenizer st;
        MyScanner(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st==null || !st.hasMoreElements()){
                try {
                    st=new StringTokenizer(br.readLine());
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
    }
}
