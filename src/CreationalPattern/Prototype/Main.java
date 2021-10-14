package CreationalPattern.Prototype;

/*
* 201305
* java 拥有接口cloneable https://docs.oracle.com/javase/7/docs/api/java/lang/Cloneable.html
*
* 用原型模式,减少实例化。否则就是：
* Resume a =new Resume("zhangsan");
* Resume b =new Resume("zhangsan");
* ……
* */

public class Main {
    public static void main(String args[]){
        Resume a =new Resume("zhangsan");
        a.setPersonInfo("male","29");
        a.setWorkExperience("1998-2000","xxx company");
        Resume b= (Resume)a.clone();// 6
        b.setWorkExperience("2001-2006","yy company");

        // 软考代码没有，书上有
        b.Display();
    }
}
