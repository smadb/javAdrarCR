public class Main {
    public static void main(String[] args) {
        Class1 completeClass1 = new Class1("Clément","Renault");
        System.out.println(completeClass1);

        Class1 firstnameOnly = new Class1("Clément");
        System.out.println(firstnameOnly.firstname);
    }
}
