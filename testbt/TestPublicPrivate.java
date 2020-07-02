package testbt;

public class TestPublicPrivate {
    public String name = "MrTea";
    private int age = 21;
    private int ID = 14031995;
    public TestPublicPrivate(){

    }
    public TestPublicPrivate(String name, int age, int ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "TestPublicPrivate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }
}
