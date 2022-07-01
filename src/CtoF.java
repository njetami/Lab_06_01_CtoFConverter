import javax.swing.*;
import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        double celcius = 0;
        double fahrenheit = 0;
        String  answer = "Yes or No";

        do {

            System.out.print("Enter the celcius temperature you want to convert: ");

            if(in.hasNextDouble());
            {
                celcius = in.nextDouble();
                in.nextLine();
                fahrenheit = 32 + (celcius * 9 / 5);
                System.out.println("Your temperature in fahrenheiht is: " + fahrenheit);
                System.out.println("Do you want to convert another temperature?Yes or No");
                answer = in.nextLine();
            }
        }
        while (answer.equalsIgnoreCase("yes"));


        }


    }















