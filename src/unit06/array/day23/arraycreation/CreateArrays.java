package unit06.array.day23.arraycreation;

public class CreateArrays {
    public static void main(String[] args) {
        int[] numberArray = new int[5];
        String[] stringArray = new String[3];
        double[] doubleArray = new double[10];
        boolean[] booleansArray = new boolean[7];

        /*how to update and reach the elements*/

        numberArray[2] = 30;
        System.out.println(numberArray[2]);
        numberArray[0] = numberArray[2]*3;
        System.out.println(numberArray[0]);
        System.out.println(numberArray[1]);

        /*how to get the length*/
        System.out.println(booleansArray.length);

        doubleArray[1] = 33.5;
        doubleArray[5] = doubleArray[1]/2;
        System.out.println(doubleArray[1]);
        System.out.println(doubleArray[5]);

        doubleArray[doubleArray.length-1] = 100;
        System.out.println(doubleArray[doubleArray.length-1]);

        /*it will throw array out of exception*/
        /*doubleArray[doubleArray.length-1] = 100;*/


    }
}
