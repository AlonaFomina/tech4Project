package practice;

public class TestParentheses {



    public static boolean hasEqualParentheses(String s) {
        int c = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == '(') c++;
            else if(s.charAt(i) == ')') c--;
            if (c<0) return false;
        }

return true;
    }

    public static boolean hasElParentheses(String s){
        StringBuilder sb = new StringBuilder(s);

        while (sb.toString().contains("(")){
            if (sb.indexOf(")") < sb.indexOf("(")) return false;
            sb.deleteCharAt(sb.indexOf("("));
            sb.deleteCharAt(sb.indexOf(")"));
        }
        return !sb.toString().contains(")");
    }

    public static void main(String[] args) {
        System.out.println(hasElParentheses("((())()()"));
    }
}
