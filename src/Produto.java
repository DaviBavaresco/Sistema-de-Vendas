public class Produto {
  private  float preco;
  private String nome;

  public Produto(String nome, float preco){
      this.preco=preco;
      this.nome=nome;
  }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
