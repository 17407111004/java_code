package Perfect;
import java.util.Scanner;
import java.util.Random;
public class homework {
    public static void main(String[] args) {
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
        // 2. 判定一个数字是否是素数
        // 3. 打印 1 - 100 之间所有的素数
        // 4. 输出 1000 - 2000 之间所有的闰年
        // 5. 输出乘法口诀表
        // 6. 求两个正整数的最大公约数
        // 7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
        // 8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。
        // 9. 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，
        //    其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
        // 10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误
        //      ， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
        // 11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
        // 12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。
        // 13. 输出一个整数的每一位.
        // 14. 完成猜数字游戏
        /*
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int toGuess = random.nextInt(100);
        //System.out.println("toGuess: " + toGuess);
        while (true) {
            System.out.print("请输入你猜的数字:");
            int num = input.nextInt();
            if (num > toGuess) {
                System.out.println("猜大了，在猜");
            } else if (num < toGuess){
                System.out.println("猜小了，再猜");
        }else{
            System.out.println("恭喜你，猜中了");
            break;
        }
    }
input.close();

            //猜数字游戏
        /*
        //找到100到200之间所有三的倍数
        int i=100;
        while(i<=200){
            if(i%3!=0){
                i++;
                continue;
            }
                System.out.println(i);
                i++;
        }

        /*
        //找到100到200之间的第一个3的倍数
        int i=100;
        while(i<=200){
            if(i%3==0){
                System.out.println(i);
                break;
            }
            i++;
        }
        /*
        //计算1！+2！+3！+4！+5！的值
        int i=1;
        int sum=0;
        while(i<=5){
            int num=1;
            int j=1;
            while(j<=i){
                num*=j;
                j++;
            }
            sum+=num;
            i++;
        }
        System.out.println(sum);
        /*
        //5的阶乘
        int i=2;
        int sum=1;
        while(i<6){
            sum*=i;
            i++;
        }
        System.out.println(sum);
        /*
        //计算1到100的和
        int i=1;
        int sum=0;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println(sum);
        /*
        //打印1到10的数字
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        /*
        //根据day的值确定星期
        Scanner input=new Scanner(System.in);
        System.out.print("请输入：");
        int day=input.nextInt();
        switch(day){
            case 1:{
                System.out.println("星期一");
                break;
            }
            case 2:{
                System.out.println("星期二");
                break;
            }
            case 3:{
                System.out.println("星期三");
                break;
            } case 4:{
                System.out.println("星期四");
                break;
            }
            case 5:{
                System.out.println("星期五");
                break;
            }
            case 6:
            case 7:{
                System.out.println("周末");
                break;
            }
            default:{
                System.out.println("输入有误");
                break;
            }
        }
        /*
        //判断是否是闰年
        Scanner input=new Scanner(System.in);
        System.out.println("请输入：");
        int num=input.nextInt();
        if(num%400==0){
            System.out.println("世纪闰年");
        }else if(num%4==0&&num%100!=0){
            System.out.println("闰年");
        }else{
            System.out.println("不是闰年");
        }
        /*
        //判断一个数是正数还是负数
        Scanner input=new Scanner(System.in);
        System.out.println("请输入：");
        int num=input.nextInt();
        if(num>0){
            System.out.println("正数");
        }else if(num<0){
            System.out.println("负数");
        }else{
            System.out.println("零");
        }
        */
        /*
        //判断一个数是奇数还是偶数
        Scanner input=new Scanner(System.in);
        System.out.print("请输入：");

        int num=input.nextInt();
        if(num%2==0){
            System.out.println("偶数");

        }else{
            System.out.println("奇数");
        }

         */
    }
}
