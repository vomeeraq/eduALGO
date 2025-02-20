import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numKeys = scanner.nextInt();
        int[] keyPressLimits = new int[numKeys];
        
        for (int i = 0; i < numKeys; i++) {
            keyPressLimits[i] = scanner.nextInt();
        }

        int totalTaps = scanner.nextInt();
        int[] tappedKeys = new int[totalTaps];
        
        for (int i = 0; i < totalTaps; i++) {
            tappedKeys[i] = scanner.nextInt();
        }

        checkBrokenKeys(numKeys, keyPressLimits, totalTaps, tappedKeys);
    }

    public static void checkBrokenKeys(int numKeys, int[] keyPressLimits, int totalTaps, int[] tappedKeys) {
        boolean[] isBroken = new boolean[numKeys];

        for (int tap : tappedKeys) {
            int keyIndex = tap - 1;
            keyPressLimits[keyIndex]--;
            
            if (keyPressLimits[keyIndex] < 0) {
                isBroken[keyIndex] = true;
            }
        }

        for (int i = 0; i < numKeys; i++) {
            System.out.println(isBroken[i] ? "YES" : "NO");
        }
    }
}
