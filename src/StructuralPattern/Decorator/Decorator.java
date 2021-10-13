package StructuralPattern.Decorator;

class DecoratorClothes extends Person {
    protected  Person person;


    public void Decorate(Person person){
        this.person=person;
    }
    @Override
    public void Show() {
        if(person != null){
            person.Show();
        }
    }
}

class TShirt extends DecoratorClothes {

    @Override
    public void Show() {
        super.Show();
        System.out.println("T-shirt");

    }
}
class Trousers extends DecoratorClothes {

    @Override
    public void Show() {
        super.Show();
        System.out.println("Trousers");
    }
}
