package Ex3.Document;

import java.util.Date;

public class EmployeeDocument extends Document{
    Date dateExpires;
    String name;

    public EmployeeDocument(){

    }

    public EmployeeDocument(int number, Date date, Date dateExpires, String name){
        super(number, date);
        this.dateExpires = dateExpires;
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeDocument{" +
                "number=" + number +
                ", date=" + date +
                ", dateExpires=" + dateExpires +
                ", name='" + name + '\'' +
                '}';
    }
}
