package Perfect;
import java.util.Arrays;//导入一个排序包
import java.util.Scanner;

//import java.util.Scanner;//导入包
public class helloworld {
    // 12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。
    // 13. 输出一个整数的每一位.
    // 14. 完成猜数字游戏





    //考试成绩保存在数组scores中 89，-23，64，91，119，52，73
    //通过自定义方法实现成绩排名操作，将成绩数组作为参数传入，并判断成绩有效性，输出前三名的成绩
    public static void main(String[] args){
       int[] scores={89,-23,64,91,119,52,73};
       helloworld hello=new helloworld();
         hello.Getscores(scores);

    }
    public  void  Getscores(int scores[] ){
        Arrays.sort(scores);
        for(int i=scores.length-1;i>=0;i--){//119,91,89,73,64,52,-23
            if (scores[i] >=0&&scores[i] <=100) {
                if(i>scores.length-5) {
                    System.out.println(scores[i]);
                }
            }

        }
            }
}


   /* public static void main(String[] args) {
        helloworld hello=new helloworld();
       int[] nums=hello.getArray(8);
       System.out.println(Arrays.toString(nums));
    }

        //写一个随机数组，然后以字符串形式输出
        public int[] getArray(int length){
        int[] nums=new int[length];//初始化一个数组，并定长度
        for(int i=0;i<nums.length;i++){
           int sum= (int)(Math.random()*100);
           nums[i]=sum;
        }
        return nums;
        }

}*/
        /*
        int[][] num={{1,2,3},{4,5,6}};
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.println(num[i][j]);
            }
            System.out.println();
        }
        */
        /*
        String[] hobbys={"imooc","爱慕课","www.imooc.com"};
        System.out.println("***使用foreach循环输出数组中的元素");
        for(String hobby:hobbys){
            System.out.println(hobby);
        }
         */
       /*
        String[] hobbys={"sports","game","movie"};
        System.out.println(Arrays.toString(hobbys));
        */
        /*
        int[] scores={78,93,97,84,63};
        Arrays.sort(scores);
        System.out.println("排序后数组中元素的值：");
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
        }
        */
        /*

        Scanner input=new Scanner(System.in);//创建Scanner对象
        System.out.print("请输入考试成绩信息");
        int score=input.nextInt();
        int count=0;
        System.out.println("加分前的分数"+score);
        for(int i=1;i<60;i++){
            count++;
            score++;
            if(score>=60){
                System.out.println("加分后的分数"+score);
                System.out.println("加分次数"+count);
                break;
            }
        }
    }
}
    */
    /*
    int[] nums={61,23,4,74,13,14,8,20};
      int max=nums[0];
      int min=nums[0];
      double sum=0;
      double avg=0;
      for(int i=0;i<nums.length;i++){
          if(max>nums[i]){

              max=nums[i];
          }
          if(min<nums[i]) {

              min=nums[i];
          }
          sum=sum+nums[i];

    }
      avg=sum/nums.length;
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(avg);
        */

    //  }

// }
