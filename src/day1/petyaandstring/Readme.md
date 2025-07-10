# 🧩 Petya and Strings — Codeforces 112A

![Language](https://img.shields.io/badge/Language-Java-blue)
![Platform](https://img.shields.io/badge/Platform-Codeforces-lightgrey)
![Difficulty](https://img.shields.io/badge/Difficulty-Beginner-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)
![License](https://img.shields.io/badge/License-MIT-yellow)

---

## 🔗 Problem Link

👉 [Codeforces 112A - Petya and Strings](https://codeforces.com/problemset/problem/112/A)

---

## 📝 Problem Description

Petya loves comparing strings. One day, he received two strings and wants to compare them **lexicographically** without considering case (i.e., in a **case-insensitive** way).

---

### ✅ Task

Given two strings `a` and `b` of **equal length**, determine:

- Print `-1` if `a` is lexicographically **less than** `b`
- Print `1` if `a` is lexicographically **greater than** `b`
- Print `0` if `a` and `b` are **equal**

---

## 📥 Input Format

- Two strings `a` and `b`, consisting of **uppercase and lowercase** Latin letters.
- Both strings have **equal length**, and length lies in `1 ≤ |a| = |b| ≤ 100`.

---

## 📤 Output Format

- A single integer:
    - `-1`, `0`, or `1` depending on the comparison result.

---






## 🧠 Approach

1. Convert both strings to **lowercase** to ignore case differences.
2. Use Java's built-in `compareTo()` method to compare the two strings.
3. If the result is:
    - Less than 0 → Print `-1`
    - Greater than 0 → Print `1`
    - Equal to 0 → Print `0`

---

## 💻 Java Code

```java
import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();

        // Convert both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        int result = a.compareTo(b);

        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
