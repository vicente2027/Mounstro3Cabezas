package com.company;
import com.company.Node;
public class List {

    private Node inicio, next; // Nodos locales para referenciar el inicio y el siguiente nodo
    int contador = 0; // Contador

    //Metodo para insertar al final
    public void append (String nombre, String apellidoPaterno, String apellidoMaterno){
        contador++;

        if (!isEmpty()){ // Si la lista NO esta vacia, genera el nuevo nodo con apuntador al siguiente
            next.next = new Node(nombre,apellidoPaterno,apellidoMaterno);
            next = next.next;
        }
        else { // SI la lista esta vacia, genera el nodo en la primera posicion
            inicio = next = new Node(nombre, apellidoPaterno, apellidoMaterno);
        }
    }

    public void display(){ // Metodo para desplegar todos los nodode la lista
        Node recorrer = inicio;

        while (recorrer != null){
            System.out.print("[" + recorrer.nombre + "]--->");
            recorrer = recorrer.next;
        }

    }

    public boolean isEmpty(){ // Metodo para evaluar si la lista esta vacia

        if (inicio == null){
            return true;

        }else {
            return false;
        }
    }



}
