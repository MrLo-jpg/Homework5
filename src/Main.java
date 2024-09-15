import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        System.out.println(Arrays.toString(ints));
        System.out.println();

        double[] doubles = new double[3];
        doubles[0] = 1.57;
        doubles[1] = 7.654;
        doubles[2] = 9.986;
        System.out.println(Arrays.toString(doubles));
        System.out.println();

        int[] box = {90, 80, 70, 67, 55};
        System.out.println(Arrays.toString(box));
        System.out.println();

        //Задание 2
        int[] ints1 = {55, 8, 97, 9, 78};
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i]);
            if (i < ints1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        //Задание 3
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        //Задача 4
        int[] ints2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < ints2.length; i++) {
            if (ints2[i] % 2 != 0) {
                ints2[i]++;
            }
        }
        System.out.println(Arrays.toString(ints2));


    }

}


