package Perfect;

public class homework9 {
    public int pivotIndex(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<nums.length;i++){
            leftsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            leftsum=leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            if(i<nums.length){
                rightsum=rightsum+nums[i];
            }

        }
        return -1;
    }
}
    /*
public class homework9{
    public static void main(String[] args) {
        System.out.println(getValue(2));

    }
    public static int getValue(int i){
        int result=0;
        switch (i){
            case 1:
                result=result+i;
            case 2:
                result=result+i*2;
            case 3:
                result=result+i*3;
        }
        return result;

    }
    }
    */
/*
public class homework9{
    public static void main(String[] args) {
        System.out.println("value="+switchit(4));
    }
    public static int switchit(int x){
        int j=1;
        switch(x){
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;
            case 5:j++;
            default:j++;
        }
        return j+x;
    }
    }
    */
/*
public class homework9 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a"));
    }
    public static  int lengthOfLastWord(String s) {
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(s.length()-1)==' '){
                return 0;
            }

            if(s.charAt(i)!=' '){
                length++;
            }else if(length>0){
                return length;
            }
        }
        return length;
    }

}
*/
/*
public class homework9 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        for (i = m - 1; i >= 0; i--) nums1[i + n] = nums1[i];
        for (i = n, j = 0, k = 0; i < m + n && j < n; ) {
            if (nums1[i] <= nums2[j]) nums1[k++] = nums1[i++];
            else nums1[k++] = nums2[j++];
        }
        while (j < n) {
            nums1[k++] = nums2[j++];
        }
    }
}
*/
/*
public class homework9{
    String str=new String("hello");
    char[] ch={'a','b'};

    public static void main(String[] args) {
        Solution ex=new Solution();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='c';
    }
}
*/

        /*
public class homework9 {
    public int[] sortArrayByParity(int[] A) {
        for(int i=0;i<A.length;i++){
            for(int j=A.length-1;j>i;j--){
                if(A[i]%2!=0&&A[j]%2==0){
                    int tmp=0;
                    tmp=A[i];
                    A[i]=A[j];
                    A[j]=tmp;
                }
            }
        }
        return A;
    }
}
 */
        /*

         //
        public class homework9 {
        public String reverseOnlyLetters(String S) {
            char[] arr=S.toCharArray();
            int i=0,j=arr.length-1;
            char temp='0';
            while(i<j){
                while(!(('a'<=arr[i]&&arr[i]<='z')||('A'<=arr[i]&&arr[i]<='Z'))&&i<j){
                    i++;//非字母
                }
                while(!(('a'<=arr[j]&&arr[j]<='z')||('A'<=arr[j]&&arr[j]<='Z'))&&i<j){
                    j--;//非字母
                }

                if(i<j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
            }
            return new String(arr);

        }
}
 /*
        public class homework9 {
        public boolean isLongPressedName(String name, String typed) {
            int len1=name.length();
            int len2=typed.length();
            if(len1>len2){
                return false;
            }
            int i=0;
            int j=0;
            while(i<len1&&j<len2){
                if(name.charAt(i)==typed.charAt(j)){
                    i++;
                    j++;
                }else if(j>0&&typed.charAt(j)==typed.charAt(j-1)){
                    j++;
                }else{
                    return false;
                }
            }
            return i==len1;
        }
}
 */

