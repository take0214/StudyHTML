import java.util.Scanner;

import app1.LowerReader;
import app1.Reader;
import app1.UpperReader;
import app2.Bike;
import app2.Car;
import app2.FireEngine;
import app2.Vehicle;

public class Application {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("どちらを実行する？（抽象クラス：１、インターフェース：２）：");
            int num = scanner.nextInt();

            if (num == 1) {
                fileRead();
            } else if (num == 2) {
                vehicle();
            } else {
                System.out.println("入力が不正です");
                return;
            }
        }

    }

    private static void fileRead() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("読み込むファイルパスを入力：");
            String filePath = scanner.nextLine();

            System.out.print("テキストの出力方法を選択（大文字：１、小文字：２）：");
            int num = scanner.nextInt();

            Reader reader = null;
            if (num == 1) {
                reader = new UpperReader();
            } else if (num == 2) {
                reader = new LowerReader();
            } else {
                System.out.println("入力が不正です");
                return;
            }

            String content = reader.fileRead(filePath);
            content = reader.changeText(content);

            System.out.println(content);
        }
    }

    private static void vehicle() {

        System.out.println("--乗用車クラス--");
        // Vehicle car = new Car(); <-このように宣言すると、back()メソッドが実行できない。
        Car car = new Car();
        Vehicle.startEngin();
        car.describe();
        car.countWheel();
        car.forward();
        car.back();

        System.out.println("--バイククラス--");
        Vehicle bike = new Bike();
        Vehicle.startEngin();
        bike.describe();
        bike.countWheel();
        bike.forward();

        System.out.println("--消防車クラス--");
        FireEngine fireEngine = new FireEngine();
        Vehicle.startEngin();
        fireEngine.describe();
        fireEngine.countWheel();
        fireEngine.forward();
        fireEngine.back();
        fireEngine.waterCannon();

    }
}