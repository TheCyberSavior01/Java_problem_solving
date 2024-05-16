package org.limon;

public class ReverseString {
    String reverse(String inputString) {
        char[] inputStrArr = inputString.toCharArray();
        char[] outputStrArr = new char[inputStrArr.length];
        int i = inputStrArr.length-1;
        int j = 0;

        while(j < inputStrArr.length && i >= 0) {
            outputStrArr[j] = inputStrArr[i];
            j++;
            i--;
        }

        return new String(outputStrArr);
    }
}
