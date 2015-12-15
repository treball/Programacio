/*
 * Program.java        1.0 30/11/2011
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
     * Joins two arrays.
     * 
     * @param a1 an array
     * @param a2 an array
     * @return the concatenation of the two arrays.
     */
    public double[] join(double[] a1, double[] a2) {
        // Create an array with enough cells
        double[] a3 = new double[a1.length + a2.length];
        int i;
        // Put the elements of a1 into a3
        for (i = 0; i < a1.length; i++) {
            a3[i] = a1[i];
        }
        // After the elements of a1, put the elements of a2 into a3.        
        for (i = 0; i < a2.length; i++) {
            a3[i + a1.length] = a2[i];
        }
        return a3;
    }

}
