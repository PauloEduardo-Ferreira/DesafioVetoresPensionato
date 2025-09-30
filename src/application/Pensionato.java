package application;

import entities.DadosEstudantes;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DadosEstudantes[] quartos = new DadosEstudantes[10];

        System.out.print("Quantos quartos serão alugados? ");
        int quartosAlugados = sc.nextInt();

        for (int i = 0; i <= quartosAlugados; i++){
            System.out.println();
            System.out.println("Quarto alugado #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            quartos[quarto] = new DadosEstudantes(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i <10; i++){
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i].getName() + ", " + quartos[i].getEmail());
            }
        }

        sc.close();
    }
}
