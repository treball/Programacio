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
     * Calculates the mean of the elements of an array
     * @param a an array
     * @return the mean
     */
    public double meanArray(double[] a) {
        double sum = 0, mean;
        int i;
        for (i = 0; i < a.length ; i++) {
            sum += a[i];
            // sum = sum + a[i];
        }
        mean = sum / a.length;
        return mean;
    }

}
