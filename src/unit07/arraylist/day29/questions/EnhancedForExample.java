package unit07.arraylist.day29.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class EnhancedForExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        for (int num :
                numbers) {
            System.out.println(num);
        }
    }
}
