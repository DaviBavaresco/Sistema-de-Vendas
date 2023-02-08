public class main {
    public static void main(String[] args) {
        Produto p1= new Produto("Banana",2);
        Produto p2= new Produto("Maçã",3);
        Pessoa ps1= new Pessoa("Davi","00090909",19,59);
        Venda v1= new Venda(p1,10);
        System.out.println(v1.getTotal());
        v1.getEstado();
        System.out.println(v1.getTotal());
    }
}
