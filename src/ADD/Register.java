package ADD;

class Register {
    private final InterfaceDocumentInfoI[] documents;
    private int index;

    public Register() {
        documents = new InterfaceDocumentInfoI[10];
        index = 0;
    }

    //    - сохранения документа в регистре
    public void saveDocumentMethod(InterfaceDocumentInfoI document) {
        if (index < documents.length) {
            documents[index++] = document;
            System.out.println("Document saved!");
        } else {
            System.out.println("Document not saved!");
        }
        System.out.println();
    }

    //- предоставление информации о документе
    public void infoDocumentMethod() {
        System.out.println("Information about documents:" + "\n");
        for (InterfaceDocumentInfoI document : documents) {
            if (document != null) {
                document.info();
                System.out.println();
                //В методе предоставления информации о документе следует выводить на экран информацию о параметрах документа;
            }
        }

    }
}