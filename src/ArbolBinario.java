/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class ArbolBinario {
    Nodo raiz;

    public void insertar(int dato) {
        raiz = insertarRec(raiz, dato);
    }

    private Nodo insertarRec(Nodo raiz, int dato) {
        if (raiz == null) {
            raiz = new Nodo(dato);
            return raiz;
        }

        if (dato < raiz.dato)
            raiz.izquierdo = insertarRec(raiz.izquierdo, dato);
        else
            raiz.derecho = insertarRec(raiz.derecho, dato);

        return raiz;
    }
    
    public void inorden(Nodo nodo, StringBuilder resultado) {
        if (nodo != null) {
            inorden(nodo.izquierdo, resultado);
            resultado.append(nodo.dato).append(" ");
            inorden(nodo.derecho, resultado);
        }
    }

    public void preorden(Nodo nodo, StringBuilder resultado) {
        if (nodo != null) {
            resultado.append(nodo.dato).append(" ");
            preorden(nodo.izquierdo, resultado);
            preorden(nodo.derecho, resultado);
        }
    }

    public void postorden(Nodo nodo, StringBuilder resultado) {
        if (nodo != null) {
            postorden(nodo.izquierdo, resultado);
            postorden(nodo.derecho, resultado);
            resultado.append(nodo.dato).append(" ");
        }
    }

}