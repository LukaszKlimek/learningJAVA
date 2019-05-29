package com.szkoleniejava.przyklady.Zajecia2;

/**
 * Pętla for wyświetlająca po przecinkach co trzecią liczbę naturalną w zakresie od 1 do 100
 * (z likwidacją zbędnego przecinka na końcu)
 * 
 * @author Bartosz Marcinkowski
 */
public class Program3
{
    public static void main(String[] args)
    {
        for(int i=1; i<=100; i+=3)
        {         
            System.out.print((i<100) ? (i + ", ") : (i + "."));
        }
    }
}
