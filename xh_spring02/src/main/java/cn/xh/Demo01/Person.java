package cn.xh.Demo01;

public class Person {
    private String name;
    private Car car;

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

        public Person(String name,Car car){
        this.name = name;
        this.car = car;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
