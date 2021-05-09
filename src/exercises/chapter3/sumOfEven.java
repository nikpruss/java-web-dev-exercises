package exercises.chapter3;

import java.util.ArrayList;

public class sumOfEven {
    public static int sumEven(ArrayList<Integer> array){
        int sum = 0;
        for (int i : array){
            if (i % 2 == 0){
                sum +=i;
            }
        }
        return sum;
    }
}
