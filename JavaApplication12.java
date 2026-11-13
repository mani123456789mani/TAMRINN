/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;
import java.util.Scanner;
/**
 *
 * @author mani
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("yek adad mosbat vared konid: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("invalid number");
        }
        else {

            int count = 0;
            int sum = 0;
            int maghsum = 0;
            boolean adadAval = true;

            System.out.println("maghsum be joz khode adad va adade 1 ");

            for (int i = 1; i <= n; i++) {

                if (n % i == 0) {

                    count++;
                    sum = sum + i;

                    if (i < n) {
                        maghsum = maghsum + i;
                    }

                    if (i != 1 && i != n) {
                        System.out.println(i);
                        adadAval = false;
                    }
                }
            }

            System.out.println("tedad maghsum: " + count);
            System.out.println("majmue maghsum: " + sum);

            if (adadAval && n > 1) {
                System.out.println("adad aval ast");
            }
            else {
                System.out.println("adad aval nist");
            }

            if (maghsum == n) {
                System.out.println("adad kamel ast");
            }
            else {
                System.out.println("adad kamel nist");
            }
        }
    }
}
        
        
        
       
         
    

