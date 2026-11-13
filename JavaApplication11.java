/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;
import java.util.Scanner;
/**
 *
 * @author mani
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("yek adad mosbat vared konid");
        int i = input.nextInt();
        
        int temp = i ; 
        int count = 0 ;
        int sum = 0 ;
        int zarb = 1 ;
        int max = 0 ;
        int min = 9 ;
        int even = 0 ;
        int odd = 0 ;
        int makus = 0 ;
        
        while (temp > 0) {
            int ab = temp % 10 ;
            count = count + 1 ;
            sum = sum + ab ;
        if (ab != 0) {
            zarb *= ab ;
        }
        if (ab > max) {
            max = ab ;
        }
        if (ab < min) {
            min = ab ;
        }
        if (ab % 2 == 0 ) {
           even++ ;
        }
        else { 
           odd++ ;
        }
        makus = makus * 10 + ab ;
        temp = temp / 10 ;
        }
         System.out.println("tedad adad "+count);
         System.out.println("jam 2 adad "+sum);
         System.out.println("zarb 2 adad "+zarb);
         System.out.println("maximum adad "+max);
         System.out.println("minimum adad "+min);
         System.out.println("adad zoj "+even);
         System.out.println("adad fard "+odd);
         System.out.println("makus adad "+makus);
      
           
        }
        
   
   
      
        
                
      
    
        
   
        
    }
        
    
    
    



 