package Ruankao.Strategy202011;

interface QuackBehavior {
    public void quack();
}
class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("发出gaga！");
    }
}
class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("发出摩擦声！");
    }
}
class QuackNoWay implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不发声！");
    }
}
