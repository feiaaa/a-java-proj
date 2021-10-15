package BehavioralPattern.Template;

abstract class TemplateTestPaper {
    public void Q1(){
        System.out.println("Q1:");
    }
    public void Q2(){
        System.out.println("Q2:");
    }
    public abstract void A1();
    public abstract void A2();

    public void TemplateMethod(){
        Q1();
        A1();
        Q2();
        A2();
        System.out.println("=======");
    }
}

class StudentA extends TemplateTestPaper{

    @Override
    public void A1() {
        System.out.println("a-a1");
    }

    @Override
    public void A2() {
        System.out.println("a-a2");
    }
}
class StudentB extends TemplateTestPaper{

    @Override
    public void A1() {
        System.out.println("b-a1");
    }

    @Override
    public void A2() {
        System.out.println("b-a2");
    }
}

