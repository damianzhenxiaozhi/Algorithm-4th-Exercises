import edu.princeton.cs.algs4.StdOut;

import java.io.*;
import java.nio.charset.Charset;

/**
 * TODO
 *
 * @author fanzhen
 * @version 1.0
 * @date 2021/1/7
 */
public class Test {
    public static void main(String[] args) {
        try {
            FileInputStream is = new FileInputStream(new File("D:\\flag.txt"));
            byte[] data = new byte[1024];
            is.read(data);
            String s = new String(data, Charset.forName("UTF-8"));
            System.out.println(s);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
