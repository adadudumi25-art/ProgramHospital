package org.example;

public class Pacient {

    private int id;
    private String emri;

    // urgjenca: 1 = shume kritike, 2 = kritike, 3 = mesatare, 4 = e ulet
    private int urgjenca;

    // faza: PRITJE, DIAGNOSTIKIM, TRAJTIM, RIKUPERIM, PERFUNDUAR
    private String faza;

    public Pacient(int id, String emri, int urgjenca) {
        this.id = id;
        this.emri = emri;
        this.urgjenca = urgjenca;
        this.faza = "PRITJE";
    }

    public int getUrgjenca() {
        return urgjenca;
    }

    public String getFaza() {
        return faza;
    }

    public void kaloFazen() {
        if (faza.equals("PRITJE")) {
            faza = "DIAGNOSTIKIM";
        } else if (faza.equals("DIAGNOSTIKIM")) {
            faza = "TRAJTIM";
        } else if (faza.equals("TRAJTIM")) {
            faza = "RIKUPERIM";
        } else if (faza.equals("RIKUPERIM")) {
            faza = "PERFUNDUAR";
        }
    }

    public String toString() {
        return "Pacienti " + id + " (" + emri + ") | urgjenca: " + urgjenca + " | faza: " + faza;
    }
}

