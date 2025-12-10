package sortInteger;

import java.util.*;

public class MainProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        String[] input = sc.nextLine().split(" ");
        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        System.out.print("Choose algorithm (quick/bubble): ");
        String algo = sc.nextLine().trim().toLowerCase();

        if (algo.equals("bubble")) {
            BubbleSort.bubbleSort(numbers);
        } else if (algo.equals("quick")) {
            QuickSort.quickSort(numbers, 0, numbers.length - 1);
        } else {
            System.out.println("Invalid algorithm");
            return;
        }

        System.out.println("Sorted result: " + Arrays.toString(numbers));
    }
}

