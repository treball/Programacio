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
     * Print Unicode characters.
     * 
     * @param n1 the first code to print.
     * @param n2 the last code to print.
     */
    public void writeUnicode(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            System.out.printf("%d -> %c\n", i, i);
        }
    }
}
