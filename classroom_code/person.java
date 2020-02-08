import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*public class person {
    public static void main(String[] args) {
        Text text=new Text();
        text.show();
        Text.change();
        System.out.println("count="+Text.count);
    }

}
class Text{
    public int age=18;
    public String name="张三";
    public String sex="男";
    public static int count;
    public void show(){
        System.out.println("我的名字叫"+name+"，性别是"+sex+"性，年龄是"+age+"岁。");
    }
    public static void change(){
        count=100;
    }

}
 */
/*
//直接使用public;
public class person {
    public static void main(String[] args) {
Text text=new Text();
        System.out.println("我叫"+text.name+",今年"+text.age+"岁了");
    }
}
class Text{
    public String name="张三";
    public int age=18;
}
*/
/*
//使用private封装属性
public class person {
    public static void main(String[] args) {
        Text text=new Text();
        text.show();
    }
    }
    class Text{
    private String name="张三";
    private int age=18;
    public  void show(){
        System.out.println("我叫"+name+",今年"+age+"岁了");
    }
    }
    */
/*
public class person {
    public static void main(String[] args) {
Text text=new Text();
text.setName("张三");
String name=text.getName();
text.setAge(18);
int age=text.getAge();
        System.out.println(name);
        System.out.println(age);
        text.show();
    }
    }
    class Text{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
   public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println("name:"+name+"  age:"+age);
    }
    }
    */
/*
public class person {
    public static void main(String[] args) {
        //构造方法
        Text p1 = new Text();
        p1.show();
        Text p2 = new Text("李四", 16, "女");
        p2.show();
    }
}
    class Text{
        private String name;
        private int age;
        private String sex;
        public Text(){//无参构造方法
        this.name="张三";
        this.age=18;
         this.sex="男";
        }
        public Text(String name,int age,String sex){//含参构造方法
            this.name=name;
            this.age=age;
            this.sex=sex;
        }
        public void show(){
            System.out.println("姓名:"+name+"   年龄:"+age+"     性别："+sex);
        }
    }*/
//this的使用
/*
public class person {
    public static void main(String[] args) {
        Text text=new Text();
        text.show();
    }
    }
    class Text{
    private String name;
    private int age;
    private String sex;
    public Text(){
        this("张三", 18, "男");
    }
        public Text(String name,int age,String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show(){
        System.out.println("姓名："+name+"   年龄："+age+"     性别："+sex);
    }
    }
    */
//代码块部分
         /*
         //1.普通代码块(少见)
public class person {
    public static void main(String[] args) {
        {
            int x = 1;
            System.out.println("x1=" + x);
        }
        int x=100;
        System.out.println("x2="+x);
    }
    }*/
         /*
         //构造快
public class person {
    public static void main(String[] args) {
        Text text=new Text();
        text.show();
    }
}
class Text{
    private String name;
    private int age;
    private String sex;
    public Text() {
        System.out.println("I am Person init()!");
    }
    //实例代码块
    {
        this.name ="张三";
        this.age = 18;
        this.sex = "男";
        System.out.println("I am instance init()!");
    }
    public void show(){
        System.out.println("name:"+name+"   age:"+age+"   sex:"+sex);
    }
}
 */
         //静态代码块
/*
public class person {
    public static void main(String[] args) {
        Text text1=new Text();
        System.out.println(" ");
        Text text2=new Text();

    }
    }
    class Text{
        private String name;
        private int age;
        private String sex;
        private static int count=0;
        public Text() {
            System.out.println("I am Person init()!");
        }
        {
            this.name ="张三";
            this.age = 18;
            this.sex = "男";
            System.out.println("I am instance init()!");
        }
        //静态代码块
        static{
            count=10;
            System.out.println("I am static init()!");
        }
        public void show(){
            System.out.println("name:"+name+"   age:"+age+"   sex:"+sex);
        }
    }
    */
/*
    //匿名对象
    public class person {
        public static void main(String[] args) {
 new Text("张三",18,"男").show();
        }
        }
class Text {
    private String name;
    private int age;
    private String sex;

    public Text(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show(){
        System.out.println("name:"+name+"   age:"+age+"   sex:"+sex);
    }
}
*/
/*
public class person {
    public static void main(String[] args) {
        // 设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象。
        Text text1=new Text("张三",18,"男性");
        text1.show();
        Text text2=new Text("李四",16,"女性");
        text2.show();
        Text text3= new Text("王五",17,"男性");
        text3.show();
        text1.eat();
        text2.work();
        text3.play();
    }
    }
class Text{
    private String name;
    private int age ;
    private String sex;
    public Text(String name,int age ,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void eat(){
        System.out.println(this.name+"喜欢吃甜食");
    }
    public void play(){
        System.out.println(this.name+"喜欢玩儿乒乓求");
    }
    public void work(){
        System.out.println(this.name+"现在是一名学生");
    }
    public void show(){
        System.out.println("我的名字叫"+name+",性别是"+sex+"，今年"+age+"岁了");
    }
}*/
/*
public class person {
    public static void main(String[] args) {
        // 实现交换两个变量的值。要求：需要交换实参的值。

        Text text=new Text(10,20);
        text.show();
        text.change();

    }
    }
    class Text {
        private int a;
        private int b;

        public Text(int a,int b) {
           this.a=a;
           this.b=b;
        }
        public void show(){
            System.out.println("交换前 a="+a+"   b="+b);
        }
        public void change(){
            int c=0;
            c=a;
            a=b;
            b=c;
            System.out.println("交换后 a="+a+"   b="+b);
        }

    }*/
public class person {

    public static void main(String[] args) {
     
    }


}

