package ADD;

import java.util.Date;

public class FinancialInvoice implements InterfaceDocumentInfoI {

    private int documentNumber; //  - Номер документа
    private Date documentDate;
    private double totalSumOfMath;
    private int codDepartment;

    public FinancialInvoice() {
    }

    public FinancialInvoice(int documentNumber, Date documentDate, double totalSumOfMath, int codDepartment) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.totalSumOfMath = totalSumOfMath;
        this.codDepartment = codDepartment;
    }

    public void info() {
        System.out.println("Financial Invoice:");
        System.out.println("Document Number: " + documentNumber);
        System.out.println("Document Date: " + documentDate);
        System.out.println("Total Sum Math: " + totalSumOfMath);
        System.out.println("Department Code: " + codDepartment);
        System.out.println();
    }
}