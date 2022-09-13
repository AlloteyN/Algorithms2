int solution(int[] inputArray) {
int sol = -10000000;

for (int i=0; i<inputArray.length-1;i++) {
    
    if (inputArray[i]*inputArray[i+1] > sol) {
        sol = inputArray[i]*inputArray[i+1];
    }
}
return sol;
}
