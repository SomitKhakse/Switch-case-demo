/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcasedemo;

import java.util.Scanner;

/**
 *
 * @author M N Khakse
*/
public class SwitchCaseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        System.out.println("Pick one: \t1.Hi t2.Hey \t3.hello \t");
        Scanner s= new Scanner(System.in);
        choice= s.nextInt();
        switch (choice)
        {
            
            case 1: System.out.println("You said Hi");
                    break;
            case 2: System.out.println("You said Hey");
                    break;
            case 3: System.out.println("You said Hello");
                    break;        
            
        }
                
    }
    
}
