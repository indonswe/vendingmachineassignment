package org.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        boolean quit = false;
        do{
            mainMenu pMM = new mainMenu();// handle main menu
            pMM.pMM();
            //if (quit) break; // ends the program




        }while(quit==false);


    }
}
