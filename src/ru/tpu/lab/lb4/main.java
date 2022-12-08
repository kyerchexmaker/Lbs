package ru.tpu.lab.lb4;

import java.beans.Expression;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        try
        {
            String Path = new File("src/ru/tpu/lab/lb4/expressions.txt").getAbsolutePath();
            File file = new File(Path);
            FileReader filereader = new FileReader(file);
            BufferedReader reader = new BufferedReader(filereader);
            String line = reader.readLine();
            while (line != null)
            {
                Expression(line);
                line = reader.readLine();
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    public static void Expression(String input){
        int left, right, result = 0;
        String sign;
        Pattern regex = Pattern.compile("(\\d*)([-+*/])(\\d*)");
        Matcher matches = regex.matcher(input);
        while (matches.find())
        {
            left = Integer.parseInt(matches.group(1));
            right = Integer.parseInt(matches.group(3));
            sign = matches.group(2);
            switch(sign)
            {
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
                case "*":
                    result = left * right;
                    break;
                case "/":
                    result = left / right;
                    break;
            }
            System.out.println(left + " " + sign + " " + right + " = " + result);
        }
    }
}



