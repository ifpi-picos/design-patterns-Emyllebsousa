
// Função cliente que utiliza a fábrica para criar documentos
class Client {
    static void clientCode(DocumentFactory factory) {
        Document document = factory.createDocument();
        document.create();
    }

    // Testando o código
    public static void main(String[] args) {
        // Utilizando a fábrica de documentos de Texto
        DocumentFactory textFactory = new TextDocumentFactory();
        clientCode(textFactory);

        // Utilizando a fábrica de documentos de Imagem
        DocumentFactory imageFactory = new ImageDocumentFactory();
        clientCode(imageFactory);

     
    }
}
