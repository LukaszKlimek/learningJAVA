package com.szkoleniejava.przyklady.Zajecia2;

/**
 * Program wyświetlający liczby w zakresie od 1 do 100, o ile są one podzielne przez
 * 3, 5 albo 7
 * 
 * @author Bartosz Marcinkowski
 */
public class Program4
{
    public static void main(String[] args)
    {
        for(int i=1; i<=100; i++)
            if(i%3==0 || i%5==0 || i%7==0)
                System.out.print(i + ", ");
    }
}
