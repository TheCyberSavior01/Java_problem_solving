package org.limon;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    boolean isArmstrongNumber(int numberToCheck) {
        int tempNumber = numberToCheck;
        int totalSum = 0;
        List<Integer> numberToCheckList = new ArrayList<Integer>();

        while (tempNumber > 0) {
            numberToCheckList.add(tempNumber % 10);
            tempNumber /= 10;
        }

        for (int number : numberToCheckList) {
            totalSum += Math.pow(number, numberToCheckList.size());
        }

        return numberToCheck == totalSum ? true : false;
    }
}
