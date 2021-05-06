package edu.xcdq;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-06 09:40
 */
public class chongzai {

        public String name = "无名";
        public String sex = "man";

        public chongzai(){
            this.name = "山姆";
            this.sex = "男";
        }
        public chongzai(String name) {
            this.name = name;
        }
        public chongzai(String name,String sex){
            super();
            this.name = name;
            this.sex = sex;
        }

        public void print() {
            System.out.print("person的自白:\n我的昵称叫" + this.name + ",性别是:" + this.sex + "。\n");


        }
    }

    /**
     * */
    class T{
        public static void main(String[] args) {
            chongzai c = new chongzai();
            c.print();
            chongzai l  = new chongzai("李四");
            l.print();
            chongzai a = new chongzai("小李","女");
            a.print();
        }
    }
