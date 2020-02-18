/*
public class homework7 {
    public boolean isPalindrome(String s) {
        s = s.replace(" ", "");
        s = s.toLowerCase();
        for (int i = 0, j = s.length() -1; i < j;) {
            char ic = s.charAt(i);
            char jc = s.charAt(j);
            if (!((ic >= 'a' && ic <= 'z') || (ic >= '0' && ic <= '9'))) {
                i++;
                continue;
            }
            if (!((jc >= 'a' && jc <= 'z') || (jc >= '0' && jc <= '9'))) {
                j--;
                continue;
            }
            if (jc != ic) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
*/
/*
public class homework7 {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        int curSum = 1;
        char curChars = chars[0];
        for (int i = 0;i < chars.length-1; i++){
            if (chars[i] == chars[i+1]){
                curSum ++;
                curChars = chars[i];
            }else{
                str.append(curChars);
                if (curSum > 1){
                    str.append(curSum);
                }
                curSum = 1;
                curChars = chars[i+1];
            }
        }
        if (curSum > 1){
            str.append(curChars);
            str.append(curSum);
        }else{
            str.append(curChars);
        }
        char[] tem = str.toString().toCharArray();
        for (int i = 0;i < tem.length; i++){
            chars[i] = tem[i];
        }
        return str.length();
    }
    }
 */
/*
public class homework7 {
    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        int low = length - 1;
        int high = 0;
        int max = nums[0];
        int min = nums[length - 1];
        for (int i = 0; i < length; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[length - i - 1], min);
            if (nums[i] < max) {
                high = i;
            }
            if (nums[length - i - 1] > min) {
                low = length - i - 1;
            }
        }
        if (low >= high) {
            return 0;
        }
        return high - low + 1;
    }
}
*/
public class homework7 {
    public int evalRPN(String[] tokens) {
        //逆波兰表示法：  所有操作符至于操作数的后面（后缀表示法）不需要括号来识别操作符优先级
        Stack<Integer> stack = new Stack<>();
        for (int i = 0 ;i < tokens.length;i++){
            String str = tokens[i];
            if (str.length() == 1){
                char ch = str.charAt(0);
                if (ch-'0' >= 0 && ch - '0' <= 9 ){
                    Integer a = Integer.valueOf(str);
                    stack.push(a);
                }
                else{
                    if (stack.size() < 2)
                        return 0;
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    switch(ch){
                        case '+':
                            stack.push(num1 + num2);
                            break;
                        case '-':
                            stack.push(num1 - num2);
                            break;
                        case '*':
                            stack.push(num1 * num2);
                            break;
                        case '/':
                            stack.push(num1 / num2);
                            break;
                    }

                }
            }else{
                int n = Integer.valueOf(str);
                stack.push(n);
            }
        }
        return stack.pop();
    }
}