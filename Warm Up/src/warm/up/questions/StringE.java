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
public class StringE {

    /*
    Return true if the given string contains between 1 and 3 'e' chars.


    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
     */
    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }
}
