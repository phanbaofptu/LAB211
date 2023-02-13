/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab211_j1.s.p0001;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author phangiabao
 */
public class LAB211_J1SP0001 {

    private static final Scanner sc = new Scanner(System.in);

    //check input a number integer
    private static int checkInt() {
        //require user input again until correct
        while (true) {
            int result = Integer.parseInt(sc.nextLine().trim());
            if (result < 0) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            } else {
                try {
                    return result;
                } catch (NumberFormatException e) {
                    System.err.println("Please input number");
                    System.out.print("Enter again: ");
                }
            }
        }
    }

    //allow user input size of array and check valudation
    private static int inputSize() {
        System.out.print("Enter number of array: ");
        int n = checkInt();
        return n;
    }

    //random integer in number range input
    private static int[] randomValue(int[] a, int n) {
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(n);
        }
        return a;
    }

    private static void sortArrayByBubbleSort(int[] a) {
        System.out.print("Unsorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    //display array after sort
    private static void print(int[] a) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = inputSize();
        int[] a = new int[n];
        randomValue(a, n);
        sortArrayByBubbleSort(a);
        print(a);
    }

}
