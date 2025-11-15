import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Bai3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int Month = reader.nextInt();
        int Year = reader.nextInt();
        reader.close();
        int day;

        if (Month == 4 || Month == 6 || Month == 9 || Month == 11) {
            day = 30;
        }
        else if (Month == 2) {
            if  (Year % 4 == 0 || Year % 400 == 0) {
                day = 29;
            }
            else {
                day = 28;
            }
        }
        else {
            day = 31;
        }

        System.out.printf("Thang %d nam %d co %d ngay",Month, Year, day);
    }
}