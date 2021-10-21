package Ruankao.Adapter201605;

// Client,Target
class DutchAddress{
    public void Straat(){}
    public void PostCode(){}
    public void Plaats(){}
}

public class DutchAddressAdapter extends DutchAddress{
    private Address address; // 1
    public DutchAddressAdapter(Address addr){
        address=addr;
    }
    public void Straat(){
        address.Street(); // 2
    }
    public void PostCode(){
        address.Zip(); // 3
    }
    public void Plaats(){
        address.City(); // 4
    }
}

