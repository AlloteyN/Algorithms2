int solution(int n, int firstNumber) {
int n1 = n/2;

if (firstNumber >= n/2) {
    return firstNumber-n1;
} else {
    return firstNumber+n1;
}
}
