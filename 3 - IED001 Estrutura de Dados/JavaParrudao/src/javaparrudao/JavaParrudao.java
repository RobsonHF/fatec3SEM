/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaparrudao;

import javax.swing.JOptionPane;

/**
 *
 * @author robso
 */
public class JavaParrudao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        int resultado;
        
        numero1 = Integer.parseInt (JOptionPane.showInputDialog ("Escreva o primeiro número para realizar uma soma "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o número 2 "));
        resultado = numero1 + numero2;
        
        JOptionPane.showMessageDialog (null, "O resultado da soma é " + resultado);
        
    }
    
}
