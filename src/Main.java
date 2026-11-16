import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int average;
        int userInt = 0;
        int userInt2 = 0;
        String trash;
        boolean done = false;
        int counter = 0;
        int min;
        int max;
        int[] dataPoints = new int[100];
        for (int i = 0; i < 100; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < 99; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println(dataPoints[99]);
        for (int i = 0; i < 100; i++) {
            sum += dataPoints[i];
        }
        average = sum / 100;
        System.out.println("The sum of the array dataPoints is " + sum + " and the average of the array is " + average);
        do {
            System.out.print("Input a value between 1 and 100: ");
            if (in.hasNextInt()) {
                userInt = in.nextInt();
                in.nextLine();
                if (userInt >= 1 && userInt <= 100) {
                    done = true;
                }
                else {
                    System.out.println("You entered: " + userInt);
                    System.out.println("Please enter a number within the range!");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid value!");
            }
        } while (!done);
        for (int i = 0; i < 100; i++) {
            if (userInt == dataPoints[i]) {
                counter++;
            }
        }
        System.out.println("Your value " + userInt + " was found " + counter + " times within the array dataPoints." );
        done = false;
        do {
            System.out.print("Input a value between 1 and 100: ");
            if (in.hasNextInt()) {
                userInt2 = in.nextInt();
                in.nextLine();
                if (userInt2 >= 1 && userInt2 <= 100) {
                    done = true;
                }
                else {
                    System.out.println("You entered: " + userInt2);
                    System.out.println("Please enter a number within the range!");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid value!");
            }
        } while (!done);
        for (int i = 0; i < 100; i++) {
            if (userInt2 == dataPoints[i]) {
                System.out.println("Your value " + userInt2 + " was found in the array dataPoints at index " + i);
                break;
            }
            if (i == 99) {
                System.out.println("Your value " + userInt2 + " was not found in the array dataPoints");
            }
        }
        min = dataPoints[0];
        max = dataPoints[0];
        for (int i = 0; i < 100; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value in the array is " + min);
        System.out.println("The maximum value in the array is " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[]) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < 100; i++) {
            sum += values[i];
        }
        average = sum / values.length;
        return average;
    }
}
