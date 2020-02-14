public class Solution {
    public static void main(String[] args) {
        Solution m=new Solution();
        System.out.println(m.ToLowerCase("HelloWorld"));
    }
    public String ToLowerCase(String str){
            String ch = "";
            for(int i = 0; i < str.length(); i++) {
                int num = str.charAt(i);
                if(num <= 90 && num >= 65) {
                    num += 32;
                }
                ch += (char)num;
            }
            return ch;
        }

    }


