package Ruankao.Singleton201411;
// 此处c++改写为java,config即为singleton
public class Configure {
    private int data;
    private static Configure instance; // 1,2
    private Configure(){}
    public static Configure getInstance(){
        if(instance==null){
            instance=new Configure(); // 3
        }
        return instance;// 4
    }
    public void SetConfigureData(int data){
        this.data=data;
    }
    public int GetConfigureData(){
        return data;
    }



}
