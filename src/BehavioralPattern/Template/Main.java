package BehavioralPattern.Template;

public class Main {
    public static void main(String args[]){
        TemplateTestPaper testPaper=null;

        testPaper =new StudentA();
        testPaper.TemplateMethod();

        testPaper =new StudentB();
        testPaper.TemplateMethod();

    }
}
