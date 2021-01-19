import java.io.*;
import java.util.*;

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
        int n = r.nextInt();
        int x = 0, y = 0, z = 0;

        while (n-- >= 1) {
            x = x + r.nextInt();
            y = y + r.nextInt();
            z = z + r.nextInt();
        }

        if (x == 0 && y == 0 && z == 0) {
            pw.print("YES");
        } else {
            pw.print("NO");
        }

        pw.close();
    }
}
