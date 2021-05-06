package edu.xcdq;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-06 10:17
 */
public class InnerClassTest {
    public int outFiled1 = 1;
    protected int outFiled2 = 2;
    int outFiled3 = 3;
    private int outFiled4 = 4;

    public InnerClassTest() {
        //在外部类对象内部，通过 new InnerClass ,直接创建内部类对象
        InnerClass innerOBJ = new InnerClass();
        System.out.println("创建" + this.getClass().getCanonicalName() + "对象");
        System.out.println("其内部类outFiled1字段的值为：" + innerOBJ.outFiled5);
        System.out.println("其内部类outFiled2字段的值为：" + innerOBJ.outFiled6);
        System.out.println("其内部类outFiled3字段的值为：" + innerOBJ.outFiled7);
        System.out.println("其内部类outFiled4字段的值为：" + innerOBJ.outFiled8);
        System.out.println(this.getClass().getCanonicalName() +"\n\n\n\sffewfadfrgadfgrefdsa");
        // this.getClass().getCanonicalName() 返回值为edu.xcdq.InnerClassTest
    }

    /**
     * getClass()是java中Object类的一个方法，其原型为：
     *
     * public final Class> getClass()
     *
     * 返回值为 当前运行时类的Class对象。
     * */

    public class InnerClass {
        public int outFiled5 = 5;
        protected int outFiled6 = 6;
        int outFiled7 = 7;
        private int outFiled8 = 8;

        public InnerClass() {
            System.out.println("创建" + this.getClass().getSimpleName() + "对象");
            System.out.println("其外部类outFiled1字段的值为：" + outFiled1);
            System.out.println("其外部类outFiled2字段的值为：" + outFiled2);
            System.out.println("其外部类outFiled3字段的值为：" + outFiled3);
            System.out.println("其外部类outFiled4字段的值为：" + outFiled4);
        }
    }

    public static void main(String[] args) {
        InnerClassTest outerOBJ = new InnerClassTest();
        //不在外部类内部使用方法：先外部类对象，由外部类对象.new 内部类构建方法的方式初级内部类对象
        InnerClass innerOBJ = outerOBJ.new InnerClass();
    }

}