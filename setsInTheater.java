int solution(int nCols, int nRows, int col, int row) {
int rows = nRows-row;
int cols = nCols - col +1;

System.out.println(rows);
System.out.println(cols);

return rows*cols;
}
