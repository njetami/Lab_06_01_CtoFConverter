import javax.swing.*;
import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {


               Scanner in = new Scanner(System.in);
               double  celcius =0;
               double fahrenheit =0;
               String trash ="";


                System.out.print("input  celcius temperature: ");
                if(in.hasNextDouble()) {
                    celcius = in.nextDouble();
                    fahrenheit = 32 + (celcius * 9 / 5);
                    System.out.println("Your temperature in fahrenheight is: " + fahrenheit);
                }

                System.out.print("input  celcius temperature: ");
                if(in.hasNextDouble()) {
                celcius = in.nextDouble();
                fahrenheit = 32 + (celcius * 9 / 5);
                System.out.println("Your temperature in fahrenheight is: " + fahrenheit);
                }

                System.out.print("input  celcius temperature: ");
                if(in.hasNextDouble()) {
                celcius = in.nextDouble();
                fahrenheit = 32 + (celcius * 9 / 5);
                System.out.println("Your temperature in fahrenheight is: " + fahrenheit);
                 }

                else{
                    trash = in.nextLine();
                    System.out.println("The temperature you entered is invalid " + trash);
                }



    }


    }



