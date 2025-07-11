package day2.word;

import static java.lang.Character.isUpperCase;

public class Word {
    public static void checkWord(String word) {
        int upper = 0;
        int lower = 0;
        for (char ch : word.toCharArray()) {
            if (isUpperCase(ch)) {
                upper++;
            } else {
                lower++;
            }
        }
        if (upper > lower) System.out.println(word.toUpperCase());
        else System.out.println(word.toLowerCase());
    }

    public static void main(String[] args) {
        checkWord("MaTTrix");
    }

}

