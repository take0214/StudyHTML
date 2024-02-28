package app2;

public class Car implements Vehicle {

    @Override
    public void describe() {
        System.out.println("乗用車です。");
    }

    public void back() {
        System.out.println("後ろに下がります。");
    }

}
