package CreationalPattern.AbstractFactory;

class User{

}

interface IUser {
    void Insert(User user);
    User GetUser(int id);

}



class SqlServerUser implements IUser{
    public void Insert(User user){
        System.out.println("add a record to Table：User, Sql");
    }
    public User GetUser(int id){
        System.out.println("get a record from Table：User, Sql by id :"+id);
        return null;
    }

}
class AccessUser implements IUser{
    public void Insert(User user){
        System.out.println("add a record to Table：User, Access");
    }
    public User GetUser(int id){
        System.out.println("get a record from Table：User, Access by id :"+id);
        return null;
    }

}