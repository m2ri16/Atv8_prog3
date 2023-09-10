public class BancoDeDados {
    private String[] dados; 
    private int tamanho;

    public BancoDeDados(int capacidade) {
        dados = new String[capacidade];
        tamanho = 0;
    }

    public void adicionarRegistro(String registro) {
        if (tamanho < dados.length) {
            dados[tamanho] = registro;
            tamanho++;
            System.out.println("Registro adicionado.");
        } else {
            System.out.println("Banco de dados cheio.");
        }
    }

    public void atualizarRegistro(int indice, String novoValor) {
        if (indice >= 0 && indice < tamanho) {
            dados[indice] = novoValor;
            System.out.println("Registro atualizado.");
        } else {
            System.out.println("ERRO");
        }
    }

    public void excluirRegistro(int indice) {
        if (indice >= 0 && indice < tamanho) {
            for (int i = indice; i < tamanho - 1; i++) {
                dados[i] = dados[i + 1];
            }
            dados[tamanho - 1] = null;
            tamanho--;
            System.out.println("Registro excluído.");
        } else {
            System.out.println("ERRO");
        }
    }

    public String consultarRegistro(int indice) {
        if (indice >= 0 && indice < tamanho) {
            System.out.println("Indíce consultado.");
            return dados[indice];
        } else {
            System.out.println("ERRO");
            return null;
        }
    }
}
