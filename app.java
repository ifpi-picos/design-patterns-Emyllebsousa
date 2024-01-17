// Interface para o produto (Documento)
interface Document {
    void create();
}

// Implementação concreta do produto (Documento de Texto)
class TextDocument implements Document {
    @Override
    public void create() {
        System.out.println("Criando um documento de texto");
    }
}

// Implementação concreta do produto (Documento de Imagem)
class ImageDocument implements Document {
    @Override
    public void create() {
        System.out.println("Criando um documento de imagem");
    }
}

// Implementação concreta do produto (Documento de Áudio)
class AudioDocument implements Document {
    @Override
    public void create() {
        System.out.println("Criando um documento de áudio");
    }
}

// Interface para a fábrica de documentos
interface DocumentFactory {
    Document createDocument();
}

// Implementação concreta da fábrica de documentos de Texto
class TextDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}

// Implementação concreta da fábrica de documentos de Imagem
class ImageDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new ImageDocument();
    }
}

// Implementação concreta da fábrica de documentos de Áudio
class AudioDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new AudioDocument();
    }
}

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

        // Utilizando a fábrica de documentos de Áudio
        DocumentFactory audioFactory = new AudioDocumentFactory();
        clientCode(audioFactory);
    }
}
