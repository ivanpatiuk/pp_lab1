package lab1_1;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.LinkedList;

public class lab1_11 {
    public static class Car {
        private String mark;

        public String getMark() { return mark; }
        public void setMark(String mark) { this.mark = mark; }

        public Car() { }
        public Car(String str) { mark = str; }
    }

    public static class Driver {
        private String firstName;
        private String lastName;
        private int age;

        public Driver() { }
        public Driver(String s1, String s2, int age) {
            firstName = s1;
            lastName = s2;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Name: " + firstName + " " + lastName + ", age: " + age;
        }
    }

    public static class Taxi {
        private Car car;
        private boolean available = true;
        private LinkedList<Driver> drivers = new LinkedList<>();

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public Taxi() {
        }

        public Taxi(Car car) {
            this.car = car;
        }

        public Taxi(Car car, LinkedList<Driver> driversList) {
            this.car = car;
            drivers = driversList;
        }

        public Car getCar() {
            return car;
        }

        public void setCar(Car car) {
            this.car = car;
        }

        public LinkedList<Driver> getDrivers() {
            return drivers;
        }

        public void addDriver(Driver driver) {
            drivers.add(driver);
        }

        public void removeDriver(Driver driver) {
            drivers.add(driver);
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append("Car: ");
            result.append(car.getMark());
            result.append(", Drivers: ");
            for (Driver i : drivers) {
                result.append(i.toString());
                result.append(" | ");
            }
            return result.toString();
        }
    }

        public static class Order {
            Taxi taxi;
            public Order() {}

            public void makeOrder(Taxi taxi) { taxi.setAvailable(false); }
            public void freeOrder() { taxi.setAvailable(true); }
        }

        public static void main(String[] args) {
            Car car = new Car("Suzuki");
            Driver driver1 = new Driver("Ivan", "Pupkin", 20);
            Driver driver2 = new Driver("Olexandr", "Avramenko", 45);
            Driver driver3 = new Driver("Oleh", "Panasenko", 35);
            Taxi taxi = new Taxi(car);
            taxi.addDriver(driver1);
            taxi.addDriver(driver2);
            taxi.addDriver(driver3);
            System.out.println(taxi.toString());

            Order order = new Order();
            order.makeOrder(taxi);

            System.out.println(taxi.isAvailable());

        }
}
