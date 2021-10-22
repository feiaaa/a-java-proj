package BehavioralPattern.Memento;

public class Main {
    public static void main(String args[]){
        // init
        Originator originator=new Originator();
        originator.setState("on");
        originator.Show();

        // save
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(originator.CreateMemento());

        // change status
        originator.setState("off");
        originator.Show();

        // recover
        originator.RecoverMemento(caretaker.getMemento());
        originator.Show();

    }
}
