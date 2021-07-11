class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<String>();
        for (String log : logs) {
            if (log.equals("../")) {
                if (stack.size() > 0)
                    stack.pop();
            } else if (log.equals("./"))
                ;
            else {
                stack.push(log);
            }
        }
        return stack.size();
    }

}