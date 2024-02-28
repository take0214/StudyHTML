package app2;

public interface Vehicle {

    void describe();

    default void countWheel(){
        System.out.println("タイヤは4本です。");
    }

    default void forward(){
        System.out.println("前に進みます。");
    }

    static void startEngin(){
        System.out.println("エンジンをかけます。");
    }
}
