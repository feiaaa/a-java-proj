package StructuralPattern.Adapter;

public class Adapter extends Client{
    private Server server=new Server();

    public void Request(){
        server.ServerRequest();
    }
}
