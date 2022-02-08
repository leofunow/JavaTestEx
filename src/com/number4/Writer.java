package com.number4;

import java.util.ArrayList;

public class Writer {
    private String[] letters = {
            " **** |   *  | **** |***** |*    *|******|******|******|******|******|",
            "*    *|  **  |*    *|     *|*    *|*     |*     |    * |*    *|*    *|",
            "*    *| * *  |     *|  **  |******|******|******|   *  | **** |******|",
            "*    *|   *  |    * |    * |     *|     *|*    *|  *   |*    *|     *|",
            "*    *|   *  |  *   |     *|     *|     *|*    *|  *   |*    *|     *|",
            " **** | *****|******|***** |     *|******|******|  *   |******|***** |",
    };

    public void writeNumber(int number) {
        ArrayList<Integer> numArr = new ArrayList<Integer>();
        int max = 0;
        while (number >= 1) {
            numArr.add(number % 10);
            if (number % 10 > max)
                max = number % 10;
            number /= 10;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = numArr.size() - 1; j >= 0; j--) {
                if (numArr.get(j) == max)
                    System.out.print(letters[i]
                            .substring(numArr.get(j) * 7, numArr.get(j) * 7 + 6)
                            .replace("*", Integer.toString(max)) + "  ");
                else
                    System.out.print(letters[i]
                            .substring(numArr.get(j) * 7, numArr.get(j) * 7 + 6) + "  ");
            }
            System.out.println();
        }
    }

}
