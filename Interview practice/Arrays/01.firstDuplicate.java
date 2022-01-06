int solution(int[] a) {
    int minIndex = Integer.MAX_VALUE;
    boolean found = false;
    
    HashSet<Integer> set = new HashSet<>();
    
    for (int i = 0; i < a.length; i++) {
        if (!set.add(a[i])) {
            minIndex = Integer.min(minIndex, i);
            found = true;
        }
    }
    
    return !found ? -1 : a[minIndex];
}
