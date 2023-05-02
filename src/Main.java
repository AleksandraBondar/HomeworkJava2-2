public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishmentAmound = 1100;
        if (replenishmentAmound > 1000) {
            int bonus = replenishmentAmound / 100;
            int finishBalance = bonus + replenishmentAmound + balance;
            System.out.println("Ваш итоговый баланс: " + finishBalance);
            System.out.println("Количество начисленных бонусов: " + bonus);
        } else {
            int finishBalance = balance + replenishmentAmound;
            System.out.println("Ваш итоговый баланс: " + finishBalance);
            System.out.println("Бонусов нет");
        }


    }
}