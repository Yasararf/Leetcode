class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> ss = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        String onlyLetters = s.replaceAll("[^a-zA-Z0-9]", "");
        for(char c : onlyLetters.toCharArray()){
            s1.push(Character.toLowerCase(c));
            ss.push(Character.toLowerCase(c));
            
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        String a1 = ss.toString();
        String a2 = s2.toString();
        if(a1.equals(a2)){
             return true;
        }
        else{
            return false;
        }
    }
}
