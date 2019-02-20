/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome3;

import javax.swing.*;

/**
 *
 * @author dalut3278
 */

public class Palindrome3 {

    public static void main(String[] args) {
        String phrase, backwardsPhrase, output;
        int pos;

        //get the word from the user
        phrase = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a phrase is a palindrome.\n\n"
                + "Enter a phrase:");

        output = phrase;

        phrase = phrase.replaceAll("\\s", "");

        //Reverse the phrase
        backwardsPhrase = "";
        for (pos = phrase.length() - 1; pos >= 0; pos--) {
            backwardsPhrase += phrase.charAt(pos);
        }

        //Compare the words
        if (phrase.equalsIgnoreCase(backwardsPhrase)) {
            JOptionPane.showMessageDialog(null, output + " IS a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, output + " in reverse is " + backwardsPhrase
                    + ".\nIt Is NOT a palindrome.");
        }
    }
}
