/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author mani
 */
public class JavaApplication17 {
    static double area(int r) {
        return 3.14 * r * r;
    }
    static double area(int a , int b) {
        return a * b;
    }
    static double area(double base , double height) {
        return (base * height) * 2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("circle" + area(5));
        System.out.println("rectangle" + area(4, 6));
        System.out.println("triangle" + area(4.0, 8.0));
        // TODO code application logic here
    }
    
}
