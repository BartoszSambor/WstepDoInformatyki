public class Lab3 {

    public static void quickSort(int[] tab) {
        quickSort(tab, 0, tab.length - 1);
    }

    public static void quickSort(int[] tab, int left, int right) {
        if (right <= left) return;

        int i = left;
        int j = right;
        int pivot = tab[(left + right) / 2];

        do {
            while (pivot > tab[i]) {
                i++;
            }
            while (pivot < tab[j]) {
                j--;
            }
            if (i <= j) {
                int tmp = tab[i];
                tab[i] = tab[j];
                tab[j] = tmp;
                i++;
                j--;
            }
        } while (i <= j);

        if (j > left) quickSort(tab, left, j);
        if (i < right) quickSort(tab, i, right);
    }

    static int getNextGap(int gap) {
        gap = (gap * 10) / 13;
        if (gap < 1) return 1;
        return gap;
    }

    public static void combSort(int arr[]) {
        int n = arr.length;
        int gap = n;
        boolean swapped = true;
        while (gap != 1 || swapped) {
            gap = getNextGap(gap);
            swapped = false;
            for (int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    swapped = true;
                }
            }
        }
    }
}
