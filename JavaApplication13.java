/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;
import java.util.Scanner;
/**
 *
 * @author mani
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000000;
        int choice;
        int amount = 0;
        do {
            System.out.println("1.moshahde mojodi");
            System.out.println("2.variz vajh");
            System.out.println("3.bardasht vajh");
            System.out.println("4.khoruj");
            System.out.println("gozine mord nazar ra entekhab konid");
            choice = input.nextInt();
            switch (choice) {
                case 1 : 
                    System.out.println("mojodi hesab" + balance);
                    break ;
                case 2 : System.out.println("mablagh variz ra vared konid");
                amount = input.nextInt();
                if ( amount > 0){
                    balance = balance + amount;
                    System.out.println("variz ba movafaghiat anjam shod");
                    System.out.println("mojodi jadid" + balance);
                }
                else {
                    System.out.println("mablagh bayad mosbat bashad");
                }
                break;
                case 3 : System.out.println("mablagh bardasht ra vared konid");
                if (amount <= 0) { 
                    amount =input.nextInt();
                    System.out.println("mablagh bayad mosbat bashad");
                } else if ( amount > balance) {
                    System.out.println("mojodi kafi nemibashad");
                } else if ( amount % 50000 != 0) {
                    System.out.println("mablagh bayad mazrabi az 5000 bashad");
                } else {
                    balance = balance - amount;
                    System.out.println("bardasht ba movafaghiat anjam shod");
                    System.out.println("mojodi jadid" + balance);
                } 
                break;
                    case 4 : System.out.println("az dastgah kharej shavid");
                    break;
                    default : System.out.println("gozine na motabar ast");
            }
        } while (choice != 4);
    }
}
           
        
        
       



 