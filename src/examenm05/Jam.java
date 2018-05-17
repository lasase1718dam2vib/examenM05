/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenm05;

/**
 *
 * @author Admin
 */
public class Jam {

    private String contents;
    private String date;
    private int capacity;
    private static int numTotalJars, noJam = 0;

    Jam(String contents, String date, int size) {
        this.contents = contents;
        this.date = date;
        capacity = size;
        numTotalJars++;
    }

    public boolean empty() {
        return (capacity == 0);
    }

    public void print() {
        System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
        System.out.println("El número total de Jars creats des de l'inici dels temps són: " + Jam.getNumTotalJars());
        System.out.println("El número de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
    }

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

    public static int getNumTotalJars() {
        return numTotalJars;
    }

    public static int getNoJam() {
        return noJam;
    }
}
