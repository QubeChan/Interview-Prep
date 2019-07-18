/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warm.up.questions;

/**
 *
 * @author qube
 */
public class IntMax {

    /*
    Given three int values, a b c, return the largest.


    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3
    intMax(3, 2, 1) → 3
     */
    public int intMax(int a, int b, int c) {
        // if(a>b&&a>c){
        //   return a;
        // } else if(b>a&&b>c){
        //   return b;
        // } else{
        //   return c;
        // }
        int max;
        max = Math.max(a, b);
        max = Math.max(max, c);
        return max;
    }

}
