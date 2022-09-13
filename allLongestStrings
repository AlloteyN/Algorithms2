String[] solution(String[] inputArray) {



int max = 0;
int counter =0;
for (int i=0; i<inputArray.length;i++){
    if (inputArray[i].length() > max) {
        max = inputArray[i].length();
        counter =0;
    }
    
        if (inputArray[i].length() == max) {
        max = inputArray[i].length();
        counter += 1;
    }
}
int st =0;

String[] outputArray = new String[counter];
for (int i=0; i<inputArray.length;i++){
    if (inputArray[i].length() == max) {
        outputArray[st] = inputArray[i];
    st += 1;
    }
}

return outputArray;
}
