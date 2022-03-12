package lambda_expression.part2.supplierAndConsumer;

/*
Supplier - ФИ, содержащий один абстрактный метод.
Поставляет объекты, когда вызывается его метод.

Consumer - ФИ, содержащий один абстрактный метод и его работа противоположна ФИ Supplier.
 */

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class UseSupplier {
    // Создём метод, который возвращает ArrayList и принимает в параметр ФИ Supplier.
    public static ArrayList<Car> createCar(Supplier<Car> carSupplier) {
        ArrayList<Car> ar = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ar.add(carSupplier.get());
        }
        return ar;
    }

    // Работа ФИ Consumer().
    public static void changedCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }
    public static void main(String[] args) {
        ArrayList<Car> myArrayList = createCar(() -> new Car("VW", "Silver", 105));
        System.out.println(myArrayList);
        System.out.println("-------------------------------");

        changedCar(myArrayList.get(0), car -> {
            car.color = "red"; car.engine = 200;
        });
        System.out.println("Upgraded car: " + myArrayList);
    }
}

class Car {
    String model;
    String color;
    int engine;

    public Car(String model, String color, int engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}