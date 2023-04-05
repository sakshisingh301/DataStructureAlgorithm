package com.company.TOP100;

public class ExcelSheetColumnTitle {

    public static String convertToTitle(int columnNumber) {

        StringBuilder stringBuilder=new StringBuilder();

        while(columnNumber>0)
        {
            columnNumber--;
            char curr= (char) ((columnNumber%26)+'A');
            stringBuilder.append(curr);
            columnNumber=columnNumber/26;

        }
        return stringBuilder.reverse().toString();

    }

    public static void main(String[] args) {

    }
}
