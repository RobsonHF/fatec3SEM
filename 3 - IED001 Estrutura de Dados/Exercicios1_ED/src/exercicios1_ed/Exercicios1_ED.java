/*
* Cada exercício está em uma chamada de método.

 */
package exercicios1_ed;

import javax.swing.JOptionPane;

public class Exercicios1_ED {

    public static void main(String[] args) {
        int opc = 0;

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ecolha entre exercícios: 1, 2, 3, 4 ou 5. Ou digite 9 para sair."));
            switch (opc) {
                case 1:
                    Metodos.exercicio1();
                    break;
                case 2:
                    Metodos.exercicio2();
                    break;
                case 3:
                    Metodos.exercicio3();
                    break;
                case 4:
                    Metodos.exercicio4();
                    break;
                case 5:
                    Metodos.exercicio5();
                    break;
                case 9: JOptionPane.showMessageDialog (null, "Saindo do sistema");
                    break;
            }

        }

    }

}
