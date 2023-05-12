class longestIncreasingSubsequence {
    public static void main(String args[]) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        int[] temp = new int[arr.length];

        int size = 0;
        for (int x : arr) {
            int i = 0, j = size;
            while (i != j) {
                int middle = (i + j) / 2;
                if (temp[middle] < x)
                    i = middle + 1;
                else
                    j = middle;
            }
            temp[i] = x;
            if (i == size)
                ++size;
        }
        System.out.println("Length of the longest Increasing Subsequence");
        System.out.println(size);
    }
}
