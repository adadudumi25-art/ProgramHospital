package org.example;

import java.util.ArrayList;

public class Spitali {

    private ArrayList<Pacient> pacientet;
    private Burim mjek;
    private Burim infermier;
    private Burim dhoma;
    private Burim pajisje;

    public Spitali() {
        pacientet = new ArrayList<>();

        mjek = new Burim("Mjek");
        infermier = new Burim("Infermier");
        dhoma = new Burim("Dhoma");
        pajisje = new Burim("Pajisje");
    }

    public void shtoPacient(Pacient p) {
        pacientet.add(p);
        System.out.println("U shtua: " + p);
    }

    // gjen pacientin me urgjencen me te larte (numrin me te vogel)
    private Pacient gjejPacientMeUrgjent() {
        Pacient meUrgjent = pacientet.get(0);

        for (int i = 1; i < pacientet.size(); i++) {
            if (pacientet.get(i).getUrgjenca() < meUrgjent.getUrgjenca()) {
                meUrgjent = pacientet.get(i);
            }
        }
        return meUrgjent;
    }

    public void simuloTrajtimin() {

        while (!pacientet.isEmpty()) {

            if (!mjek.eshteILire() || !infermier.eshteILire()
                    || !dhoma.eshteILire() || !pajisje.eshteILire()) {
                return;
            }

            Pacient p = gjejPacientMeUrgjent();
            pacientet.remove(p);

            mjek.ze();
            infermier.ze();
            dhoma.ze();
            pajisje.ze();

            System.out.println("\nFilloi trajtimi per: " + p);

            while (!p.getFaza().equals("PERFUNDUAR")) {
                p.kaloFazen();
                System.out.println(p);
            }

            mjek.liro();
            infermier.liro();
            dhoma.liro();
            pajisje.liro();

            System.out.println("Trajtimi perfundoi.\n");
        }
    }
}

