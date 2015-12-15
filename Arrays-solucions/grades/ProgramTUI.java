/*
 * ProgramTUI.java        1.0 12/12/2011
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
import java.util.Arrays;

public class ProgramTUI {

    /**
     * Ask for the numeric grade of a group of students and prints how many
     * students have each textual grade.
     * 
     * @param args Not used
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        int nStudents = 8, j = 0, ii = 0, ia = 0, ib = 0, in = 0, ie = 0;
        double[] students = new double[nStudents];
        int[] i = new int[nStudents], a = new int[nStudents], b = new int[nStudents], n = new int[nStudents], e = new int[nStudents];
        System.out.printf("\n\nNOTES\n\n");
        // Ask for numerical grades
        for (j = 0; j < nStudents; j++) {
            System.out.printf("Nota de l'alumne %d: ", j + 1);
            students[j] = s.nextDouble();
        }
        // Add each grade in the corresponding array
        for (j = 0; j < nStudents; j++) {
            if (students[j] < 5) {
                i[ii] = j + 1;
                ii++;
            } else if (students[j] < 6) {
                a[ia] = j + 1;
                ia++;
            } else if (students[j] < 7) {
                b[ib] = j + 1;
                ib++;
            } else if (students[j] < 9) {
                n[in] = j + 1;
                in++;
            } else {
                e[ie] = j + 1;
                ie++;
            }
        }
        // Prints students codes for each textual grade
        System.out.printf("\nInsuficient : ");        
        for (j = 0; j < ii; j++)
            System.out.printf("%d ", i[j]);        
        System.out.printf("\nAprovat : ");
        for (j = 0; j < ia; j++)
            System.out.printf("%d ", a[j]);
        System.out.printf("\nBé : ");
        for (j = 0; j < ib; j++)
            System.out.printf("%d ", b[j]);
        System.out.printf("\nNotable : ");
        for (j = 0; j < in; j++)
            System.out.printf("%d ", n[j]);
        System.out.printf("\nExcel·lent : ");
        for (j = 0; j < ie; j++)
            System.out.printf("%d ", e[j]);
    }
}
