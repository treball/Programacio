/*
 * Program.java        1.0 07/11/2011
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
     * Write to console all the integer numbers between n1 and n2.
     * 
     * @param n1 an integer number.
     * @param n2 an integer number, n1 <= n2.
     */
    public void writeAscNumbers(int n1, int n2) {
        int i;
        i = n1;
        while (i <= n2) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

}
