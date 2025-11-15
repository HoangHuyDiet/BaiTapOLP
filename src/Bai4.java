import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Bai4 {
    public static int Cong(int n) {
        int total = 0;
        for(int i = 1; i <= n ;i++) {
            if (i % 2 != 0) total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        reader.close();

        System.out.println(Cong(n));
    }
}