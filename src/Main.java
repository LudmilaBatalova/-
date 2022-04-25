public class Main {
    public static void main(String[] args) {
        int ticketPrice = 4000;
        int costBonus = 20;
        int bonusMiles = ticketPrice / costBonus;
        System.out.println("Начислено " + bonusMiles + " бонусных миль.");
    }
}
