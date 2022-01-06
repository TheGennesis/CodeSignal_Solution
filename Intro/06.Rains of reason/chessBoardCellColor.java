boolean solution(String cell1, String cell2) {
    if (cell1.equals(cell2))
        return true;
        
    char c1 = cell1.charAt(0), c2 = cell2.charAt(0);
    char n1 = cell1.charAt(1), n2 = cell2.charAt(1);
    
    return (isCellBlack(c1, n1) && isCellBlack(c2, n2)) || (!isCellBlack(c1, n1) && !isCellBlack(c2, n2));
}

boolean isCellBlack (char letter, char num) {
    return (letter % 2 != 0 && num % 2 != 0) || (letter % 2 == 0 && num % 2 == 0);
}