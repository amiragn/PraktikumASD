import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {40, 2, 1, 43, 3, 65, 0, -1, 58, 3, 42, 4};

        int n = arr.length;
        // menentukan ukuran jarak awal (gap)
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int key = arr[i];
                int j = i;
                // mengurutkan sub-array
                while (j >= gap && arr[j - gap] > key) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = key;
            }
            // mengurangi ukuran gap menjadi setengah dari gap sebelumnya
            gap /= 2;
        }

        System.out.println(Arrays.toString(arr));
    }
}