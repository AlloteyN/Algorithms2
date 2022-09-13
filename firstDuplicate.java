int solution(int[] a) {

int[] nums = new int[a.length+1];

for (int i=0; i<a.length; i++) {
    nums[a[i]] += 1;
    if (nums[a[i]] == 2) {
        return a[i];
    }
}

return -1;

}
