package edu.xcdq;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-06 11:05
 */
public class InitialOrderTest {
    //静态变量
    public static String staticField = "静态变量";
    //变量
    public String field = "变量";
    // 静态初始化
    static {
        System.out.println("静态代码块初始化");
        System.out.println("静态变量" + staticField);
    }
    //代码块初始化
    {
        System.out.println("普通代码块初始化");
        System.out.println("普通变量"+field);
    }
    //构造方法
    public InitialOrderTest(){
        System.out.println("构造方法");
    }
    public static  void main(String [] args){
        new InitialOrderTest();
    }
}
