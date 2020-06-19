package com.company;

public class Credit extends Client {

    public Credit() { }

    public Credit(Client x){
        this.person = x.getPerson();
        this.cardCode = x.cardCode;
        this.PIN = x.PIN;
        this.balance = x.balance;
        this.currency = x.currency;
        this.no = x.no;
        //bank??
    }

    @Override
    public String toString() {
        return "Client number " + no + " {" +
                "lastName = '" + this.getPerson().getLastName() + '\'' +
                ", firstName = '" + this.getPerson().getFirstName() + '\'' +
                ", balance = '" + this.getBalance() + '\'' + // stergere??
                "} (Credit)";
    }

    @Override
    public void withdraw(int x) {
        if (x <= 200)
            this.balance -= x;
        else
            System.out.println("(" + this.name() + ") " + "You are not allowed to withdraw more than 200 in one go.");

        if (this.balance < 0)
            System.out.println("(" + this.name() + ") " + "You have negative balance!." + "(" + this.balance + ")");

    }

}