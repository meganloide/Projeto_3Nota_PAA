package org.example;

import java.util.LinkedList;
import java.util.List;

public class GrafoDirecionado {
    private List<Integer>[] listaAdjacencia;
    private final int numeroDeVertices = 5;

    public GrafoDirecionado() {
        listaAdjacencia = new LinkedList[numeroDeVertices];
        for (int i = 0; i < numeroDeVertices; i++) {
            listaAdjacencia[i] = new LinkedList<>();
        }
    }

    public void adicionarAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem >= 0 && verticeOrigem < numeroDeVertices &&
                verticeDestino >= 0 && verticeDestino < numeroDeVertices) {
            listaAdjacencia[verticeOrigem].add(verticeDestino);
        } else {
            System.out.println("Vertices inválidos.");
        }
    }

    public void removerAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem >= 0 && verticeOrigem < numeroDeVertices &&
                verticeDestino >= 0 && verticeDestino < numeroDeVertices) {
            listaAdjacencia[verticeOrigem].remove((Integer) verticeDestino);
        } else {
            System.out.println("Vertices inválidos.");
        }
    }

    public void exibirGrafo() {
        System.out.println("Listas de Adjacência do Grafo Direcionado:");
        char vertice = 'A';
        for (int i = 0; i < numeroDeVertices; i++) {
            System.out.print((char)(vertice + i) + ": ");
            for (Integer adj : listaAdjacencia[i]) {
                System.out.print((char)(vertice + adj) + " ");
            }
            System.out.println();
        }
    }
}

