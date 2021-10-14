package CreationalPattern.Prototype;

public class WorkExperience implements Cloneable { // 1
    private String workDate;
    private String company;
    public Object clone(){
        WorkExperience Obj=new WorkExperience(); // 2
        Obj.workDate=this.workDate;
        Obj.company=this.company;
        return Obj;
    }
}
