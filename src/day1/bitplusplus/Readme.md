# ➕ Bit++ — Codeforces 282A

![Language](https://img.shields.io/badge/Language-Java-blue)
![Platform](https://img.shields.io/badge/Platform-Codeforces-lightgrey)
![Difficulty](https://img.shields.io/badge/Difficulty-Beginner-brightgreen)
![Status](https://img.shields.io/badge/Solution-Solved-success)
![License](https://img.shields.io/badge/License-MIT-yellow)

---

## 🔗 Problem Link

👉 [Codeforces 282A - Bit++](https://codeforces.com/problemset/problem/282/A)

---

## 📝 Problem Description

Petya studies programming and has a variable `x` initialized to **0**. He will perform **`n` operations** on this variable.

Each operation is one of the following:
- `++X` or `X++` → increment `x` by 1
- `--X` or `X--` → decrement `x` by 1

---

## ✅ Task

After performing all operations, print the **final value of `x`**.

---

## 📥 Input Format

- The first line contains an integer `n` (1 ≤ n ≤ 150) — the number of operations.
- Each of the next `n` lines contains a single operation.

---

## 📤 Output Format

- Print a single integer — the final value of `x`.

---



---

## 🧠 Approach

1. Initialize variable `x = 0`.
2. Loop through all operations.
3. If the operation contains `"++"` → increment `x`.
4. If the operation contains `"--"` → decrement `x`.
5. Print the final value of `x`.

---

## 💻 Java Code

```java
import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // Number of operations
        int x = 0;              // Initial value

        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            if (operation.contains("++")) {
                x++;
            } else {
                x--;
            }
        }

        System.out.println(x);
    }
}

