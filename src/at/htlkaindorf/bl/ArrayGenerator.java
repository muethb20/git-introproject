package at.htlkaindorf.bl;

import java.util.Random;

public class ArrayGenerator {
    public static int[] generateArray(int size){
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

}
