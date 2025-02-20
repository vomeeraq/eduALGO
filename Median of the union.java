import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = reader.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int L = Integer.parseInt(firstLine[1]);

        List<int[]> sequences = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] sequenceInput = reader.readLine().split(" ");
            int[] sequence = new int[L];
            for (int j = 0; j < L; j++) {
                sequence[j] = Integer.parseInt(sequenceInput[j]);
            }
            sequences.add(sequence);
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int[] combined = new int[2 * L];
                System.arraycopy(sequences.get(i), 0, combined, 0, L);
                System.arraycopy(sequences.get(j), 0, combined, L, L);

                Arrays.sort(combined);
                writer.write(combined[L - 1] + "\n");
            }
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
