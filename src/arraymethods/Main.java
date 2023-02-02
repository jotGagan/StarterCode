package arraymethods;

import content.TheArray;
import java.awt.BorderLayout;

public class Main {

    public static void main(String[] args) {
        int digit = 1;
        TheArray.change(digit);
        System.out.println("Number is : " + digit);

        int[] digits = {1, 2, 3};
        TheArray.change(digits[0]);
        System.out.println("digits[0] is : " + digits[0]);

        TheArray.change(digits);

        System.out.println("Elements: " + TheArray.printArray(digits));

        int[] nums = TheArray.startArray(5);
        System.out.println("Elements are: " + TheArray.printArray(nums));

    }

}
