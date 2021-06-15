package com.maxcogito.collector;
import java.io.*;
import java.util.Scanner;


/**
 * CollectorApp
 *
 */
public class CollectStart 
{
    public static void main( String[] args )
    {
	String inputLine = null;
	Scanner scanner = new Scanner(new InputStreamReader(System.in));
	
        System.out.println( "Hello User!");
        System.out.println( "Please enter some line of text here: " );
	inputLine = scanner.nextLine();
	System.out.println("You entered:"+inputLine);
    }
}
