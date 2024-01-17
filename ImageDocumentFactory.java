// Implementação concreta da fábrica de documentos de Imagem
class ImageDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new ImageDocument();
    }
}