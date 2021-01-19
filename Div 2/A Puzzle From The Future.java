import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

public class Template {
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() { // reads in the next string
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() { // reads in the next int
            return Integer.parseInt(next());

        }

        public long nextLong() { // reads in the next long
            return Long.parseLong(next());
        }

        public double nextDouble() { // reads in the next double
            return Double.parseDouble(next());
        }
    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = r.nextInt();
        while (t-- > 0) {
            int n = r.nextInt();
            char[] b = r.next().toCharArray();
            StringBuilder a = new StringBuilder();
            int prev = -1;
            for (int i = 0; i < n; i++) {
                int int_b = b[i] - '0';
                if (int_b + 1 != prev) {
                    a.append('1');
                    prev = int_b + 1;
                } else {
                    a.append('0');
		    prev = int_b;
                }
            }
            pw.println(a.toString());
        }
        pw.close();
    }
}
