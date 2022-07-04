
package abb;

public class Nodo {
    private Nodo izquierdo;
    private int dato;
    private Nodo derecho;

    public Nodo(abb.Nodo izquierdo, int dato, abb.Nodo derecho) {
        this.setIzquierdo(izquierdo);
        this.setDato(dato);
        this.setDerecho(derecho);
    }

    public abb.Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(abb.Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public abb.Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(abb.Nodo derecho) {
        this.derecho = derecho;
    }
}
