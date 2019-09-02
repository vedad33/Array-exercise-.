package newpackage;

import java.util.Arrays;

public class NewClass1 {

    public static void main(String[] args) {

        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    System.out.println("Element " + array[i] + "\trepeat 2 times");

                }

            }

        }
        int d = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                j++;
            }

            if (array[i] < 0) {
                d++;

            }

        }
        int k = d;
        int[] positive = new int[j];
        int y = 0;
        int z = 0;

        int[] negative = new int[k];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {

                positive[y] = array[i];
                y++;

            }
            if (array[i] < 0) {
                negative[z] = array[i];
                z++;
            }

        }

        System.out.println(Arrays.toString(negative));
        System.out.println(Arrays.toString(positive));
    }
}
