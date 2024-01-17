// Implementação concreta do produto (Documento de Imagem)
class ImageDocument implements Document {
    @Override
    public void create() {
        System.out.println("Criando um documento de imagem");
    }
}