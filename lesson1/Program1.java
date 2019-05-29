package com.szkoleniejava.przyklady.Zajecia2;

/**
 * Program gmerający w parametrach podanych przy wywołaniu programu i podający, czy pierwszy parametr
 * jest liczbą parzystą, czy nieparzystą z wykorzystaniem skróconej składni warunku
 * (zabezpieczenie przed niepodaniem parametru, brak zabezpieczenia przed niepoprawnym typem)
 * 
 * @author Bartosz Marcinkowski
 */
public class Program1
{
    public static void main(String[] args)
    {
        if(args.length > 1)
            System.out.println((Integer.parseInt(args[0])%2 == 0) ? "parzysta" : "nieparzysta");
        else
            System.out.println("Błąd!!!!! Nie podano parametru.");
    }
}
