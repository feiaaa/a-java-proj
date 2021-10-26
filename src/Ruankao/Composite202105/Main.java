package Ruankao.Composite202105;

import java.util.List;

public class Main {
    public static void main(String args[]){
        MenuComponent mainMenu=new Menu("Insert");
        MenuComponent subMenu=new Menu("Chart");
        MenuComponent element=new MenuItem("on this sheet");
        mainMenu.addMenuElement(subMenu);
        subMenu.addMenuElement(element);
        printMenus(mainMenu);

    }

    private static void printMenus(MenuComponent ifile) {
        ifile.printName();
        List<MenuComponent>children=ifile.getElement();

        if (children==null)return;
        for (MenuComponent element:children) {
            printMenus(element);
        }
    }

}
