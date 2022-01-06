char solution(String s) {
    int[] chars = new int[26];
    
    for (char c : s.toCharArray())
        chars[c - 'a']++;
        
    for (char c : s.toCharArray()) {
        if (chars[c - 'a'] == 1)
            return c;
    }
    
    return '_';
}
