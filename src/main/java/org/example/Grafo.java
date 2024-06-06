package org.example;

public class Grafo {
    private int[][] matriz;
    private final int numeroDeVertices = 5;

    public Grafo() {
        matriz = new int[numeroDeVertices][numeroDeVertices];
    }

    public void adicionarAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem >= 0 && verticeOrigem < numeroDeVertices &&
                verticeDestino >= 0 && verticeDestino < numeroDeVertices) {
            matriz[verticeOrigem][verticeDestino] = 1;
            matriz[verticeDestino][verticeOrigem] = 1;
        } else {
            System.out.println("inválido");
        }
    }

    public void removerAresta(int verticeOrigem, int verticeDestino) {
        if (verticeOrigem >= 0 && verticeOrigem < numeroDeVertices &&
                verticeDestino >= 0 && verticeDestino < numeroDeVertices) {
            matriz[verticeOrigem][verticeDestino] = 0;
            matriz[verticeDestino][verticeOrigem] = 0;
        } else {
            System.out.println("inválido");
        }
    }

    public void exibirGrafo() {
        System.out.println("Matriz de Adjacência do Grafo:");
        char vertice = 'A';
        System.out.print("  ");
        for (int i = 0; i < numeroDeVertices; i++) {
            System.out.print((char)(vertice + i) + " ");
        }
        System.out.println();
        for (int i = 0; i < numeroDeVertices; i++) {
            System.out.print((char)(vertice + i) + " ");
            for (int j = 0; j < numeroDeVertices; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean dfs(int vertice, boolean[] visitado, int parent) {
        visitado[vertice] = true;
        for (int i = 0; i < numeroDeVertices; i++) {
            if (matriz[vertice][i] == 1) {
                if (!visitado[i]) {
                    if (dfs(i, visitado, vertice)) {
                        return true;
                    }
                } else if (i != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean contemCiclo() {
        boolean[] visitado = new boolean[numeroDeVertices];
        for (int i = 0; i < numeroDeVertices; i++) {
            if (!visitado[i]) {
                if (dfs(i, visitado, -1)) {
                    return true;
                }
            }
        }
        return false;
    }}