package com.szkoleniejava.przyklady.Zajecia2;

/**
 * Program wyświetlający zawartość tablicy args na dwa sposoby
 * (w tym od końca)
 * 
 * @author Bartosz Marcinkowski
 */
public class Program5
{
    public static void main(String args[])
    {
        for(int i=args.length-1; i>=0; i--)
            System.out.print(args[i] + ", ");
       
        for (String elementTablicy : args) 
            System.out.print(elementTablicy + ", ");
    }
}
