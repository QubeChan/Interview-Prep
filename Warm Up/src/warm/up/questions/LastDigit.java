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
public class LastDigit {

    /*
    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


    lastDigit(7, 17) →Ω true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true
     */
    public boolean lastDigit(int a, int b) {
        int singleA = a % 10;
        int singleB = b % 10;

        if (singleA == singleB) {
            return true;
        } else {
            return false;
        }
    }
}
