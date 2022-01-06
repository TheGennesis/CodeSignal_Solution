String solution(String inputString) {
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < inputString.length(); i++) {
        char curr = inputString.charAt(i);
        
        if (curr == 'z') {
            curr = 'a';
        }
        
        else {
            curr += 1;
        }
        
        sb.append(curr);
    }
    
    return sb.toString();
}
