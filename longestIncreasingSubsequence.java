class longestIncreasingSubsequence {
    public static void main(String args[]) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        int[] temp = new int[arr.length];

        int size = 0;
        for (int x : arr) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (temp[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            temp[i] = x;
            if (i == size)
                ++size;
        }
        System.out.println(size);
    }
}
