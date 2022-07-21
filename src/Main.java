public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat();
        barsik.age = 10;
        barsik.color = "Puppure";
        barsik.name = "BarsikStringVat public static void main(String[] args) {";


        barsik.jump();

        Cat vasya = new Cat();
        vasya.name = "Vasya";
        vasya.jump();

        int number = vasya.jump();
        System.out.println("number = " + number);

        System.out.println(6 + 11);
        System.out.println(2 + "m" + 11);
    }
}
