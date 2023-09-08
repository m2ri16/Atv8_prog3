public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int anoFabricacao, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int velocidade){
        if(velocidade >= 0){
            this.velocidadeAtual += velocidade;
        } else {
            System.out.println("A velocidade não pode ser negativa.");
        }
    }

    public void desacelerar(int velocidade) {
        if (velocidade >= 0) {
            if (this.velocidadeAtual - velocidade >= 0) {
                this.velocidadeAtual -= velocidade;
            } else {
                this.velocidadeAtual = 0;
            }
        } else {
            System.out.println("A velocidade não pode ser negativa.");
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

}
