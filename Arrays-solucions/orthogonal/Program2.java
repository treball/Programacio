/*
 * Program.java        1.0 28/11/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program2 {

    /**
     * Calculates the contraction of two vectors.
     * 
     * @param v1 a vector
     * @param v2 a vector
     * @return the contraction of v1 and v2
     */
    public double contraction(double[] v1, double[] v2) {
        double c = 0;
        for (int i = 0; i < v1.length; i++) {
            // For each posotion , multiply corresponding elements and add to
            // the total
            c = c + v1[i] * v2[i];
        }
        return c;
    }

    /**
     * Verifies if two numerical arrays of same size are orthogonals.
     * 
     * @param array1 a numerical array
     * @param array2 a numerical array
     * @return true if is they are orthogonals, false otherwise
     */
    public boolean areOrthogonals(double[] a, double[] b) {
        double c = contraction(a, b);
        // If the sum is 0, the two arrays are orthogonal
        boolean cond = c == 0.0 ? true : false;
        return cond;
    }
}
