boolean solution(int n) {

String x = Integer.toString(n);

for (int i=0; i< x.length(); i++) {
    int currInt = Character.getNumericValue(x.charAt(i));
    
    if ((currInt % 2) != 0) {
        return false;
    }
    
}
return true;
}
