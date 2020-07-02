package testbt;

public class Person {
    public String name;
    public int age;
    public int leg;

    public Person(String ten,int tuoi,int chan) {
        this.name = ten;
        this.age = tuoi;
        this.leg = chan;
    }
    public Person() {
        name = "nam";
        age = 21;
        leg = 2;
    }
    public String sayHello(){
        return "Hello World";
    }

    public String getName() {
       return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getLeg() {
        return this.leg;
    }

    public static void main(String[] args) {
      Person person = new Person("Tea", 21,2);
      Person person1 = new Person("Thui",21,2 );
        System.out.println(person.sayHello());
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.leg);
//        Hoặc có thể truy xuất thuộc tính qua phương thức getName(),getAge()...
//        System.out.println(person1.sayHello());
//        System.out.println(person1.getName());
//        System.out.println(person1.getAge());
//        System.out.println(person1.getLeg());
//      Person person2 = new Person();
//        System.out.println(person2.getName());
//        System.out.println(person2.getAge());
//        System.out.println(person2.getLeg());
    }
}
