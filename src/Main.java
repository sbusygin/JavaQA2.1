public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketCost = 56000;
        int calculation = 20;

        int bonusMile = service.calculate(ticketCost);;
        System.out.println("Ваш билет куплен за: " + ticketCost);
        System.out.println("Вам начисленно " + bonusMile + " бонусных миль");

    }
}
