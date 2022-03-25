/* INTERVIEW QUESTION 
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
     */


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerArray {

    public static void main(String[] args) throws InterruptedException {

        String s = "*-* ";
        String header = "SOLUTION TO INTERVIEW QUESTION PRACTICE 1 ";
        System.out.println(s.repeat(header.length()-10));
        System.out.println("|");
        System.out.println("\t\t\t" + header +  "\t\t\t");
        System.out.println("|");
        System.out.println(s.repeat(header.length()-10)+ "\n");
        Thread.sleep(1500);


        System.out.println("Hello. Please Enter the size of the array : ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();

        System.out.println("Please enter the set of numbers : ");

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
            array[i] = scanner.nextInt();

        System.out.println("Great ! Now Enter your target value : ");
        int target = scanner.nextInt();
       // if (Arrays.stream(array).anyMatch(x -> x == target))

        System.out.println(targetSumCheck(array,target));
    }

    public static String  targetSumCheck (int[] array, int target) {

        String response = "Sorry, no two numbers from the set did add up to the target value. ";

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target){
                response = "Number is among, so indice for sum is : " + i;
            }
            else {
                for (int j = i + 1 ; j < array.length ; j++) {
                    if (array[i] + array[j] == target)
                        response = "The indices of the numbers that sum up to " + target + " are : " + i + " and " + j;
                        }
            }
            }
        return response;
    }
    }
