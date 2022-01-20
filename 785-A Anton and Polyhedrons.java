import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),max=0;
        for (int i=0;i<t;i++){
            String s=sc.next();
            if (s.equals("Tetrahedron")){
                max+=4;
            }
           else if (s.equals("Cube")){
                max+=6;
            }
           else if (s.equals("Octahedron")){
               max+=8;
            }
           else if (s.equals("Dodecahedron")){
               max+=12;
            }else
                max+=20;
        }
        System.out.println(max);
    }
}
