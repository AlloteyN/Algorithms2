int solution(int n) {
int sol = 10;
for (int i=0; i<n-1; i++) {
    sol = sol *10;
}

return sol-1;
}
