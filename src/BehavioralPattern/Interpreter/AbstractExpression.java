package BehavioralPattern.Interpreter;
// 声明一个抽象的解释操作，语法树中所有节点共享
abstract class AbstractExpression {
    abstract public void Interpret(Context context);
}
class TerminalExpression extends AbstractExpression{

    @Override
    public void Interpret(Context context) {
        System.out.println("终结符解释器");
    }
}
class NonTerminalExpression extends AbstractExpression{

    @Override
    public void Interpret(Context context) {
        System.out.println("非终结符解释器");
    }
}
