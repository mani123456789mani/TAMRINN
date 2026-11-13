/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;
import java.util.Scanner;
/**
 *
 * @author mani
 */
public class JavaApplication18 {
    static void tamrin(int n) {
        if (n == 0) {
            return;     
        }
        System.out.println(n + " ");
        tamrin(n - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter a number");
        int n = input.nextInt();
        
        tamrin(n);
        input.close();
        // TODO code application logic here
    }
    
}
