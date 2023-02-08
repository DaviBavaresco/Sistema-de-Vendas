public class Venda {
    private Produto produto;
    private int quantidade=0;
    private float total=0;
    private int imposto=0;
    private Pessoa pessoa;
    private int local;

    public Venda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;

    }

    public int getEstado() {

        if(pessoa.getDdd()==51){
            return imposto=13;
        } else if (pessoa.getDdd()==11) {
            return imposto=10;
        }
        else
        return imposto=7;
    };
    public float getTotal(){
       float imp= (float) (imposto*0.01);

        float compr= produto.getPreco()*quantidade;
        float jur=(compr*imp);

        return total=compr+jur;
    }


}
