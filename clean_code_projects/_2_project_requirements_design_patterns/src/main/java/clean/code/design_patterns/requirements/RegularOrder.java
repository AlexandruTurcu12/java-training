package clean.code.design_patterns.requirements;

import java.util.Scanner;

public class RegularOrder implements Order{
    @Override public int sum(int nr, String restaurant){

        int suma = 0;
        Scanner item = new Scanner(System.in);
        for (int i=0;i<nr; i++) {
            System.out.println("Produsul cu numarul " + (i+1) + " costa ");
            int product = Integer.parseInt(item.nextLine());
            suma+= product;
        }
        return suma;
    }
}
