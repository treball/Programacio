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
     * Read a sequence of numbers ending in 0 and write its average.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        double num, sum = 0, avg;
        int n = 0;
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        System.out.print("\n\nMITJANA ARITMÈTICA D'UNA SEQÜÈNCIA DE NOMBRES.\n\n");
        System.out.print("Nombre (0 per acabar) ? ");
        num = s.nextDouble();
        while (num != 0) {
            // Sum the number
            sum += num;
            // Count how many numbers
            n++;
            //
            System.out.print("Nombre (0 per acabar) ? ");
            num = s.nextDouble();
        }
        if (n != 0) {
            // Calculate the average.
            avg = sum / n;
            System.out.printf("\nMitjana aritmètica = %f\n\n", avg);
        } else {
            // If there is no number, the average is 0.
            System.out.printf("\nMitjana aritmètica = %f\n\n", sum);
        }
    }

}
