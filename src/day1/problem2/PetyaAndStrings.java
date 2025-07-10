package day1.problem2;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstGift = scanner.nextLine(), secondGift = scanner.nextLine();
        firstGift = firstGift.toLowerCase();
        secondGift=secondGift.toLowerCase();
        int result = firstGift.compareTo(secondGift);
        if(result == 0 ) System.out.println(0);
        else if (result > 0 ) System.out.println(1);
        else  System.out.println(0);
        scanner.close();
    }
}
