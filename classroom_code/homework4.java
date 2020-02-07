//二维数组
        package Perfect;
import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
       int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.println(" ");
        }
    }
    }
    /*
package Perfect;
import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
        // 给定一个整型数组, 将所有的奇数放在前半部分, 将所有的偶数放在数组后半部分
        int[] arr = {6, 3, 8, 5, 9, 1, 2, 4, 7};
        transform(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void transform(int[] arr) {
        for (int left = 0; left < arr.length; left++) {
            for (int right = arr.length - 1; right > left; right--) {
                if (arr[left] % 2 == 0) {
                    if (arr[right] % 2 == 1) {
                        int tmp = 0;
                        tmp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = tmp;
                        left++;
                        right--;

                    }
                }
            }
        }
    }
}
 */
    /*
     //给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
        package Perfect;
import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] arr) {
        for(int left=0;left<arr.length;left++){
            for(int right=arr.length-1;right>left;right--){
                if(arr[left]%2!=0){
                    if(arr[right]%2==0){
                        int tmp=0;
                        tmp=arr[left];
                        arr[left]=arr[right];
                        arr[right]=tmp;
                    }
                }
            }
        }
    }
    }
    */
        /*
         //数组逆序
 package Perfect;
import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  reverse(int[] arr){
       int left=0;
       int right=arr.length-1;
       while(left<right){
           int tmp=0;
           tmp=arr[left];
           arr[left]=arr[right];
           arr[right]=tmp;
           left++;
           right--;
       }
    }
    }
     */
        /*
//冒泡排序(降序)
package Perfect;
import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,9,2,3,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j-1]<arr[j]){
                    int tmp=0;
                    tmp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
}
 */

        /*
        //数组排序（冒泡排序(升序)）
        package Perfect;
import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,9,2,3,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j-1]>arr[j]){
                    int tmp=0;
                    tmp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
    }
     */


        /*
        //检查数组的有序性
        package Perfect;
import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3,8,9};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
        }
        */

        /*
        //查找数组中指定的元素(二分查找)
        package Perfect;
import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        System.out.println(arr[binarySearch(arr,6)]);
    }
    public static int  binarySearch(int[] arr,int tofind) {
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(tofind<arr[mid]){
                right=mid-1;
            }else if(tofind>arr[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
 */
        /*
        //查找数组中指定的元素（顺序查找）
  package Perfect;
import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(find(arr,6));
    }
    public static int find(int[] arr,int tofind) {
        int tmp=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == tofind) {
                tmp = arr[i];
                return tmp;
            }
        }  return -1;
    }
    }
    */


        /*
        //数组元素的平均值
        package Perfect;
import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Avg(arr));
    }
    public static double Avg(int[] arr) {
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        return (double)sum/(double)arr.length;
    }
}
*/
        /*
            //找数组中最大元素
        package Perfect;
import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
    int[] arr={4,7,9,8,1,2,6,5,2,3};
        System.out.println(Max(arr));
    }
    public static int Max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    }
    */


        /*
   //数组拷贝：Arrays.copyOf(数组名，数组长度）
   //copyOf是深拷贝，即又创建了一个数组对象, 拷贝原有数组中的所有元素到新数组中. 因此, 修改原数组, 不会影响到新数组.
        package Perfect;
import java.util.Arrays;
        public class homework4 {
            public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("newArr: " + Arrays.toString(newArr));
        arr[0] = 10;//只改变arr数组中第一个元素，与newArray无关
        System.out.println("arr: " + Arrays.toString(arr));//打印arr(数组转字符串输出)
        System.out.println("newArr: " + Arrays.toString(newArr));//打印newArr(数组转字符串输出)
    }
    }
     */



        /*
         //自己写数组转字符串
        package Perfect;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(toString(arr));
    }
        public static String toString(int[] arr){
            String ret="[";
            for(int i=0;i<arr.length;i++){
                ret+=arr[i];
                if(i!=arr.length){
                    ret+=",";
                }
            }
            ret+="]";
            return ret;
        }
    }
    */




         /*
          //数组转字符串：Arrays.toString(数组名);
         package Perfect;
import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        String newArr=Arrays.toString(arr);
        System.out.println(newArr);
    }
    }
     */
         /*
//编写代码: 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
        package Perfect;
                import java.util.Arrays;
public class homework4 {
    public static void main(String[] args) {
        int[] arr=new int[100];
        System.out.println(Arrays.toString(Arr(arr)));
    }
    public static int[] Arr(int[] arr){
        int[] tmp=new int[100];
        for(int i=0;i<arr.length;i++){
            tmp[i]=i+1;
        }
        return tmp;
    }
}*/




        /*
        //写一个方法将数组中的每个元素都*2
        package Perfect;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] a=transform(arr);
        printArray(a);
    }
public static int[] transform(int[] arr){//若方法名为copyOf ， ret[j]=arr[j],这个方法就是拷贝数组
        int[] ret=new int[arr.length];
        for(int j=0;j<arr.length;j++){
            ret[j]=2*arr[j];
        }
        return ret;
}
public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
}
}
*/



      /*
      //数组作为方法打印数组
        package Perfect;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};//int [] arr 是实参
        printarray(arr);
    }
    public static void printarray(int[] a){//int[] a 是形参
        for(int x:a){
            System.out.print(x);
            System.out.print(" ");
        }
    }
    }
     */



        /*
        //2.用for-each遍历数组
        package Perfect;
public class homework4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        for(int x:arr){
            System.out.print(x);
            System.out.print(" ");
        }
}
}
         */

        /*
        //1.遍历数组
package Perfect;
        public class homework4 {
            public static void main(String[] args){
           int[] arr={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }

    }
}
*/