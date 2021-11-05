/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkpositivenumebrloop;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class CheckPositiveNumebrLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int number;

        do {
            System.out.println("Please, enter a positive number: ");
            number = input.nextInt();

        } while (number < 0);

        System.out.println("The positive value is: "+number);
    }

}
