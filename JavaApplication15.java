/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;
import java.util.Scanner;

/**
 *
 * @author mani
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int x;
        int steps = 0;
        int max = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("yek adad mosbat vared konid");
        x = input.nextInt();
        
        System.out.println("khoroji :");
        
        while (x != 1) {
            System.out.println(x + " ");
            if (x > max) {
                max = x ;
            }
            if (x % 2 == 0) {
                even++;
                x = x / 2 ;
            }
            else {
                odd++;
                x = x * 3 + 1 ;
            }
            steps++;
        }
        System.out.println("1");
        
        System.out.println();
        System.out.println("steps" + steps);
        System.out.println("maximum" + max);
        System.out.println("even numbers" + even);
        System.out.println("odd numbers" + odd);
        
        input.close();
        // TODO code application logic here
    }
    
}
