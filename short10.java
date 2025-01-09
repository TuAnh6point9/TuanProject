/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package week1;

/**
 *
 * @author LENOVO
 */
import java.util.Random;
import java.util.Scanner;

public class short10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of array: \n");
        int arraySize = scanner.nextInt();

        if (arraySize <= 0) {
            System.out.println("Array size must be a positive integer.");
            return;
        }
        int[] array = generateRandomArray(arraySize);

        System.out.print("Enter search value: \n");
        int searchValue = scanner.nextInt();

        System.out.print("The array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int foundIndex = performLinearSearch(array, searchValue);

        if (foundIndex != -1) {
            System.out.println("Found " + searchValue + " at index: " + foundIndex);
        } else {
            System.out.println(searchValue + " not found in the array.");
        }

        scanner.close();
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        return array;
    }

   
    private static int performLinearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i; 
            }
        }
        return -1; 
    }
}