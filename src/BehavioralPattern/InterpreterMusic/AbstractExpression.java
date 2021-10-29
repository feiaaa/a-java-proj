package BehavioralPattern.InterpreterMusic;

// 表达式类
abstract class AbstractExpression {
    public void Interpret(Context context){
        if(context.getText().length()==0)return;
        String playKey=context.getText().substring(0,1);
        context.setText(context.getText().substring(2));
        double playValue=Double.parseDouble(context.getText().substring(0,context.getText().indexOf(" ")) );
        context.setText(context.getText().substring(context.getText().indexOf(" ")+1));

        Execute(playKey,playValue);

    };
    abstract public void Execute(String key,Double value);
}
// 音符类
class Note extends AbstractExpression{
    @Override
    public void Execute(String key, Double value) {
        String note="";
        switch (key){
            case "C":
                note="1";break;
            case "D":
                note="2";break;
            case "E":
                note="3";break;
            case "F":
                note="4";break;
            case "G":
                note="5";break;
            case "A":
                note="6";break;
            case "B":
                note="7";break;
        }
        System.out.println("note:"+note);
    }

}

// 音符类
class Scale extends AbstractExpression{
    String scale="";
    @Override
    public void Execute(String key, Double value) {
        switch (value.intValue()){
            case 1:
                scale="low";break;
            case 2:
                scale="mid";break;
            case 3:
                scale="high";break;
        }
        System.out.println("scale:"+scale);
    }
}
