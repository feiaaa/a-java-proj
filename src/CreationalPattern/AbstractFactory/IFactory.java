package CreationalPattern.AbstractFactory;

interface IFactory {
    IUser CreateUser();
    IDepartment CreateDepartment();
}
class SqlServerFactory implements IFactory{
    public IUser CreateUser(){
        return new SqlServerUser();
    }
    public IDepartment CreateDepartment(){
        return new SqlserverDepartment();
    }
}

class AccessFactory implements IFactory{
    public IUser CreateUser(){
        return new AccessUser();
    }
    public IDepartment CreateDepartment(){
        return new AccessDepartment();
    }
}