package Ruankao.Proxy201305;

/*
* java 拥有接口cloneable https://docs.oracle.com/javase/7/docs/api/java/lang/Cloneable.html
* */

public class Main {
    public static void main(String args[]){
        Resume a =new Resume("zhangsan");
        a.setPersonInfo("male","29");
        a.setWorkExperience("1998-2000","xxx company");
        Resume b= (Resume)a.clone();// 6
        b.setWorkExperience("2001-2006","yy company");
    }
}
