package com.java8.test.IHSTestPackage;



import java.util.regex.Pattern;

public class Q9
{

    public static void main(String[] args)
    {

        String regex = ".@.";

        Q9.compare("Hacker@Earth.com", regex);
        Q9.compare("a@N", regex);
        Q9.compare("Java@Program", regex);

    }

    public static void compare(String str, String regex)
    {
        if (str.matches(regex))
        {
            System.out.println(str + " matches");
        }
        else
        {
            System.out.println(str + " does not match");
        }
    }
}