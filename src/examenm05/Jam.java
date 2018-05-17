package examenm05;

/**
 * Classe Jam  que ens permet comprovar si hi ha marmelada 
 * @author Admin
 */
public class Jam {
    /**nom del contingut*/
    private String contents;
    /**data de Jam*/
    private String date;
    /**Capacitat*/
    private int capacity;
    /**numero total de Jars i no Jam*/
    private static int numTotalJars, noJam = 0;
    /**
     * Constructor de la classe Jam
     * @param contents nom del nou element
     * @param date data del nou element
     * @param size mida del nou element
     */
    Jam(String contents, String date, int size) {
        this.contents = contents;
        this.date = date;
        capacity = size;
        numTotalJars++;
    }

    /**
     * Metode que comprova si està buit
     * @return retorna true si esta buit si no false
     */
    public boolean empty() {
        return (capacity == 0);
    }

    /**
     * Escriu les dades de la marmelada
     */
    public void print() {
        System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
        System.out.println("El número total de Jars creats des de l'inici dels temps són: " + Jam.getNumTotalJars());
        System.out.println("El número de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
    }

    /**
     * metode per untar la marmelada, abans de untar comprova que n'hi hagi
     * @param fluidOz mermelada necessària per untar
     */
    public void spread(int fluidOz) {
        if (!empty()) {
            if (fluidOz < capacity) {
                System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
                capacity = capacity - fluidOz;
            } else {
                System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
                capacity = 0;
                noJam++;
            }
        } else {
            System.out.println("No jam in the Jar!");
        }
    }

    /**
     * retorna el total de Jars
     * @return retorna el total de Jars
     */
    public static int getNumTotalJars() {
        return numTotalJars;
    }

    /**
     * Retorna noJam
     * @return el valor de noJam
     */
    public static int getNoJam() {
        return noJam;
    }
}
