boolean solution(String[] crypt, char[][] solution) {
    
    for (char[] array : solution) {
        for (int i = 0; i < crypt.length; i++) {
            crypt[i] = crypt[i].replace(array[0], array[1]);
        }
    }
    
    for (int i = 0; i < crypt.length; i++) {
        if (!crypt[i].equals("0") && crypt[i].startsWith("0"))
            return false;
    }
    
    return Long.parseLong(crypt[0]) + Long.parseLong(crypt[1]) == Long.parseLong(crypt[2]); 
}