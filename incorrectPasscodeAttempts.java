boolean solution(String passcode, String[] attempts) {
int counter =0;

for (int i=0; i<attempts.length; i++) {
    if (attempts[i].equals(passcode) == true) {
        counter =0;
    } else {
        counter +=1;
    }
    
    if (counter == 10) {
        return true;
    }
    
}
return false;
}
