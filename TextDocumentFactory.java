// Implementação concreta da fábrica de documentos de Texto
class TextDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
