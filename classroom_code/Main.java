public class Main {
    public static void main(String[] args) {
        //编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化， 最后实现加减乘 除四种运算.
        Calculator calculator=new Calculator();
        System.out.println( calculator.Add());
        System.out.println(calculator.Sub());
        System.out.println(calculator.Mul());
        System.out.println(calculator.Div());
    }
}
class Calculator {
    private int num1;
    private int num2;

    public Calculator() {
        this.num1 = 10;
        this.num2 = 20;
    }

    public int Add() {
        return num1 + num2;
    }

    public int Sub() {
        if (num1 > num2) {
            return num1 - num2;
        } else if (num1 < num2) {
            return -(num2 - num1);
        } else {
            return 0;
        }
    }

    public int Mul() {
        return num1 * num2;
    }

    public double Div() {
        if (num1 > 0 && num2 > 0) {
            return (double) num1 / (double) num2;
        } else {
            return -1;
        }
    }
}