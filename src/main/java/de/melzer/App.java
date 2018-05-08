package de.melzer;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Bitte geben sie ein Wort ein!");
        System.out.println(new Scanner(System.in).next().toUpperCase());
    }
}
