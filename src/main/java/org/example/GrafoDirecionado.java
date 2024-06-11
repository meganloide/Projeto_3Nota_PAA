package org.example;

public class GrafoDirecionado {
    private boolean[][] matrizAdjacencia;
    private final int numeroDeVertices = 5;

    public GrafoDirecionado() {
        matrizAdjacencia = new boolean[numeroDeVertices][numeroDeVertices];
    }

    public void adicionarAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem >= 0 && verticeOrigem < numeroDeVertices &&
                verticeDestino >= 0 && verticeDestino < numeroDeVertices) {
            matrizAdjacencia[verticeOrigem][verticeDestino] = true;
        } else {
            System.out.println("Vertices inválidos.");
        }
    }

    public void removerAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem >= 0 && verticeOrigem < numeroDeVertices &&
                verticeDestino >= 0 && verticeDestino < numeroDeVertices) {
            matrizAdjacencia[verticeOrigem][verticeDestino] = false;
        } else {
            System.out.println("Vertices inválidos.");
        }
    }

    public void exibirGrafo() {
        System.out.println("Matriz de Adjacência do Grafo Direcionado:");
        char vertice = 'A';
        for (int i = 0; i < numeroDeVertices; i++) {
            System.out.print((char)(vertice + i) + ": ");
            for (int j = 0; j < numeroDeVertices; j++) {
                if (matrizAdjacencia[i][j]) {
                    System.out.print((char)(vertice + j) + " ");
                }
            }
            System.out.println();
        }
    }
}
