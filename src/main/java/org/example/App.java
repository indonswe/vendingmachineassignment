package org.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        int answer;
        boolean quit = false;
        String name= "Machine";
        int amount = 0;

        Product machine = new Product(name,amount);

        do{
            mainMenu pMM = new mainMenu();// handle main menu
            answer = pMM.pMM(amount);
            if (answer == 1) {

                break; // ends the program
            }else if(answer == 2){

            }








        }while(quit==false);


    }
}
