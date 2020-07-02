package testbt;

public class CallPublicPrivate {
    public static void main(String[] args) {
        TestPublicPrivate testPublicPrivate = new TestPublicPrivate();
        testPublicPrivate.name = "MsThuy";
        testPublicPrivate.setID(13031995);
        testPublicPrivate.setAge(21);
//        System.out.println(testPublicPrivate.name);
//        System.out.println(testPublicPrivate.getAge());
//        System.out.println(testPublicPrivate.getID());
        System.out.println(testPublicPrivate.toString());
    }
}
