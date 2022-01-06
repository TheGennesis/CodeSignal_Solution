int[] solution(int[] a) {
    int[] res = new int[a.length];
    
    List<Integer> list = new ArrayList<>();
    
    for (int i = 0; i < a.length; i++) {
        if (a[i] != -1) {
            list.add(a[i]);
        }
    }   
    
    Collections.sort(list);
    
    int index = 0;
    for (int i = 0; i < a.length; i++) {
        res[i] = a[i] == -1 ? a[i] : list.get(index++);    
    }
    
    return res;
}