package day1.bitplusplus;
import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstGift = scanner.nextLine(), secondGift = scanner.nextLine();
        firstGift = firstGift.toLowerCase();
        secondGift=secondGift.toLowerCase();
        int result = firstGift.compareTo(secondGift);
        if(result == 0 ) System.out.println(0);
        else if (result > 0 ) System.out.println(1);
        else  System.out.println(-1);
        scanner.close();
    }
}
