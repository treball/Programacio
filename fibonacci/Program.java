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
     * Write the first Fibonacci numbers that are
     * less than a number.
     * 
     * @param max a positive integer number.
     */
    public void fibonacci(int max) {
        int t1, t2, t3 = 0;
        if (max == 0) {
            // If maximum number is 1, write it
            System.out.print("0");
        } else {
            // Write the first two numbers
            t1 = 0;
            t2 = 1;
            System.out.printf("%d ", t1);
            System.out.printf("%d ", t2);
            // Write the sequence while we don't 
            // exceed the maximum number
            while (t1 + t2 <= max) {
                t3 = t1 + t2;
                System.out.printf("%d ", t3);
                // Store the last two numbers
                // for the next iteration
                t1 = t2;
                t2 = t3;
            }
        }
    }
}
