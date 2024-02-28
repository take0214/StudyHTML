package app2;

public class Bike implements Vehicle {

    @Override
    public void describe() {
        System.out.println("バイクです。");
    }

    @Override
    public void countWheel() {
        System.out.println("タイヤは2本です。");
    }

}
