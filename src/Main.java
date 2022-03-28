public class Main {
    public static void main(String[] args) {

        int initialBalance = 200;
        int amount = 1500;
        int bonus = amount / 100;

        if (amount < 1000) {
            bonus = 0;
        }

        int total = initialBalance + amount + bonus;
        System.out.println(total);
        System.out.println(bonus);
    }
}