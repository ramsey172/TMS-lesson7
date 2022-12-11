package Ex3.Register;

import Ex3.Document.Document;

public class Register {
    private final int DOCUMENT_COUNT = 10;
    private int pointer = 0;
    private Document[] documents = new Document[DOCUMENT_COUNT];


    public boolean addDocument(Document document) {
        if (pointer < DOCUMENT_COUNT) {
            documents[pointer] = document;
            pointer++;
            return true;
        }
        return false;
    }

    public void getLastDocumentInfo(){
        documents[pointer-1].printDocumentInfo();
    }
}
