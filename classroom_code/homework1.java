package Perfect;
import java.util.Scanner;
import java.util.Random;
public class homework1 {
    public static void main(String[] args){

    /*
    // 11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
    public static int getCount(int count) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数字:");
        int num = input.nextInt();
        int sum = 0;
        while (num != 0) {
            sum = num % 2;
            if (sum == 1) {
                count++;
            }
            num = num / 2;
        }
        return count;
    }
    public static void main(String[] args) {
        int count=getCount(0);
        System.out.println(count);
        */




        // 10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误
        //  , 可以重新输 入，最多输入三次。三次均错，则提示退出程序
    /*
    public  static void fun(){
        int count=3;
        Scanner input=new Scanner(System.in);
        while(count!=0){
            System.out.print("请输入密码:");
            String password=input.nextLine();
            if("17407111004".equals(password)){//两个字符串相等  a.equals(b)
                System.out.println("登陆成功");
                break;
            }else{
                System.out.println("密码错误");
                count--;
                while(count==0){
                    System.out.println("退出程序");
                    break;
                }
            }
        }
    }
   public static void main(String[] args) {
        fun();
        */




        /*
        //9求出100～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，
        //    其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数
        int j=0;
        int k=0;
        int l=0;
        int m=0;
        int sum=0;
        for(int i=100;i<=999;i++){
                k=i%10;
                j=i/10;
                l=j%10;
                m=j/10;
                sum=k*k*k+l*l*l+m*m*m;
                if(i==sum){
                    System.out.println(sum);
                }
            }
            */




        /*
        // 8. 编写程序数一下 1到 100的所有整数中出现多少个数字9。
        int count=0;
        int j=0;
        int k=0;
        for(int i=1;i<100;i++){
            if(i==9){
                    count++;
                }
                j=i%10;
                k=i/10;
                if(j==9){
                    count++;
                }
                if(k==9){
                    count++;
                }
               }
        System.out.println(count);
         */



        /*
        // 7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
     int i=1;
     int sum1=0;
     int sum2=0;
     int sum=0;
     for(;i<=100;i++){
         if(i%2==0){
             sum1-=(1/i);
         }else{
             sum2+=(1/i);
         }
     }
     sum=sum1+sum2;
     System.out.println(sum);
        */



     /*
        // 6. 求两个正整数的最大公约数
        //相减法
        Scanner input = new Scanner(System.in);
        System.out.print("请输入num1：");
        int num1 = input.nextInt();
        System.out.print("请输入num2：");
        int num2 = input.nextInt();
        if (num1 < num2) {
            int i = num1;
            num1 = num2;
            num2 = i;
            while (num1 - num2 != 0) {
                if (num1 < num2) {
                     i = num1;
                    num1 = num2;
                    num2 = i;
                }
                    i = num1 - num2;
                    num1 = num2;
                    num2=i;
                }
                System.out.print(num2);
            }
            // :辗转相除
        /*
        Scanner input=new Scanner(System.in);
        System.out.print("请输入num1：");
        int num1=input.nextInt();
        System.out.print("请输入num2：");
        int num2=input.nextInt();
        int sum=0;
        if(num1<num2){
            sum=num1;
            num1=num2;
            num2=sum;
            if(num1%num2!=0){
                sum=num1%num2;
                num1=num2;
                num2=sum;
            }
                System.out.println(num2);
            }else if(num1>num2){
            if(num1%num2!=0){
                sum=num1%num2;
                num1=num2;
                num2=sum;
            }
            System.out.println(num2);
        }else{
            System.out.println(num2);
        }
*/


        /*
        // 5. 输出乘法口诀表
        int i=1;
        for(;i<=9;i++){
            int j=1;
            for(;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print(" ");
            }
            System.out.println();
        }*/



        /*
        // 4. 输出 1000 - 2000 之间所有的闰年
        int i=1000;
        for(;i<=2000;i++){
            if(i%400==0){
                System.out.println(i);
            }else if(i%4==0&&i%100!=0){
                System.out.println(i);
            }
        }
         */



        /*
        // 3. 打印 1 - 100 之间所有的素数
         int j=0;
        for(int i=1;i<=100;i++) {
          if(isprime(i)){
          count++;
          if(count%10==0{
          System.out.println();

          }
          System.out.println(i+" ");
     */



        /*
        // 2. 判定一个数字是否是素数
        Scanner input=new Scanner(System.in);
        System.out.print("请输入数字：");
        int num=input.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("这个数不是素数");
                break;
            }
        }
            System.out.println("这个数是素数");
            */


        /*
        //1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
        Scanner input=new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age=input.nextInt();
        while(age>0){
        if(age>=56){
            System.out.println("老年");
            break;
        }else if(age>=29&&age<=55){
            System.out.println("中年");
            break;
        }else if(age>=18&&age<=28){
            System.out.println("青年");
            break;
        }else{
            System.out.println("少年");
            break;
        }
        }
       */
    }

}
