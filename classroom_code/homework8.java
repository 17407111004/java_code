/*
public class homework8 {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        int[]  newDigits=new int[digits.length+1];
        newDigits[0]=1;
        return newDigits;

    }
}
 */
/*
public class homework8 {
    public int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        long max = Long.MIN_VALUE, secondMax = Long.MIN_VALUE , thirdMax = Long.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                thirdMax = secondMax;
                secondMax = max;
                max = nums[i];
                count++;
            } else if (max > nums[i]) {
                if (secondMax < nums[i]) {
                    thirdMax = secondMax;
                    secondMax = nums[i];
                    count++;
                } else if (secondMax > nums[i]) {

                    if (thirdMax < nums[i]) {
                        thirdMax = nums[i];
                        count++;
                    }
                }
            }
        }

        return (int) (count < 3 ? max : thirdMax);

    }
}
*/
/*
public class homework8 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new RuntimeException("No two sum solution");

    }
}
*/
/*
public class homework8 {
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;

        StringBuilder stb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int c = 0;  // 进位
        while(i >= 0 || j >= 0) {
            if(i >= 0) c += a.charAt(i --) - '0';
            if(j >= 0) c += b.charAt(j --) - '0';
            stb.append(c % 2);
            c >>= 1;
        }

        String res = stb.reverse().toString();
        return c > 0 ? '1' + res : res;

    }
}
*/
/*
public class homework8 {
    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        int bol = 1;
        int ans = 0;
        char[] cdhr = str.toCharArray();
        int i = 0;
        if (cdhr[0] == '-') {
            bol = -1;
            i = i + 1;
        }else if(cdhr[0] == '+'){
            i = i + 1;
        }
        for (; i < str.length(); i++) {
            if (48 > str.charAt(i) || str.charAt(i) >57) {
                break;
            }

            if(ans*bol > Integer.MAX_VALUE/10||ans*bol == Integer.MAX_VALUE / 10 && (cdhr[i] - 48) > 7 ){
                return Integer.MAX_VALUE;
            }
            if(ans*bol < Integer.MIN_VALUE/10||ans*bol == Integer.MIN_VALUE / 10 && (cdhr[i] - 48) > 8 ){
                return Integer.MIN_VALUE;
            }
            ans = ans * 10 + (cdhr[i] - 48);

        }
        ans=ans*bol;

        return  ans;

    }

}
*/
public class homework8 {
    public int[] searchRange(int[] nums, int target) {
        int [] result = new int[2];

        if(nums.length == 0){
            result[0] = -1;
            result[1] = -1;
            return  result;
        }
        result[0] = findFirst(nums, nums.length, target);
        result[1] = findLast(nums, nums.length, target);
        return result;
    }

    public int findFirst(int [] a, int len, int key)
    {
        if (len < 1)
            return - 1;
        int low = 0;
        int high = len - 1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if (a[mid] == key && (mid - 1 < 0 || a[mid - 1] != key))
            {
                return mid;
            }
            else if (a[mid] >= key)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }
    public int findLast(int [] a, int len, int key)
    {
        if (len < 1)
            return - 1;
        int low = 0;
        int high = len - 1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if (a[mid] == key && (mid + 1 >= len || a[mid + 1] != key))
            {
                return mid;
            }
            else if (a[mid] <= key)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }
}