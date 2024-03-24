package ADD;

import java.awt.image.ImageConsumer;
import java.util.Date;

public class EmployeeContract implements InterfaceDocumentInfoI {
    private int documentNumber;
    private Date documentDate;
    private Date finishDateContract;
    private String nameEmployee;

    public EmployeeContract() {
    }

    public EmployeeContract(int documentNumber, Date documentDate, Date finishDateContract, String nameEmployee) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.finishDateContract = finishDateContract;
        this.nameEmployee = nameEmployee;
    }


    public void info() {
        System.out.println("Employee Contract:");
        System.out.println("Document Number: " + documentNumber);
        System.out.println("Document Date: " + documentDate);
        System.out.println("Finish Date Contract: " + finishDateContract);
        System.out.println("Name Employee: " + nameEmployee);
        System.out.println();
    }

}
