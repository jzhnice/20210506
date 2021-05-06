package edu.xcdq;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-06 09:08
 */

/**
 * 创建对象的时候就进行赋值操作
 */
public class Person {
    public String name = "无名";
    public String sex = "man";

    public Person() {
        this.name = "山姆";
        this.sex = "男";
    }

    public boolean print() {
        System.out.println("person的自白:\n我的昵称叫" + this.name + ",性别是:" + this.sex + "。");
        return true;
    }
//    public void print() {
//        System.out.println("person的自白:\n我的昵称叫" + this.name + ",性别是:" + this.sex + "。");
//
//    }
}

/**
 * // * 创建类的对象 并给属性赋值
 * // *
 */

class TestSample1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "张三";
        person.sex = "男";
        System.out.println(person.print());
    }
}




