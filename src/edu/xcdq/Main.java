package edu.xcdq;

public class Main {


    public String name = "无名";
    public String sex = "man";

    public void print() {
        System.out.println("person的自白:\n我的昵称叫" + this.name + ",性别是:" + this.sex + "。");
    }
}

/**
 * 构造类的对象，并给属性赋值
 */

class TestSample {
    public static void main(String[] args) {
        Main main = new Main();
        main.name = "张三";
        main.sex = "男";
        System.out.println("姓名：" + main.name + "性别" + main.sex);
    }

}

