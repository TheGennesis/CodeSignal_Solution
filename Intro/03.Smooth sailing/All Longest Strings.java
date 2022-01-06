String[] solution(String[] inputArray) {
    List<String> res = new ArrayList<>();
    int maxLength = 0;
    
    for (int i = 0; i < inputArray.length; i++) {
        maxLength = Math.max(inputArray[i].length(), maxLength);    
    }
    
    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i].length() == maxLength) {
            res.add(inputArray[i]);
        }    
    }
    
    String[] resFinal = new String[res.size()];
    return res.toArray(resFinal);
}
