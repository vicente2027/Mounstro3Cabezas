package com.company;

public class Node {
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    Node next;

    public Node(String nombre,Node next) {
        this.nombre = nombre;
        this.next = next;
    }

    public Node(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;

    }


}
