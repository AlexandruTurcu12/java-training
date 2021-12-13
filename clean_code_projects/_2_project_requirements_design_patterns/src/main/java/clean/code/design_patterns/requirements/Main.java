package clean.code.design_patterns.requirements;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player.Builder("Lionel","Messi")
                .setTeam("Paris Saint-Germain")
                .build();

        Player player2 = new Player.Builder("Cristiano","Ronaldo")
                .setTeam("Manchester United")
                .build();

        Scanner item = new Scanner(System.in);
        System.out.println("Prenumele jucatorului: ");
        String firstName = item.nextLine();
        System.out.println("Numele jucatorului: ");
        String lastName = item.nextLine();
        System.out.println("Echipa jucatorului: ");
        String team = item.nextLine();
        System.out.println("Numarul de goluri al jucatorului: ");
        int nrGoals = Integer.parseInt(item.nextLine());

        Player player3 = new Player.Builder(firstName, lastName)
                .setTeam(team)
                .setGoals(nrGoals)
                .build();

        System.out.println(player1.getFirstName() + " " + player1.getLastName() + " - " + player1.getTeam());
        System.out.println(player2.getFirstName() + " " + player2.getLastName() + " - " + player2.getTeam());
        System.out.println(player3.getFirstName() + " " + player3.getLastName() + " - " + player3.getTeam() + " - " + player3.getGoals());

        int nr;
        String restaurant;
        System.out.println("De la ce restaurant doriti sa comandati? ");
        restaurant = item.nextLine();
        System.out.println("Cate produse doriti sa comandati? ");
        nr = Integer.parseInt(item.nextLine());

        Order order1 = new RegularOrder();
        if(restaurant.contains("pizza") || restaurant.contains("Pizza")){
            Order order2 = new MinimumOrder(order1);
            order2.sum(nr, restaurant);
        }else System.out.println("Comanda va costa " + order1.sum(nr, restaurant));

    }
}
