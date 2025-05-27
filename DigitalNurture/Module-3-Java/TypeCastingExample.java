public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleValue = 9.78;
        int intValue = (int) doubleValue;  // double to int

        int anotherInt = 42;
        double anotherDouble = (double) anotherInt;  // int to double

        System.out.println("Double to int: " + intValue);
        System.out.println("Int to double: " + anotherDouble);
    }
}
