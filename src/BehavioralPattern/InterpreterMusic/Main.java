package BehavioralPattern.InterpreterMusic;
// with bug
public class Main {
    public static void main(String[] args){
        Context context=new Context();
        context.setText("0 2 E 0.5 G 0.5 A 3 E 0 2 A ");
        AbstractExpression expression=null;
//        try {
            // try start
            while (context.getText().length()>0){
                String str=context.getText().substring(0,1) ;
                switch (str){
                    case "0":
                        expression=new Scale();break;
                    case "A": case "B": case "C":case "D": case "F": case "G": case "P": //P-休止符
                        expression=new Note();break;
                }
                System.out.println("express:"+expression);
                expression.Interpret(context);
            }
            // try end
//        }
//        catch (Exception e){
//            System.out.println("error:"+e);
//        }
    }
}
