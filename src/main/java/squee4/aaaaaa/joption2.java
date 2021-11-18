/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squee4.aaaaaa;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author five_
 */
public class joption2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
        double numero1=0;
        boolean mal = true;
        
        do{
            
            String num1 = JOptionPane.showInputDialog("Número 1");
            try{
                numero1 = Double.parseDouble(num1);
                mal = false;
            } catch (NumberFormatException nfe) {
                System.out.println("babuino");
                
            }
        } while (mal);
        
        double numero2=Math.floor(numero1);
        
        double numero3=Math.ceil(numero1);
        
        JOptionPane.showMessageDialog(null, "El número 1 es "+(numero1));
        
        System.out.printf("El número es %.2f", numero1);
    
    }
    
}
