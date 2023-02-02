package content;

public class TheArray {

    public static void change(int number) {
        number += 10;
    }
//Gagan's code
    public static void change(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
            System.out.println("Elements are: " + arr[i]);
        }
    }

    public static String printArray(int[] arr) {
        String str = new String();
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + "\t";
        }
        return str;
    }
    
    public static int[] startArray(int size){
        int []numbers = new int[size];
         for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }
        return numbers;
    }

}
