package day1.bitplusplus;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfStatements = sc.nextInt();

        int x = 0;
        for (int index = 0; index < noOfStatements; index++) {

            String operation = sc.next();
            if(operation.contains("++")){
                x++;
            }else x--;
        }
        System.out.println(x);
    }
}
