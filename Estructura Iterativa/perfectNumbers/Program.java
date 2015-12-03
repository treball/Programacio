/*
 * Program.java        1.0 08/11/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    /**
     * Write the perfect numbers between two numbers.
     * 
     * @param n1 an integer number.
     * @param n2 an integer number.
     */
    public void writePerfectNumbers(int n1, int n2) {
        int i, j, s;
        // Traverse the numbers between n1 and n2
        for (i = n1; i <= n2; i++) {
            s = 0;
            // For each number, check if it is a perfect number
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    s = s + j;
                }
            }
            // If it is a perfect number, write it
            if (s == i) {
                System.out.printf("%d ", i);
            }
        }
    }
}
