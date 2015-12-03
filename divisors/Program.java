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
     * Write the divisors of a number.
     * 
     * @param n a positive integer number.
     */
    public void writeDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            // Check if i divides n
            if (n % i == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
