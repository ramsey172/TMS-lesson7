package Ex3.Document;

import java.util.Date;

public class FinanceDocument extends Document{
    double monthSum;
    int departmentCode;

    public FinanceDocument(){

    }

    public FinanceDocument(int number, Date date, double monthSum, int departmentCode){
        super(number, date);
        this.monthSum = monthSum;
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "FinanceDocument{" +
                "number=" + number +
                ", date=" + date +
                ", monthSum=" + monthSum +
                ", departmentCode=" + departmentCode +
                '}';
    }
}
