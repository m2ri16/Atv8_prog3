public class CarrinhoDeCompras {
    private int itens;

    public CarrinhoDeCompras(int itens) {
         itens = 0;
    }

    public void adicionarItem() {
        itens++;
        System.out.println("Item adicionado ao carrinho.");
    }

    public void removerItem() {
        if (itens > 0) {
            itens--;
            System.out.println("Item removido .");
        } else {
            System.out.println("O carrinho está vazio.");
        }
    }

    public int listarItens() {
        return itens;
    }    
}
