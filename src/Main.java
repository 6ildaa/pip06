import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args)   {
        int[] genArr = generateArray(100);
        printArray(genArr);

        int[] sortedArray = sort(genArr);
        printArray(sortedArray);

        int[] revArr = reverse(sortedArray);
        printArray(revArr);

        System.out.println(equalReverse(sortedArray, revArr));
    }



    public static int[] generateArray(int n) {
        int[] array = new int[100];
        Random random = new Random();

        for(int i = 0; i < 100; i++){
            array[i] = random.nextInt(100);
        }

        return array;
    }


    public static void printArray(int[] array){
        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    public static int[] sort(int[] array){
        int length = array.length;
        int[] result = array;

        for (int i = 0; i < length; i++){
            int key = result[i];
            int j = i -1;

            while(j >= 0 && result[j] > key){
                result[j+1] = result[j];
                j--;
            }
            result[j+1] = key;
        }

        return result;
    }

    public static int[] reverse(int[] array){
        int length = array.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++){
            result[i] = array[length - 1 - i];
        }

        return result;
    }

    public static boolean equalReverse(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        int length = array1.length;

        for (int i = 0; i < length; i++){
            if (array1[i] != array2[length - 1 - i])
                return false;
        }

        return true;
    }


}