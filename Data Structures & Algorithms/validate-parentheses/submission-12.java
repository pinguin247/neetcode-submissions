class Solution {
    public boolean isValid(String s) {
       char[] array = s.toCharArray();
        if(array.length <=1) return false;
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if(c == '[' || c == '{' || c=='('){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                char n = stack.pop();
                if(map.get(c) != n) return false;
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
