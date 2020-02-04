package Perfect;
import java.util.Scanner;
//接收三个班级各四名学员的成绩信息，然后计算每个班级学员的平均分
//二重循环，外层控制班级数量，内层控制学员数量
public class demo01 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int classNum=3;
        int stuNum=4;
        double sum=0;
        double avg=0;
    for(int i=1;i<=classNum;i++){
        sum=0;
        System.out.println("第"+i+"个班级的成绩信息");
        for(int j=1;j<=stuNum;j++){
            System.out.print("第"+j+"个学员成绩");
            int score=input.nextInt();
            sum=sum+score;

        }
        avg=sum/stuNum;
        System.out.println("第"+i+"个班级学生的平均分为"+avg);
    }

}

}
