/**
 *
 * @author Oriol
 */
public class Program2 {

    public static void main(String[] args) {

        int weights[] = new int[6];
        weights[0] = 62;
        weights[1] = 64;
        weights[2] = 48;
        weights[3] = 64;
        weights[4] = 62;
        weights[5] = 64;
        (new Program()).histogram(weights);
    }

    void histogram(int weights[]) {
        
        //Build of the frequencies array
        //where even positions contain weights and
        //odd positions contain frequencies
        boolean found;
        int[] frequencies = new int[weights.length * 2];
        for (int i = 0; i < weights.length; i++) {
            found = false;
            int k = 0;
            while (k < weights.length && !found) {
                found = frequencies[2 * k] == weights[i];
                k++;
            }
            if (found) {
                frequencies[2 * (k - 1) + 1] += 1;
            } else {
                frequencies[2 * i] = weights[i];
                frequencies[2 * i + 1] = 1;
            }
        }

        //Print results
        int j = 0;
        while (j < frequencies.length && frequencies[j] != 0) {
            System.out.print(frequencies[j]);
            System.out.print("\t");
            for (int k = 0; k < frequencies[j + 1]; k++) {
                System.out.print("*");
            }
            System.out.println();
            j += 2;
        }
    }
}
