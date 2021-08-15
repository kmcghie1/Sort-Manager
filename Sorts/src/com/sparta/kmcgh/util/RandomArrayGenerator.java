package com.sparta.kmcgh.util;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;



public class RandomArrayGenerator {

    public int[] generateArray(int amount){
        Random random = new Random();
        int[] randomArray = new int[amount];

        for(int i = 0; i < amount; i++){
            randomArray[i] = random.nextInt(100);
        }

        System.out.println("Generated Array: " + Arrays.toString(randomArray));
        return randomArray;
    }

}
