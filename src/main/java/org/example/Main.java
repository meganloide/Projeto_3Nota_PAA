package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grafo grafo = new Grafo();
        GrafoDirecionado grafoDirecionado = new GrafoDirecionado();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar aresta em Grafo Não Direcionado");
            System.out.println("2. Remover aresta em Grafo Não Direcionado");
            System.out.println("3. Exibir Grafo Não Direcionado");
            System.out.println("4. Verificar Ciclo em Grafo Não Direcionado");
            System.out.println("5. Adicionar aresta em Grafo Direcionado");
            System.out.println("6. Remover aresta em Grafo Direcionado");
            System.out.println("7. Exibir Grafo Direcionado");
            System.out.println("8. Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o vértice de origem (A=0, B=1, C=2, D=3, E=4):");
                    int verticeOrigem = scanner.nextInt();
                    System.out.println("Digite o vértice de destino (A=0, B=1, C=2, D=3, E=4):");
                    int verticeDestino = scanner.nextInt();
                    grafo.adicionarAresta(verticeOrigem, verticeDestino);
                    break;
                case 2:
                    System.out.println("Digite o vértice de origem (A=0, B=1, C=2, D=3, E=4):");
                    verticeOrigem = scanner.nextInt();
                    System.out.println("Digite o vértice de destino (A=0, B=1, C=2, D=3, E=4):");
                    verticeDestino = scanner.nextInt();
                    grafo.removerAresta(verticeOrigem, verticeDestino);
                    break;
                case 3:
                    grafo.exibirGrafo();
                    break;
                case 4:
                    if (grafo.contemCiclo()) {
                        System.out.println("O grafo não direcionado contém um ciclo.");
                    } else {
                        System.out.println("O grafo não direcionado não contém um ciclo.");
                    }
                    break;
                case 5:
                    System.out.println("Digite o vértice de origem (A=0, B=1, C=2, D=3, E=4):");
                    verticeOrigem = scanner.nextInt();
                    System.out.println("Digite o vértice de destino (A=0, B=1, C=2, D=3, E=4):");
                    verticeDestino = scanner.nextInt();
                    grafoDirecionado.adicionarAresta(verticeOrigem, verticeDestino);
                    break;
                case 6:
                    System.out.println("Digite o vértice de origem (A=0, B=1, C=2, D=3, E=4):");
                    verticeOrigem = scanner.nextInt();
                    System.out.println("Digite o vértice de destino (A=0, B=1, C=2, D=3, E=4):");
                    verticeDestino = scanner.nextInt();
                    grafoDirecionado.removerAresta(verticeOrigem, verticeDestino);
                    break;
                case 7:
                    grafoDirecionado.exibirGrafo();
                    break;
                case 8:
                    System.out.println("Encerrando...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
