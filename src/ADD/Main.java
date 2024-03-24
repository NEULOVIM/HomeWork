package ADD;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Register registry = new Register();

        SupplyContract supplyContract = new SupplyContract(1, new Date(), "Electronic", 1000);
        registry.saveDocumentMethod(supplyContract);

        EmployeeContract employeeContract = new EmployeeContract(2, new Date(), new Date(), "Dmitriy Kasatkin");
        registry.saveDocumentMethod(employeeContract);

        FinancialInvoice invoice = new FinancialInvoice(3, new Date(), 1500.5, 190899);
        registry.saveDocumentMethod(invoice);

        registry.infoDocumentMethod();
    }
}

