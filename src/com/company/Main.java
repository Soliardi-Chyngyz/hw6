package com.company;

public class Main {

    public static void main(String[] args) {
        Clients person = new Clients();
        person.startMyClass();
    }
}
class Clients{
    void startMyClass(){
        Account <String, Float> account = new Account("Vasa", 3000d);
        account.print();
    }
}

class Account <T extends Object, S extends Number> implements Printable {

    private String client;
    private S count;

    public <A>Account(T client, S count) {
        this.client = client.toString();
        this.count = count;
    }

    @Override
    public void print() {
        System.out.println("Имя клиента " + client + "\nБаланс " + count);
    }
}

interface Printable <T>{
    void print();
}