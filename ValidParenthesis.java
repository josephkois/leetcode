public boolean isValid(String s) {
    Stack<Character> bracketStack = new Stack<>();
    HashMap<Character, Character> charMap = new HashMap<>();

    charMap.put(")", "(");
    charMap.put("]", "[");
    charMap.put("}", "{");

    for (int i =0; i < s.length(); i++) {
        if (charMap.containsKey(s[i])){
            if (!bracketStack.isEmpty() && bracketStack.peek() == charMap.get(s.charAt(i))) {
                bracketStack.pop();
            } else {
                return false;
            }
        } else {
            bracketStack.push(s.charAt(i));
        }
        if (bracketStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}