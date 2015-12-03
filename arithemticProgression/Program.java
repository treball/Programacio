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
     * Writes -n- terms, the sum and the product of an arithmetic progression.
     * 
     * @param firstTerm the first item of an arithmetic progression.
     * @param difference the difference between terms of an arithmetic
     *        progression.
     * @param n the number of terms of an artihmeticProgression
     */
    public void writeArithmeticProgression(double firstTerm, double difference, int n) {
        int i;
        double term, sum, product;
        System.out.print("\nTERMES = ");
        // Initialize the sequence
        term = firstTerm;
        sum = 0;
        product = 1;
        i = 0;
        while (i < n) {
            // Print each term
            System.out.printf("%f ", term);
            // Accumulate the term to the sum
            sum = sum + term;
            // Accumulate the term to the product
            product = product * term;
            // Calculate the next term
            term = term + difference;
            i++;
        }
        // Write the sum and the product
        System.out.printf("\nSuma = %f", sum);
        System.out.printf("\nProducte = %f\n\n", product);
    }
}
