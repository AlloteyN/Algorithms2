char solution(String s) {


HashMap<Character, Integer> word = new HashMap<Character, Integer>();

for (int i=0; i<s.length();i++) {
    char currChar = s.charAt(i);
    if (word.containsKey(currChar) == true) {
    word.put(currChar, word.get(currChar)+1);
    } else {
       word.put(currChar, 1); 
    }
}

for (int i=0; i<s.length();i++) {
    char currChar = s.charAt(i);
    if (word.get(currChar) == 1) {
        return currChar;
    }
    
}

return '_';
}
