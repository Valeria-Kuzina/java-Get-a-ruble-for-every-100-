public class Main {

    public static void main(String args[]) {
        // TODO: в переменную refill ввести сумму пополнения счёта
        double refill = 100;
        int bonus = refill >= 1000 ? (int) (refill / 100) : 0;
        double balance = 100 + refill + bonus;
        System.out.print("Итоговый счёт(в рублях) = " + balance);
    }
}
