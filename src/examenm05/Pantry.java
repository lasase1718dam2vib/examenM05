/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenm05;

/**
 * Classe Pantry
 *
 * @author Admin
 */
public class Pantry {

    /*Marmelada 1*/
    private Jam jar1;
    /*Marmelada 2*/
    private Jam jar2;
    /*Marmelada 3*/
    private Jam jar3;
    /*Marmelada seleccionada*/
    private Jam selected;
    /**
     * constructor de l'objecte pantry
     * @param jar1 marmelada 1
     * @param jar2 mermalada 2
     * @param jar3 mermalada 3
     */
    Pantry(Jam jar1, Jam jar2, Jam jar3) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        selected = null;
    }

    /**
     * excriu les dades de pantry
     */
    public void print() {
        System.out.print("1: ");
        jar1.print();
        System.out.print("2: ");
        jar2.print();
        System.out.print("3: ");
        jar3.print();
    }

    /**
     * selecciona una marmelada
     * @param jarNumber numero de la mermelada que volem seleccionar
     */
    public void select(int jarNumber) {
        if (jarNumber == 1) {
            selected = jar1;
        } else if (jarNumber == 2) {
            selected = jar2;
        } else {
            selected = jar3;
        }
    }

    /**
     * metode per untar marmelada
     * @param oz quantitat de mermelada que necessitem
     */
    public void spread(int oz) {
        selected.spread(oz);
    }
}
