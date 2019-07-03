/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warm.up;

import warm.up.questions.EndUp;
import warm.up.questions.EveryNth;

/**
 *
 * @author qube
 */
public class WarmUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Directions for the questions are in the questions package this class
        // is resposible for only running the tests for the questions
        
        // EveryNth test
        EveryNth test = new EveryNth();
        System.out.println(test.everyNth("Miracle", 2)); //Mrce
        System.out.println(test.everyNth("abcdefg", 2)); //aceg
        System.out.println(test.everyNth("abcdefg", 3)); //adg
        
        // EndUp test
        EndUp test2 = new EndUp();
        System.out.println(test2.endUp("Hello")); //HeLLO
        System.out.println(test2.endUp("hi there")); //hi thERE
        System.out.println(test2.endUp("hi")); //HI
    }

}
