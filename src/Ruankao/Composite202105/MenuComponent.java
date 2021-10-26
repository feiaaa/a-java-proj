package Ruankao.Composite202105;
import java.util.ArrayList;
import java.util.List;
// 组件类（含组合和叶子）
abstract class MenuComponent {
    protected String name; //1
    public void printName(){
        System.out.println(name);
    }
    public abstract boolean addMenuElement(MenuComponent element);// 2
    public abstract boolean removeMenuElement(MenuComponent element);
    public abstract List<MenuComponent> getElement();
}
// 单个叶子
class MenuItem extends MenuComponent{
    public MenuItem(String name){
        this.name=name;
    }

    @Override
    public boolean addMenuElement(MenuComponent element) {
        return false;
    }

    @Override
    public boolean removeMenuElement(MenuComponent element) {
        return false;
    }

    @Override
    public List<MenuComponent> getElement() {
        return null;
    }
}
// 组合
class Menu extends MenuComponent{
    private ArrayList<MenuComponent>elementList;//4

    public Menu(String name){
        this.name=name;
        this.elementList=new ArrayList<MenuComponent>();
    }
    @Override
    public boolean addMenuElement(MenuComponent element) {
        return elementList.add(element);
    }

    @Override
    public boolean removeMenuElement(MenuComponent element) {
        return elementList.remove(element);
    }

    @Override
    public List<MenuComponent> getElement() {
        return elementList;
    }
}