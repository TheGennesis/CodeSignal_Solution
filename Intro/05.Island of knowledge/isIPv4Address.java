boolean solution(String inputString) {
    
    /*
    PATTERN FOR EACH VALUE IN ADDRESS:
    - from 250 to 255: 25[0-5]
    - from 200 to 249: 2[0-4][0-9]
    - from 100 to 199: 1[0-9][0-9]
    - from 10 to 99:   [1-9][0-9]
    - from 0 to 9:     [0-9] 
    */
    
    String[] values = inputString.split("\\.");
    if (values.length != 4)
        return false;
    
    String pattern = "25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]";
    
    for (String s : values) {
        if (!s.matches(pattern))
            return false;
    }
    
    return true;
}
