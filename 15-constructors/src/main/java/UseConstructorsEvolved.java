package oop.lab02.constructors;

class UseConstructorsEvolved {

    public static void main(final String[] args) {
        // 1) Creare un treno con numero di posti di default, come nel caso
        // precedente (serve a verificare la nuova implementazione di Train()).
        Train t1 = new Train();
        Train t2 = new Train(20, 200);
        Train t3 = new Train(35, 165);
        t1.printTrainInfo();
        t2.printTrainInfo();
        t3.printTrainInfo();
        // 2) Creare i seguenti treni usando il costruttore Train(int nFCSeats, int
        // nSCSeats)
        // - nFCSeats = 20; nSCSeats= 200;
        // - nFCSeats = 35; nSCSeats= 165;
    }
}
