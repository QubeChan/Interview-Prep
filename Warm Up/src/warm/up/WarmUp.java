/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warm.up;

import warm.up.questions.Close10;
import warm.up.questions.EndUp;
import warm.up.questions.EveryNth;
import warm.up.questions.In3050;
import warm.up.questions.IntMax;
import warm.up.questions.LastDigit;
import warm.up.questions.Max1020;
import warm.up.questions.StringE;

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
        System.out.println("Test for EveryNth");
        System.out.println(test.everyNth("Miracle", 2)); //Mrce
        System.out.println(test.everyNth("abcdefg", 2)); //aceg
        System.out.println(test.everyNth("abcdefg", 3)); //adg

        // EndUp test
        EndUp test2 = new EndUp();
        System.out.println("\nTest for EndUp");
        System.out.println(test2.endUp("Hello")); //HeLLO
        System.out.println(test2.endUp("hi there")); //hi thERE
        System.out.println(test2.endUp("hi")); //HI

        // LastDigit test
        LastDigit test3 = new LastDigit();
        System.out.println("\nTest for LastDigit");
        System.out.println(test3.lastDigit(7, 17));
        System.out.println(test3.lastDigit(6, 17));
        System.out.println(test3.lastDigit(3, 113));

        // StringE test
        StringE test4 = new StringE();
        System.out.println("\nTest for StringE");
        System.out.println(test4.stringE("Hello"));
        System.out.println(test4.stringE("Heelle"));
        System.out.println(test4.stringE("Heelele"));

        // Max1020 test
        Max1020 test5 = new Max1020();
        System.out.println("\nTest for Max1020");
        System.out.println(test5.max1020(11, 19));
        System.out.println(test5.max1020(19, 11));
        System.out.println(test5.max1020(11, 9));

        // In3050 test
        In3050 test6 = new In3050();
        System.out.println("\nTest for In3050");
        System.out.println(test6.in3050(30, 31));
        System.out.println(test6.in3050(30, 41));
        System.out.println(test6.in3050(40, 50));

        // Close10 test
        Close10 test7 = new Close10();
        System.out.println("\nTest for Close10");
        System.out.println(test7.close10(8, 13));
        System.out.println(test7.close10(13, 8));
        System.out.println(test7.close10(13, 7));

        // IntMax test
        IntMax test8 = new IntMax();
        System.out.println("\nTest for IntMax");
        System.out.println(test8.intMax(1, 2, 3));
        System.out.println(test8.intMax(1, 3, 2));
        System.out.println(test8.intMax(3, 2, 1));
        
        
    }

}
