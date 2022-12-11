package Ex3;

import Ex3.Document.Document;
import Ex3.Document.EmployeeDocument;
import Ex3.Document.FinanceDocument;
import Ex3.Document.ProductDocument;
import Ex3.Register.Register;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        long timestamp = System.currentTimeMillis();
        Date date = new Date(timestamp);
        Date dateExpired = new Date(timestamp + 1000*60*60*24*30);

        Document employeeDocument = new EmployeeDocument(1, date, dateExpired, "Виктор");
        Document financeDocument = new FinanceDocument(2, date, 12, 17);
        Document productDocument = new ProductDocument(3, date, "Видеотехника", 14);

        Register register = new Register();
        if(register.addDocument(employeeDocument)){
            register.getLastDocumentInfo();
        }
        if(register.addDocument(financeDocument)){
            register.getLastDocumentInfo();
        }
        if(register.addDocument(productDocument)){
            register.getLastDocumentInfo();
        }

    }
}
