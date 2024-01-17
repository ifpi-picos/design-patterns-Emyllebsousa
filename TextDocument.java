// Implementação concreta do produto (Documento de Texto)
class TextDocument implements Document {
    @Override
    public void create() {
        System.out.println("Criando um documento de texto");
    }
}