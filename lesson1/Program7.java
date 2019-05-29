package com.szkoleniejava.przyklady.Zajecia2;

/**
 * Program wyświetlający liczby dwójkowe do 4096 pętlą while
 * 
 * @author Bartosz Marcinkowski
 */
public class Program7
{
    public static void main(String[] args)
    {
        int i = 0, wynik = 0;
        
        while(wynik < 4096)
        {
            wynik = (int) Math.pow(2,i);
            System.out.print(wynik + ", "); 
            i++;
        }
    }
}
