package com.szkoleniejava.przyklady.Zajecia2;

/**
 * Program konstruujący tabliczką mnożenia na bazie zagnieżdżonej pętli for
 * 
 * @author Bartosz Marcinkowski
 */
public class Program6
{
    public static void main(String[] args)
    {
        for(int j=1; j<=10; j++)
        {
            for(int i=1; i<=10; i++)
                System.out.print(i*j+ "\t");
            System.out.println();
        }
    }
}
