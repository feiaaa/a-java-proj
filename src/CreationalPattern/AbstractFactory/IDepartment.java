package CreationalPattern.AbstractFactory;

interface IDepartment {
    void Insert(Department department);
    Department GetDepartment(int id);

}
class SqlserverDepartment implements IDepartment{
    public void Insert(Department department){
        System.out.println("add a record to Table：Department, Sql");
    }
    public Department GetDepartment(int id){
        System.out.println("get a record from Table：Department, Sql by id :"+id);
        return null;
    }
}
class AccessDepartment implements IDepartment{
    public void Insert(Department department){
        System.out.println("add a record to Table：Department, Access");
    }
    public Department GetDepartment(int id){
        System.out.println("get a record from Table：Department, Access by id :"+id);
        return null;
    }
}
