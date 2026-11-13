/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;
import java.util.Scanner;
/**
 *
 * @author mani
 */
public class JavaApplication19 {
    static int tamrin2(int a , int b) {
        if (b == 0) {
            return 1;
        }
        return a * tamrin2 (a , b-1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("enter a first number");
        int a = input.nextInt();
        
        System.out.println("enter a second number");
        int b = input.nextInt();
        
        System.out.println("result : " + tamrin2(a,b));
        input.close();
        
        // TODO code application logic here
    }
    
}
