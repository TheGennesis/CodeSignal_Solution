String[] solution(String[] picture) {
    int newLength = picture.length +2;
    int newRowLength = picture[0].length() +2;
    
    String[] res = new String[newLength];
    
    for (int i = 1; i < newLength -1; i++) {
        res[i] = "*".concat(picture[i-1]).concat("*");
    }
    
    
    for (int i = 0; i < newLength; i += newLength-1) {
        StringBuilder sb = new StringBuilder();
        
        for (int j = 0; j < newRowLength; j++) {
            sb.append('*');
        }
        
        res[i] = sb.toString();    
    }
    
    return res;
}
