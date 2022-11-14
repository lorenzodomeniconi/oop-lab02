package oop.lab02.constructors;

class UseConstructors {

    public static void main(final String[] args) {
        // NB: Per verificare la correttezza dei costruttori implementati
        // stampare a video le informazioni relative agli studenti (metodo
        // printStudentInfo) e ai treni (a tal fine implementare un metodo
        // printTrainInfo nella classe Train).
        Student s1 = new Student(1014, "Mario", "Rossi", 2013);
        Student s2 = new Student(1018, "Luca", "Bianchi", 2010);
        Student s3 = new Student(1019, "Peppino", "Vitiello", 2012);
        Student s4 = new Student(1020, "Luca", "Verdi", 2013);
        Train t1 = new Train(100, 200);
        Train t2 = new Train(50, 1050);
        Train t3 = new Train(0, 500);
        Train t4 = new Train();
    }
}
