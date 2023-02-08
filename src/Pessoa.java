public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private int ddd;
    private Venda venda;

    public Pessoa(String nome,String cpf, int idade,int ddd){
        this.nome=nome;
        this.cpf=cpf;
        this.idade=idade;
        this.ddd=ddd;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int Compra()
    {int x=10;
        return  x ;
    }
}
