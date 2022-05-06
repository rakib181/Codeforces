import java.util.*;
import java.io.*;
public  class GamerHemose{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        //CODE HERE
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), h = sc.nextInt(), c = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (h % (arr[n - 1] + arr[n - 2]) == 0) {
                out.println(h / (arr[n - 1] + arr[n - 2]) * 2);
            } else if (h % (arr[n - 1] + arr[n - 2]) <= arr[n - 1]) {
                out.println((h / (arr[n - 1] + arr[n - 2]) * 2) + 1);
            } else {
                out.println((h / (arr[n - 1] + arr[n - 2]) * 2) + 2);
            }
        }
            out.close();
    }

        //-----------PrintWriter for faster output---------------------------------
        public static PrintWriter out;

        //-----------MyScanner class for faster input----------
        public static class MyScanner {
            BufferedReader br;
            StringTokenizer st;

            public MyScanner() {
                br = new BufferedReader(new InputStreamReader(System.in));
            }

            String next() {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int nextInt() {
                return Integer.parseInt(next());
            }

            long nextLong() {
                return Long.parseLong(next());
            }

            double nextDouble() {
                return Double.parseDouble(next());
            }

            String nextLine() {
                String str = "";
                try {
                    str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }

        }
    }
