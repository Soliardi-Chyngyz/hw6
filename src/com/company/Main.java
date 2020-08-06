package com.company;

public class Main {

    public static void main(String[] args) {
    }
}
class Clients{
    public static void main(String[] args){
        Account <String, Float> account = new Account();
        account.print("Vasa", 8000d);
    }
}

class Account <T extends String, S extends Number> implements Printable {

    private String client;
    private S count;


    public <A> Account(T client, S count) {
        this.client = client.toString();
        this.count = count;
    }

    public Account() {
    }

    @Override
    public void print(Object client, Object count) {
        System.out.println("Клиент: " + client + "\nБаланс: " + count);
    }
}


interface Printable <T, S>{
    void print(T t, S s);

}