package CreationalPattern.Prototype;

public class Resume implements Cloneable{ // 3
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;
    public Resume(String name){
        this.name=name;
        work=new WorkExperience();
    }
    private Resume(WorkExperience work){
        this.work=(WorkExperience)work.clone(); // 4
    }
    public void setPersonInfo(String sex,String age){
        this.sex=sex;
        this.age=age;
    }
    public void setWorkExperience(String workDate,String company){
        // 见https://github.com/echoTheLiar/JavaCodeAcc/tree/master/src/designpattern/prototype
    }
    public Object clone(){
        Resume Obj=new Resume(this.work);// 5
        Obj.name=this.name;// 软考代码没有，书上有
        Obj.sex=this.sex;// 软考代码没有，书上有
        Obj.age=this.age;// 软考代码没有，书上有
        return Obj;
    }
    // 软考代码没有，书上有
    public void Display(){
        System.out.println(name+sex+age);
    }

}
