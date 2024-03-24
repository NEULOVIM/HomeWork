package ADD;

import java.util.Date;

public class SupplyContract implements InterfaceDocumentInfoI {
    private int documentNumber; //  - Номер документа
    private Date documentDate;
    private String goodsType;
    private int goodsAmount;

    public SupplyContract() {
    }

    public SupplyContract(int documentNumber, Date documentDate, String goodsType, int goodsAmount) {
        this.documentDate = documentDate;
        this.documentNumber = documentNumber;
        this.goodsAmount = goodsAmount;
        this.goodsType = goodsType;
    }

    public void info() {
        System.out.println("Supply Contract:");
        System.out.println("Document Number: " + documentNumber);
        System.out.println("Document Date: " + documentDate);
        System.out.println("Goods Type: " + goodsType);
        System.out.println("Goods Amount: " + goodsAmount);
        System.out.println();
    }

}

