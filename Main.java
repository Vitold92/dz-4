public class Main {
    public static void main(String[] args) {
        SecondClass object = new SecondClass();
        int value = object.printAndReturn();
        System.out.println("~~~" + object.printAndReturn() + "~~~");

    }
}
