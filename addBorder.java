String[] solution(String[] picture) {

String[] ans = new String[picture.length+2];

int leng = picture[0].length()+2;


StringBuilder border = new StringBuilder("*"+picture[0]+"*");
for (int i=0; i<leng; i++){
    border.setCharAt(i, '*');
}

ans[0] = border.toString();

for (int i=0; i<picture.length;i++) {
    ans [i+1] = "*"+picture[i]+"*";
}

ans[ans.length-1] = border.toString();

return ans;
}
