public class Main {
    public static void main(String[] args) {
        int ticketCost = 56000;
        int calculation = 20;

        int bonusMile = ticketCost / calculation;
        System.out.println("Ваш билет куплен за: " + ticketCost);
        System.out.println("Вам начисленно " + bonusMile + " бонусных миль");
    }
}
