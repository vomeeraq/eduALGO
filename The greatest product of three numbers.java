import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int[] result = maximumProductNumbers(nums);
        Arrays.sort(result);

        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }

    public static int[] maximumProductNumbers(int[] nums) {
        Arrays.sort(nums);

        long product1 = (long) nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        long product2 = (long) nums[0] * nums[1] * nums[nums.length - 1];

        if (product1 >= product2) {
            return new int[] {nums[nums.length - 3], nums[nums.length - 2], nums[nums.length - 1]};
        } else {
            return new int[] {nums[0], nums[1], nums[nums.length - 1]};
        }
    }
}
