import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDifference{
    public static void main(String[] args) {
        int[] array1 = {4, 22, 5, 4, 2, 5};
        int[] array2 = {3, 0, 2, 4 ,5, 3};
        System.out.println("First array: " + Arrays.toString(array1));
        System.out.println("Second array: " + Arrays.toString(array2));
        System.out.println("Array difference: " + differenceArray(array1, array2));
    }

    public static ArrayList<Integer> differenceArray(int[] a1, int[] a2) {
        ArrayList<Integer> res = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < 1) {
            throw new RuntimeException("One of the array is empty.");
        }
        if (min < max) {
            throw new RuntimeException("Arrays are not equal in length.");
        }
        for (int i = 0; i < min; i++) {
            res.add(a1[i] - a2[i]);
        }
        return res;
    }
}