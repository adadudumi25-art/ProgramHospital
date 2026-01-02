package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Spitali spitali = new Spitali();

        System.out.print("Sa paciente do te shtosh? ");
        int nrPacientesh = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= nrPacientesh; i++) {

            System.out.println("\nPacienti " + i);

            System.out.print("Emri: ");
            String emri = sc.nextLine();

            System.out.print("Urgjenca (1=shume kritike, 2=kritike, 3=mesatare, 4=e ulet): ");
            int urgjenca = sc.nextInt();
            sc.nextLine();

            Pacient p = new Pacient(i, emri, urgjenca);
            spitali.shtoPacient(p);
        }

        System.out.println("\n--- FILLON SIMULIMI I TRAJTIMIT ---");
        spitali.simuloTrajtimin();

        sc.close();
    }
}

