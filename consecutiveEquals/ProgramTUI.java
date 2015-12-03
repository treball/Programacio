/*
 * ProgramTUI.java        1.0 08/11/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramTUI {

    /**
     * Read a sequence of numbers and write whether there are two consecutive
     * numbers that are equal.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        int n1, n2;
        boolean found;
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        System.out.print("\n\nNOMBRES CONSECUTIUS IGUALS ?\n\n");
        // Initialize the sequence
        found = false;
        // Read the two first numbers
        System.out.print("Un nombre enter ? ");
        n1 = s.nextInt();
        System.out.print("Un nombre enter ? ");
        n2 = s.nextInt();
        // Stop reading when arrive to the end of the sequence or when find two
        // consecutive numbers that are equal
        while (n2 != 0 && !found) {
            // Check if the previous number is equal to the current number
            if (n1 == n2) {
                found = true;
            } else {
                // Save the previous number
                n1 = n2;
                System.out.print("Un nombre enter ? ");
                n2 = s.nextInt();
            }
        }
        // Write the result
        if (found) {
            System.out.print("\nHi ha dos elements consecutius iguals\n\n");
        } else {
            System.out.print("\nNo hi ha dos elements consecutius iguals\n\n");
        }
    }

}
