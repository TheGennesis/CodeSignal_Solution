boolean solution(String name) {
    String regex = "[a-zA-Z_][a-zA-Z_0-9]*";
    
    return name.matches(regex);
}