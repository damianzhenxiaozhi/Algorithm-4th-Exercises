package chapter1_3;

import com.sun.deploy.util.StringUtils;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;
import sun.nio.fs.WindowsFileSystemProvider;

public class E1_3_10 {
    public static void main(String[] args) {
        StdOut.println(infixToPostfix("( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )"));
    }

    public static String infixToPostfix(String exp) {
        String[] a = exp.split("\\s+");
        Stack<String> s = new Stack<>();

        StringBuilder res = new StringBuilder();
        for (String i : a) {
            if (i.equals("(")) ;
            else if (i.equals("+")) s.push(i);
            else if (i.equals("-")) s.push(i);
            else if (i.equals("*")) s.push(i);
            else if (i.equals("/")) s.push(i);
            else if (i.equals(")")) res.append(s.pop());
            else res.append(i);
        }

        return res.toString();
    }
}
