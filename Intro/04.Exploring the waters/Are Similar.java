boolean solution(int[] a, int[] b) {
    List<Integer> indexes = new ArrayList<>();
    
    //add the indexes where there is a mismatch
    for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) indexes.add(i);
    }
    
    //check list size.
    //if size equals 0 then the arrays are equal
    if (indexes.size() == 0) return true;
    
    //if size is not equal to 2, then it means that:
    //if 1 than an element is in one array only
    //if more that 2 than the arrays differ
    if (indexes.size() != 2) return false;
    
    //check if the elements with the two indexes are equal
    int index1 = indexes.get(0);   
    int index2 = indexes.get(1);
    
    if (a[index1] == b[index2] && a[index2] == b[index1]) return true;
    
    return false;   
}
