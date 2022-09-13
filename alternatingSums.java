int[] solution(int[] a) {
    
    int[] ans = new int[2];
    
    for (int i=0; i< a.length; i++) {
        if ((i%2) == 0) {
            ans[0] += a[i];
        } else {
            ans[1] += a[i];
        }
    }
return ans;
}
