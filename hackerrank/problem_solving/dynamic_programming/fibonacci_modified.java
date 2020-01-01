import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static BigInteger fibonacciModified(int t1, int t2, int n) {
    BigInteger result, i1, i2;
    String a, b;
    a = Integer.toString(t1);
    b = Integer.toString(t2);

        result=new BigInteger("0");
        i1=new BigInteger(a);
        i2=new BigInteger(b);
        
        for(int i= 0;i<n-2;i++){
        
        result = i1.add(i2.multiply(i2));
            i1 = i2;
            i2 = result;
        
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        BigInteger result = fibonacciModified(t1, t2, n);
        System.out.println(result);
        in.close();
    }
}

