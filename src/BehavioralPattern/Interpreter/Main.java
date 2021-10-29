package BehavioralPattern.Interpreter;

import java.util.ArrayList;

// 正则表达式里的终结符表达式和非终结符表达式
public class Main {
    public static void main(String[] args){
        Context context=new Context();
        ArrayList<AbstractExpression> list=new ArrayList<AbstractExpression>();
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression ae:list) {
            ae.Interpret(context);
        }
    }
}
