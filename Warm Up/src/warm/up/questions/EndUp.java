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
public class EndUp {

    /*
    Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

    endUp("Hello") → "HeLLO"
    endUp("hi there") → "hi thERE"
    endUp("hi") → "HI"
     */

    public String endUp(String str) {
        if (str.length() > 3) {
            String beginString = str.substring(0, str.length() - 3);
            String endString = str.substring(str.length() - 3, str.length()).toUpperCase();
            return beginString + endString;
        }
        return str.toUpperCase();
    }

}
