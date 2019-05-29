package com.szkoleniejava.przyklady.Zajecia2;

/**
 * Program sprawdzający, czy rok podany jako parametr przy wywołaniu
 * jest przestępny czy nie
 * 
 * @author Bartosz Marcinkowski
 */
public class Program2
{
    public static void main(String[] args)
    {
        if(args.length == 1)
        {
            int rok = Integer.parseInt(args[0]);

            if(((rok%4 == 0) && (rok%100 != 0)) || (rok%400 == 0))
            {
                System.out.println("Rok " + rok + " jest przestępny.");
            }
            else
            {
                System.out.println("Rok " + rok + " nie jest przestępny.");
            }
        }
    }
}
