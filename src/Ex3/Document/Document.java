package Ex3.Document;

import Ex3.Contract.Contract;

import java.util.Date;

public class Document implements Contract {

    protected int number;
    protected Date date;

    Document() {

    }

    Document(int number, Date date) {
        this.number = number;
        this.date = date;
    }

    @Override
    public void printDocumentInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Document{" +
                "number=" + number +
                ", date=" + date +
                '}';
    }
}
