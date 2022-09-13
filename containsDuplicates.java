boolean solution(int[] a) {

HashMap <Integer,Integer> x = new HashMap<>();



for (int i=0; i<a.length; i++) {
   
   if (x.containsKey(a[i]) == true) {
       return true;
   } else {
    x.put(a[i],1);
   }
}


return false;
}
