import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Questao[] questoes = new Questao[15];
     questoes[0] = new Questao();
    questoes[0].pergunta = " O que é um Array? ";
        questoes[0].opcaoA = " É uma variável que armazena múltiplos dados de mesmo tipo em um bloco da memória. ";
     questoes[0].opcaoB = " É uma variável que armazena um dado em um bloco da memória. ";
      questoes[0].opcaoC = " É uma variável que armazena múltiplos dados de um mesmo tipo em vários blocos da memória ";
        questoes[0].opcaoD = " É uma variável que não armazena nenhum dado. ";
    questoes[0].opcaoE = " É uma variável que armazena dois dados de mesmo tipo em um espaço da memória. ";
  questoes[0].correta = "A";
      questoes[1] = new Questao();
       questoes[1].pergunta = " O que é um ponteiro? ";
               questoes[1].opcaoA = " Uma variável que armazena múltiplos dados de mesmo tipo em um bloco da memória. ";
        questoes[1].opcaoB = " Uma coleção de variáveis de mesmo tipo. ";
    questoes[1].opcaoC = " Uma variável que contém um endereço de memória. ";
        questoes[1].opcaoD = " Forma primitiva de declaração de variáveis. ";
     questoes[1].opcaoE = " É um array. ";
        questoes[1].correta = "C";

        questoes[2] = new Questao();
     questoes[2].pergunta = " O que pode ser definido como: Comportamentos e ações que os objetos podem ter ? ";
        questoes[2].opcaoA = " Classe ";
    questoes[2].opcaoB = " Atributos ";
       questoes[2].opcaoC = " Operadores lógicos ";
    questoes[2].opcaoD = " Array ";
     questoes[2].opcaoE = " Métodos ";
    questoes[2].correta = "E";
        questoes[3] = new Questao();
       questoes[3].pergunta = " Os objetos são estruturas criadas a partir de que? ";
       questoes[3].opcaoA = " Atributos ";
     questoes[3].opcaoB = " Classes ";
     questoes[3].opcaoC = " Objetos ";
       questoes[3].opcaoD = " Listas ";
       questoes[3].opcaoE = " Métodos ";
       questoes[3].correta = "B";

        questoes[4] = new Questao();
     questoes[4].pergunta = " Na pilha, como funciona os métodos de entrada e saída dos dados? ";
        questoes[4].opcaoA = " O primeiro dado que entra, é o primeiro a sair. ";
    questoes[4].opcaoB = " O último dado que entra é o primeiro a sair. ";
        questoes[4].opcaoC = " Não existe ordem de entrada e saída de dados. ";
      questoes[4].opcaoD = " O segundo dado que entra, é o primeiro a sair. ";
        questoes[4].opcaoE = " Não existe entrada de dados. ";
       questoes[4].correta = "B";

        questoes[5] = new Questao();
      questoes[5].pergunta = " Qual operação é utilizada para mostrar o topo da pilha? ";
        questoes[5].opcaoA = " pop ";
       questoes[5].opcaoB = " push ";
      questoes[5].opcaoC = " enter ";
        questoes[5].opcaoD = " peek ";
       questoes[5].opcaoE = " pek ";
      questoes[5].correta = "D";

      questoes[6] = new Questao();
        questoes[6].pergunta = " Na fila, como funcionam os métodos de saída e de entrada? ";
      questoes[6].opcaoA = " O primeiro que entra é o primeiro que sai. ";
        questoes[6].opcaoB = " O primeiro que entra é o último que sai. ";
      questoes[6].opcaoC = " Não há entrada nem saída de dados. ";
        questoes[6].opcaoD = " O primeiro que entra é o segundo que sai. ";
       questoes[6].opcaoE = " Não há saída de dados. ";
      questoes[6].correta = "A";

      questoes[7] = new Questao();
        questoes[7].pergunta = " Qual a principal diferença entre um Array e um ArrayList? ";
      questoes[7].opcaoA = " ArrayList pode armazenar tipos primitivos diretamente, Array não. ";
        questoes[7].opcaoB = " Array tem tamanho fixo, ArrayList pode crescer dinamicamente. ";
      questoes[7].opcaoC = " Array utiliza mais memória que ArrayList. ";
        questoes[7].opcaoD = " ArrayList não permite acesso por índice, Array sim. ";
      questoes[7].opcaoE = " Array é uma interface, ArrayList é uma classe. ";
        questoes[7].correta = "B";
    questoes[8] = new Questao();
        questoes[8].pergunta = " Ao usar uma fila (queue) em Java, qual método adiciona um elemento no final da fila? ";
      questoes[8].opcaoA = " pop ";
        questoes[8].opcaoB = " enqueue ";
      questoes[8].opcaoC = " add ";
        questoes[8].opcaoD = " insert ";
    questoes[8].opcaoE = " push ";
        questoes[8].correta = "C";
        questoes[9] = new Questao();
    questoes[9].pergunta = " Na estrutura de dados pilha, qual operação insere um elemento no topo da pilha? ";
        questoes[9].opcaoA = " add ";
      questoes[9].opcaoB = " insert ";
        questoes[9].opcaoC = " push ";
    questoes[9].opcaoD = " enqueue ";
        questoes[9].opcaoE = " pop ";
     questoes[9].correta = "C";
        questoes[10] = new Questao();
   questoes[10].pergunta = " Como é chamada a operação para verificar se uma fila está vazia em Java? ";
        questoes[10].opcaoA = " isEmpty ";
    questoes[10].opcaoB = " isFull ";
        questoes[10].opcaoC = " checkEmpty ";
    questoes[10].opcaoD = " empty ";
        questoes[10].opcaoE = " queueStatus ";
    questoes[10].correta = "A";
        questoes[11] = new Questao();
       questoes[11].pergunta = " Em estruturas de dados homogêneas, todos os elementos: ";
      questoes[11].opcaoA = " Podem ser de tipos diferentes desde que em uma mesma variável. ";
       questoes[11].opcaoB = " Devem ser do mesmo tipo de dados. ";
        questoes[11].opcaoC = " Precisam estar ordenados alfabeticamente. ";
     questoes[11].opcaoD = " São armazenados em posições aleatórias. ";
        questoes[11].opcaoE = " São objetos da classe ArrayList. ";
      questoes[11].correta = "D";
    questoes[12] = new Questao();
        questoes[12].pergunta = " O que é uma estrutura de dados heterogênea? ";
        questoes[12].opcaoA = " Estrutura que permite armazenar diferentes tipos de dados. ";
      questoes[12].opcaoB = " Estrutura que permite armazenar vários dados de um mesmo tipo. ";
        questoes[12].opcaoC = " Estrutura em que os elementos são imutáveis. ";
      questoes[12].opcaoD = " Estrutura em que os dados são imutáveis. ";
        questoes[12].opcaoE = " Funciona apenas como pilha. ";
     questoes[12].correta = "A";
      questoes[13] = new Questao();
        questoes[13].pergunta = " Uma matriz em Java é considerada: ";
    questoes[13].opcaoA = " Estrutura de dados heterogênea. ";
        questoes[13].opcaoB = " Estrutura de dados homogênea. ";
       questoes[13].opcaoC = " Apenas uma variável. ";
        questoes[13].opcaoD = " Um método. ";
    questoes[13].opcaoE = " Uma interface. ";
        questoes[13].correta = "B";

    questoes[14] = new Questao();
        questoes[14].pergunta = " Ao criar um array int[] numeros = new int;, quais valores os elementos terão inicialmente? ";
     questoes[14].opcaoA = " nulo ";
        questoes[14].opcaoB = " 0 ";
    questoes[14].opcaoC = " números aleatórios ";
        questoes[14].opcaoD = " -1 ";
    questoes[14].opcaoE = " 2 ";
        questoes[14].correta = "B";
      
        int acertos = 0;
        Scanner scanner = new Scanner(System.in);

       
     for (int i = 0; i < questoes.length; i++) {
        System.out.println("Questão " + (i + 1) + ":");
      questoes[i].escrevaQuestao();
        String respostaUsuario;
        do {
          System.out.print("Digite a resposta (A, B, C, D ou E): ");
             respostaUsuario = scanner.nextLine().trim().toUpperCase();
        if (!respostaUsuario.matches("[ABCDE]")) {
               System.out.println("Entrada inválida! Por favor digite uma das opções A, B, C, D ou E.");
             }
            } while (!respostaUsuario.matches("[ABCDE]"));
            boolean correta = questoes[i].isCorreta(respostaUsuario);
            if (correta) {
                acertos++;
            }            System.out.println();
 }
        
    System.out.println("================================");
     System.out.println("Você acertou " + acertos + " de " + questoes.length + " questões!");
    double porcentagem = ((double) acertos / questoes.length) * 100.0;
    System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);

    scanner.close();
   }
}