/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.multiplicationtables.view;

/**
 *
 * @author Bryan Pazmino
 */
public class MultiplicationTables {
    public static void main(String[] args) {
        System.out.println("Multiplication Tables");
        System.out.println("---------------------");  
        int result=0;
        for(int i=1;i<=10;i++)
        {
            System.out.print("\n");
            for(int j=1;j<=10;j++){
                result=i*j;
                System.out.print( i+ "x" +j+ "=" +result+ ";  " );
            } 
        }     
    }
    
}
