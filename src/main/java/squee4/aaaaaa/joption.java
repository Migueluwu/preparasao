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
public class joption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero1=0;
        boolean mal = true;
        
        do{
            
            String num1 = JOptionPane.showInputDialog("Número 1");
            try{
                numero1 = Integer.parseInt(num1);
                mal = false;
            } catch (NumberFormatException nfe) {
                System.out.println("babuino");
                
            }
        } while (mal);
        
        JOptionPane.showMessageDialog(null, "El número 1 es "+numero1);
        
        
    }
    
}
