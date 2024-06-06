package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grafo grafo = new Grafo();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar aresta");
            System.out.println("2. Remover aresta");
            System.out.println("3. Exibir grafo");
            System.out.println("4. Encerrar");

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
                    System.out.println("Encerrando...");
                    grafo.exibirGrafo();
                    if (grafo.contemCiclo()) {
                        System.out.println("O grafo contém um ciclo.");
                    } else {
                        System.out.println("O grafo não contém um ciclo.");
                    }
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }}