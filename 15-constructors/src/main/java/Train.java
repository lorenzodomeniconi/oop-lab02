package oop.lab02.constructors;

class Train {

    static final int DEFAULT_N_FC_SEATS = 50;
    static final int DEFAULT_N_SC_SEATS = 100;
    static final int DEFAULT_TOT_SEATS = 150;
    Train(){
        this(DEFAULT_N_FC_SEATS, DEFAULT_N_SC_SEATS, 0, 0);
    }
    Train(int first, int second){
        seats=first + second;
        firstClassSeats=first;
        secondClassSeats=second;
        firstClassReserved=0;
        secondClassReserved=0;
    }
    Train(int pFirst, int pSecond, int rFirst, int rSecond){
        firstClassReserved=rFirst;
        secondClassReserved=rSecond;
        firstClassSeats=pFirst;
        secondClassSeats = pSecond;
        seats= pFirst+pSecond;
    }
    int seats;
    int firstClassSeats;
    int secondClassSeats;
    int firstClassReserved;
    int secondClassReserved;

    void deleteAllReservations() {
        this.firstClassReserved = 0;
        this.secondClassReserved = 0;
    }

    double getFirstClassOccupancyRatio() {
        return this.firstClassReserved * 100d / this.firstClassSeats;
    }

    int getFirstClassSeats() {
        return this.firstClassSeats;
    }

    int getSecondClassSeats() {
        return this.secondClassSeats;
    }

    double getOccupancyRatio() {
        return (this.firstClassReserved + this.secondClassReserved) * 100d / this.seats;
    }

    double getSecondClassOccupancyRatio() {
        return this.secondClassReserved * 100 / this.secondClassSeats;
    }

    int getTotalSeats() {
        return this.seats;
    }

    void printTrainInfo() {
        System.out.println("Train info:");
        System.out.println("-nTotSeats: " + this.seats);
        System.out.println("-nFCSeats: " + this.firstClassSeats);
        System.out.println("-nSCSeats: " + this.secondClassSeats);
        System.out.println("-nFCReservedSeats: " + this.firstClassReserved);
        System.out.println("-nSCReservedSeats: " + this.secondClassReserved + "\n");
    }

    void reserveFirstClassSeats(final int nSeats) {
        this.firstClassReserved += nSeats;
    }

    void reserveSecondClassSeats(final int nSeats) {
        this.secondClassReserved += nSeats;
    }
}
