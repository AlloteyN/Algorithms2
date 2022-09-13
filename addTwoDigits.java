int solution(int n) {

String x = Integer.toString(n);
int y = Character.getNumericValue(x.charAt(0));
int z = Character.getNumericValue(x.charAt(1));

return y+z;
}
