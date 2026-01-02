package org.example;

public class Burim {

    private String emer;
    private boolean iLire;

    public Burim(String emer) {
        this.emer = emer;
        this.iLire = true;
    }

    public boolean eshteILire() {
        return iLire;
    }

    public void ze() {
        iLire = false;
    }

    public void liro() {
        iLire = true;
    }
}
