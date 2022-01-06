String solution(String inputString) {
    
    //stack that holds the indexes of the opened parenthesis
    Stack<Integer> stack = new Stack<>();
    
    for (int i = 0; i < inputString.length(); i++) {
        char current = inputString.charAt(i);
        
        //if current character is an opened parenthesis than push its index into stack
        if (current == '(') {
            stack.push(i+1);
        }   
        
        //otherwise we have to reverse the string in between the two indexes: one of the stack and the current one
        else if (current == ')') {
            StringBuilder sb = new StringBuilder();
            int startIndex = stack.peek();
            
            for (int j = i-1; j >= startIndex; j--) {
                sb.append(inputString.charAt(j));
            }
            
            //delete the element on top of the stack
            stack.pop();
            
            //replace the original string characters with the new ones
            inputString = inputString.replace(inputString.substring(startIndex, i), sb.toString());
            
            sb.setLength(0);
            
        }  
    }
    
    StringBuilder res = new StringBuilder();
    
    for (int i = 0; i < inputString.length(); i++) {
        char current = inputString.charAt(i);
        if (current != '(' && current != ')') {
            res.append(current);
        }
    }
    
    return res.toString();
}