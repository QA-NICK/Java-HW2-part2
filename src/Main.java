public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int replenishedBalance = 1100;
        int bonus;
        int finalBalance;

        if (replenishedBalance > 1000) {
            bonus = replenishedBalance / 100;
            finalBalance = initialBalance + replenishedBalance + bonus;
        } else {
            finalBalance = initialBalance + replenishedBalance;
            bonus = 0;
        }
        System.out.println("текущий баланс " + finalBalance+"р." );
        System.out.println("бонус " + bonus+"р.");
    }
}
