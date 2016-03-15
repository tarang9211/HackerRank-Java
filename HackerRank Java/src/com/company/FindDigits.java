package com.company;

import java.util.*;
import java.util.stream.Collectors;
/**
 * Created by taranghirani on 3/14/16.
 */
public class FindDigits {
    public static void main(String[] args) {

        FindDigits obj = new FindDigits();
        Scanner input = new Scanner(System.in);
        int attempts = input.nextInt();
        for(int i = 0; i < attempts; i++){
            int number = input.nextInt();
            System.out.println(obj.factors(number));
        }

    }

    public int factors(int number){

        List<String> digits = Arrays.asList(Integer.toString(number).split(""));
        List<String> result = digits.stream()
                .filter(x -> !(x.equals("0")) && number % Integer.parseInt(x) == 0)
                .collect(Collectors.toList());
        return result.size();
    }

}
