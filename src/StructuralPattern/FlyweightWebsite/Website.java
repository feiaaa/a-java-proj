package StructuralPattern.FlyweightWebsite;

abstract class Website {
    abstract public void Use(User user);
}
class ConcreteWebsite extends Website{
    private String name="";
    public ConcreteWebsite(String name){
        this.name=name;
    }
    @Override
    public void Use(User user) {
        System.out.println("分类："+name+" user："+user.getName());
    }
}