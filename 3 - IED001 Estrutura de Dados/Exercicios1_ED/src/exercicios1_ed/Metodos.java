package exercicios1_ed;

import javax.swing.JOptionPane;

public class Metodos {

    public static void exercicio1() {
// 1. Carregar um vetor [100] real de valores de saldos. Calcular e exibir:
// Média dos saldos positivos entre 100 à 1000
// Média geral dos saldos
// Soma dos saldos negativos

        double vetor[] = new double[100];
        int opc = 0;
        for (int cto = 0; cto < 100; cto++) {
            vetor[cto] = Math.random() * 1000;
        }
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n 1 para média dos saldos positivos; \n 2 para média geral dos saldos; \n 3 para soma dos saldos negativos; \n 9 para sair do sistema."));
            switch (opc) {
                case 1:
                    double mediapositivo = 0;
                    int contadorpositivo = 0;
                    for (int cto2 = 0; cto2 < 100; cto2++) {
                        if (vetor[cto2] > 100 && vetor[cto2] <= 1000) {
                            mediapositivo = mediapositivo + vetor[cto2];
                            contadorpositivo++;
                        }
                    }
                    mediapositivo = mediapositivo / contadorpositivo;
                    JOptionPane.showMessageDialog(null, "A Média dos saldos positivos entre 100 e 1000 é de: " + mediapositivo);
                    break;
                case 2:
                    double mediageral = 0;
                    for (int cto3 = 0; cto3 < 100; cto3++) {
                        mediageral = mediageral + vetor[cto3];

                    }
                    mediageral = mediageral / 100;
                    JOptionPane.showMessageDialog(null, "A Média geral dos saldos é: " + mediageral);
                    break;
                case 3:
                    double somaNegativos = 0;
                    for (int cto4 = 0; cto4 < 100; cto4++) {
                        if (vetor[cto4] < 0) {
                            somaNegativos = somaNegativos + vetor[cto4];
                        }
                    }
                    JOptionPane.showMessageDialog(null, "A soma nos negativos é: " + somaNegativos);

                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo do exercício 1.");
                    break;
            }
        }
    }

    public static void exercicio2() {
        // 2. Carregar um vetor [5] inteiro. 
        //Enviar cada elemento para uma função e esta irá retornar o seu fatorial 
        //que será armazenado em um outro vetor. 
        //Exibir os dados dos vetores
        int vetor[] = new int[5];
        int vetor2[] = new int[5];
        for (int cto = 0; cto < 5; cto++) {
            vetor[cto] = (int) (Math.random() * 10);
            vetor2[cto] = fatorial(vetor[cto]);

        }

        JOptionPane.showMessageDialog(null, "Os valores do vetor 1 são: " + vetor[0] + " , " + vetor[1] + " , " + vetor[2] + " , " + vetor[3] + " , " + vetor[4]);
        JOptionPane.showMessageDialog(null, "Os valores do vetor 2 (fatoriais) são: " + vetor2[0] + " , " + vetor2[1] + " , " + vetor2[2] + " , " + vetor2[3] + " , " + vetor2[4]);

    }

    public static int fatorial(int a) {
        int f = a;

        for (int cto = 2; cto < a; cto++) {
            f = f * cto;
        }
        return f;
    }

    public static void exercicio3() {
        //3. Carregar um vetor [100] inteiros positivos ou negativos. 
        //Classificar este vetor em ordem crescente e 
        //apresentar os valores.
        int vetor[] = new int[100];
        int aux;
        String ordenado = "";
        for (int cto = 0; cto < 100; cto++) {
            vetor[cto] = (int) (Math.random() * 100);

        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (vetor[j] > vetor[i]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }

        }
        for (int cto = 0; cto < 100; cto++) {
            ordenado = ordenado + vetor[cto] + ", ";
        }
        JOptionPane.showMessageDialog(null, "O vetor ordenado é: " + ordenado);
    }

    public static void exercicio4() {
        // 4. Carregar uma matriz [4 x 4 inteiro]. Apresentar:
//Soma dos valores no intervalo de 1 a 100
//Quantidade de números impares entre 30 a 50
//Quantidade de números divisíveis por 8
//Quantidade de números ímpares divisíveis por 3
//Fatorial do maior número informado na matriz
        int matriz[][] = new int[4][4];
        int vetor[] = new int[16];
        int somaValores1a100 = 0;
        int qntImpares30a50 = 0;
        int qntDivisiveis8 = 0;
        int qntImparesDivisiveis3 = 0;
        int fatorialMaior = 0;
        int cto = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 1000);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > 1 && matriz[i][j] <= 100);
                somaValores1a100 += matriz[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 2 != 0 && matriz[i][j] > 30 && matriz[i][j] < 50) {
                    qntImpares30a50++;
                }

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 8 == 0) {
                    qntDivisiveis8++;
                }

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 2 != 0 && matriz[i][j] % 3 == 0) {
                    qntImparesDivisiveis3++;
                }

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                vetor[cto] = matriz[i][j];
            }
        }
        fatorialMaior = vetor[0];
        for (int i = 1; i < 16; i++) {
            if (vetor[i] > vetor[i - 1]) {
                fatorialMaior = fatorial(vetor[i]);
            }
        }

        JOptionPane.showMessageDialog(null, "Soma dos valores no intervalo 1 a 100 = " + somaValores1a100 + ". \n Quantidade de números impares entre 30 a 50 = " + qntImpares30a50 + ". \n Quantidade de números divisíveis por 8 = " + qntDivisiveis8 + ". \n Quantidade de números ímpares divisíveis por 3 = " + qntImparesDivisiveis3 + ". \n Fatorial do maior número informado na matriz = " + fatorialMaior + ".");
    }

    public static void exercicio5() {
        // 5. Criar e carregar  uma matriz [4 x 4] inteiro, onde os valores da 
        //diagonal principal serão carregados pela aplicação conforme o gráfico 
        //e os demais dados serão digitados pelo usuário
        int matriz[][] = new int[4][4];
        int cto = 1;
        int i;
        int j;
        String texto = "";

        
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (i == j && i!=0 && j!=0) {
                    cto = cto * 3;
                    matriz[i][j] = cto;

                }
                else{
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Coloque um número inteiro: "));
                }

            }
        }
        matriz[0][0] = 1;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                texto += "[" + matriz[i][j] + "] ";
                if (j == 3) {
                    texto += "\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, texto);

    }
}
