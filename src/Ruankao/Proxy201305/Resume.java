package Ruankao.Proxy201305;

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
    }
    public void setWorkExperience(String workDate,String company){
    }
    public Object clone(){
        Resume Obj=new Resume(this.work);// 5
        return Obj;
    }

}
