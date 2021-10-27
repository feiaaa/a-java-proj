package Ruankao.Singleton201411;
// 此处c++改写为java,config即为singleton
public class Configure {
    private int data;
    private static Configure instance;
    private Configure(){}
    public static Configure getInstance(){
        if(instance==null){
            instance=new Configure();
        }
        return instance;
    }
    public void SetConfigureData(int data){
        instance.data=data;
    }
    public int GetConfigureData(){
        return instance.data;
    }



}
