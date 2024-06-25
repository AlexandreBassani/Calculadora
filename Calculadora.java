public class Calculadora {
    public static void main(String[] args) {
        // Média de duas notas decimais
        double nota1 = 8.5;
        double nota2 = 7.3;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média das notas: " + media);

        // Casting de double para int
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble;
        System.out.println("Valor inteiro após casting: " + valorInt);

        // Concatenação de char e String
        char letra = 'A';
        String palavra = "lexandre";
        String mensagem = letra + palavra;
        System.out.println("Mensagem concatenada: " + mensagem);

        // Cálculo do valor total do produto
        double precoProduto = 19.99;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor total: " + valorTotal);

        // Conversão de dólares para reais
        double valorEmDolares = 50.0;
        double taxaConversao = 4.94;
        double valorEmReais = valorEmDolares * taxaConversao;
        System.out.printf("Valor em reais: %.2f%n", valorEmReais);

        // Cálculo do preço com desconto
        double precoOriginal = 100.0;
        double percentualDesconto = 10.0;
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.printf("Preço com desconto: %.2f%n", precoComDesconto);
    }
}

