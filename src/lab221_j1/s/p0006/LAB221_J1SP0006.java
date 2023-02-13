/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab221_j1.s.p0006;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author phangiabao
 */
public class LAB221_J1SP0006 {

    private static final Scanner sc = new Scanner(System.in);

    //check input a number integer
    private static int checkInt() {
        //require user input again until correct
        while (true) {
            int result = Integer.parseInt(sc.nextLine().trim());
            //require user  input a positive decimal number
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

    //allow user input size of array and check valuadation
    private static int inputSize() {
        System.out.print("Enter number of array: ");
        int n = checkInt();
        return n;
    }

    private static int inputSearch() {
        System.out.print("Enter Search Value: ");
        int k = checkInt();
        return k;
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
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    private static int binarySearch(int[] a, int k, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (a[middle] == k) {
            return middle;
        } else if (a[middle] > k) {
            return binarySearch(a, k, left, middle - 1);
        } else {
            return binarySearch(a, k, middle + 1, right);
        }
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
        int k = inputSearch();
        int[] a = new int[n];
        randomValue(a, n);
        sortArrayByBubbleSort(a);
        print(a);
        if (binarySearch(a, k, 0, n - 1) == -1) {
            System.out.println("\nNot Found!!!");
        } else {
            System.out.println("\nFound " + k + " at index: " + binarySearch(a, k, 0, n - 1));
        }

    }

}
