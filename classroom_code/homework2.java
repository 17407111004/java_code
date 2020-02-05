

/*
//7.在同一个类中定义多个方法，不仅要求可以求两个整数的最大值，
  // 还可以求两个小数的最大值，以及两个小数和一个整数的大小关系.
package Perfect;
import java.util.Arrays;//导入一个排序包
import java.util.Scanner;
import java.util.Random;
public class homework2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double c = 1.5;
        double d = 2.4;
        System.out.println("两个整数最大值为：" + Max1(a, b));
        System.out.println("两个小数最大值为：" + Max2(c, d));
        Max3(c,d,a);
    }
    public static int Max1(int x, int y) {
        int max1 = x;
        if (max1 < y) {
            max1 = y;
        }
        return max1;
    }
    public static double Max2(double x, double y) {
        double max2 = x;
        if (max2 < y) {
            max2 = y;
        }
        return max2;
    }
    public static void Max3(double x, double y, int z) {
        double max=z;
        double mid=y;
        double min=x;
        if(z<y){
            max=y;
            min=z;
        }
        while(x>y&&x<z){
            min=y;
            mid=x;
            max=z;
        }
        while(x>z&&x<y){
            min=z;
            mid=x;
            max=y;
        }
        while(x>y&&x>x){
            if(y>z){
                min=z;
                mid=y;
                max=x;
            }else if(y<z){
                min=y;
                mid=z;
                max=x;
            }
        }
        System.out.println("max="+max);
        System.out.println("mid="+mid);
        System.out.println("min="+min);
    }
}
*/


/*
//6.在同一个类中，分别定义求两个整数和的方法，和三个小数之和的方法，并执行代码求出结果
package Perfect;
import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.print("a=");
        int a=input.nextInt();
        System.out.print("b=");
        int b=input.nextInt();
        System.out.println("a+b="+num1(a,b));
        System.out.print("c=");
        double c=input.nextDouble();
        System.out.print("d=");
        double d=input.nextDouble();
        System.out.print("e=");
        double e=input.nextDouble();
       System.out.println("c+d+e="+num2(c,d,e));
    }
    public static int num1(int x,int y){
        int sum1=0;
        sum1=x+y;
      return sum1;
    }
    public static double num2(double x,double y,double z){
        double sum2=0;
        sum2=x+y+z;
        return sum2;
    }
}
*/




/*
//5.有一组数据只有一个数字出现一次，其他都是两次，找出这个数字
package Perfect;

public class homework2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7 , 9, 9, 8, 6, 5, 4, 3, 2, 1};
        int num = num(arr);
        System.out.print(num);
    }
    public static int num(int[] arr) {
        int tmp=0;
        for (int i=0; i < arr.length; i++) {
           tmp^=arr[i];//两个数相同，按位异或则为0；
        }
        return tmp;
    }
}
*/




/*
//4.求斐波那契数列的第n项；（迭代实现）；
package Perfect;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
     System.out.print("请输入第n项为：");
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=Fib(i);
        }
        System.out.println(sum);


    }
    public static int Fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }

    }

 */




        /*
        //3.求N的阶乘；
        package Perfect;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入n=");
        int n=input.nextInt();
        int sum=factorial(n);
        System.out.println(sum);
    }
    public static int factorial(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            num*=i;
        }
        return num;
    }
    }*/













/*
//1.创建方法求两个数的最大值max2，再写一个求三个数的最大值max3（调用max2函数）;
        package Perfect;
public class homework2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int max2 = Max1(a, b);
        //int max3=Max2(a,b,c);
        System.out.println("max2="+max2);
        int max3 = Max1(a, b);
        if (max3 < c) {
            max3 = c;
        }
        System.out.println("max3="+max3);
    }
    public static int Max1(int x, int y) {
        int max2 = x;
        if (max2 < y) {
            max2 = y;
        }
        return max2;
    }
}
*/




        /*//交换两个数的值
        package Perfect;
import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {

        int[] arr={10,20};
        change(arr);
        System.out.println("a="+arr[0]+" ");
        System.out.println("b="+arr[1]+" ");

    }
    public static void change(int[] arr){
      int tmp=arr[0];
      arr[0]=arr[1];
      arr[1]=tmp;
    }
    }*/




        /*
        //计算1！+2！+3！+4！+5！的值
        package Perfect;
import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入数据n=");
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
        sum+=factor(i);
        }
        System.out.println(sum);
    }
    public static int factor(int n){
        int num=1;
        for(int j=1;j<=n;j++){
            num*=j;
        }
        return num;
    }
    }
     */




        /*
        package Perfect;

public class homework2 {
    public static void main(String[] args) {
        //计算两个整数相加
        int a=10;
        int b=20;
        int num=add(a,b);
        System.out.println("第一次调用方法:num="+num);
         num=add(30,40);
        System.out.println("第二次调用方法:num="+num);
    }
    public static int add(int x,int y){
        int sum=x+y;
        return sum;
    }
}
  */




        /*
        package Perfect;

public class homework2 {
    public static void main(String[] args) {
        //实现一个方法实现两个整数相加
        int a=10;
        int b=20;
        int num=add(a,b);
System.out.println(num);
    }
    public static int add(int x,int y){
        int sum=x+y;
        return sum;
    }
    }
    */

        /*//打印乘法口诀表
        package Perfect;
public class homework2 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            int j=0;
            int num=0;
            for(j=1;j<=i;j++){
                num=i*j;
                System.out.print(i+"*"+j+"="+num);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        //System.out.print(b);
    }
    }
*/





/*
  //13.输出一个整数的每一位;
package Perfect;
import java.util.Scanner;
public class homework2 {
    public static int getCount(int num) {
        int count = 0;
        while (num != 0) {
            num = num /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数:");
        int num = input.nextInt();
        int i = 0;
        int count = getCount(num);
        while (count != 0) {
            count--;
            int j = (int) (Math.pow(10, count));
            i = num / j;
            System.out.print(i);
            System.out.print(" ");
            num = num % j;
        }
    }
}
*/



/*
 // 14. 完成猜数字游戏
package Perfect;
import java.util.Scanner;
import java.util.Random;
public class homework2 {
 public static void main(String[] args) {
Random random=new Random();
        Scanner input=new Scanner(System.in);
        int toGuess = random.nextInt(100);//生成1到100之间的随机数
        while(true){
            System.out.print("请输入一个数:");
            int num=input.nextInt();
            if(toGuess==num){
                System.out.print("恭喜你，猜对了！");
                break;
            }else if(num>toGuess){
                System.out.println("猜大了，再猜");
            }else{
            System.out.println("猜小了，再猜");
            }
            }
            }
            }

 */



/*
 // 12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。
 package Perfect;
import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("请输入一个数");
            int num = input.nextInt();
            for (int i = 30; i >= 0; i -= 2) {
                System.out.print((num >> i) & 1);
            }
            System.out.print(" ");
            for (int j = 31; j >= 1; j -= 2) {
                System.out.print((num >> j) & 1);
            }
        }
    }
*/
