package StructuralPattern.Composite;

//组件 接口描述了树中简单项目和复杂项目所共有的操作。
abstract class Component {
    protected String name;
    public Component(String name){
        this.name=name;
    }
    public abstract void Add(Component c);
    public abstract void Remove(Component c);
    public abstract void Display(int depth); // 叶子和叶子群组合，构成树，获取树的深度

}
