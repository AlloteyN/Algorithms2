boolean solution(int[] a, int[] b, int v) {

    Arrays.sort(a);
    Arrays.sort(b);
    for (int i = 0; i < a.length; i++) {
        if (Arrays.binarySearch(b, v - a[i]) > -1) {
            return true;
        }
    }
    return false;
}
