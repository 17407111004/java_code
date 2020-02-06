package Perfect;
import java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
        // 青蛙跳台阶问题(使用递归) 一只青蛙一次可以跳上 1 级台阶，
        // 也可以跳上2 级。求该青蛙跳上一个n 级的台阶总共有 多少种跳法。
        Scanner input = new Scanner(System.in);
        System.out.print("n为：");
        int n = input.nextInt();
        System.out.print(sum(n));
    }

    public static int sum(int n) {
        if (n<3&&n>0) {
            return n;
        } else if (n >= 3) {
            return sum(n - 1) + sum(n - 2);
        }else{
            return 0;
        }
    }
}

        /*
//求解汉诺塔问题（用递归）:大梵天创造世界的时候做了三根金刚石柱子， 在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。大梵
//天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。并且规定，任何时候，在小圆盘上都不能放大圆盘，且在三根柱子
//之间一次只能移动一个圆盘。

        package Perfect;
public class homework3 {
    public static void main(String[] args) {
        HanoiTower(64,'a','b','c');

    }
    public static void HanoiTower(int n,char a,char b,char c){
        if(n==1){
            move(a,n,c);
        }
        else{
            HanoiTower(n-1,a,c,b);
            move(a,n,c);
            HanoiTower(n-1,b,a,c);

        }
    }
    public static void move(char a,int n,char c){
        System.out.println("move"+n+"from"+a+"to"+c);
    }
}*/
        /*
        //循环求斐波那契数列的第n项
        package Perfect;
import java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n为：");
        int n=input.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        int num1 = 1;
        int num2 = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = num1+num2;
            num1 = num2;
            num2 = sum;
        }
        return sum; }
    }
     */



        /*
        package Perfect;
import java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
        //求斐波那契数列的第n项（递归）
        Scanner input=new Scanner(System.in);
        System.out.print("n为：");
        int n=input.nextInt();
        System.out.print(fib(n));
    }
    public static int  fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    }
     */



        /*
        package Perfect;
import java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
        //写一个递归方法，输入一个非负整数，返回组成它的数字之和. 例如，输入 1729, 则应该返回1+7+2+9， 它的和是19
        Scanner input=new Scanner(System.in);
        System.out.print("num为：");
        int num=input.nextInt();
        System.out.print(sum(num);
    }
    public static int sum(int num){
        if(num>9){
            return sum(num/10)+num%10;
        }else{
            return num;
        }
    }
}
 */

/*
package Perfect;
import java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
        //递归求1+2+3+4+5+6+7+8+9+10
        Scanner input=new Scanner(System.in);
        System.out.print("num为：");
        int num=input.nextInt();
        System.out.print(sum(num);
    }
    public static int sum(int num){
        if(num==1){
            return 1;
        }
        return num+sum(num-1);
    }
    }
     */


        /*
        package Perfect;
import java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
        //使用递归打印数字的每一位
        Scanner input=new Scanner(System.in);
        System.out.print("num为：");
        int num=input.nextInt();
        print(num);
    }
    public static void print(int num){

        if(num>9){
            print(num/10);//层层递归，当num<9时，输出个位后，返回输出十位，在返回输出百位......
            }
        System.out.print(num%10);
    }
    }
    */



        /*
        //使用递归求n!
        package Perfect;
import java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n为：");
        int n=input.nextInt();
        int ret=factorial(n);
        System.out.print("ret="+ret);
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
*/