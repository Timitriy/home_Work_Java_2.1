public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1570;
        int bonusPrice = 20;
        int bonusForMiles = ticketPrice / bonusPrice;
        System.out.println("Вам доступно"+ " " + bonusForMiles + " " + "бонусных миль.");
    }
}