package Model;

import javax.swing.JOptionPane;

public class AppBloco {
    public static void main(String[] args) {
        BlocodeNotas bloco = new BlocodeNotas();
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "1) Inserir nota\n2) Remover nota\n3) Alterar nota\n4) Listar notas\n5) Sair"));

            switch (opcao) {
                case 1:
                    String nota = JOptionPane.showInputDialog("Digite a nota:");
                    bloco.adicionarNota(nota);
                    break;
                case 2:
                    int indexRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da nota a remover:"));
                    if (bloco.removerNota(indexRemover)) {
                        JOptionPane.showMessageDialog(null, "Nota removida!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Índice inválido.");
                    }
                    break;
                case 3:
                    int indexAlterar = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da nota a alterar:"));
                    String novaNota = JOptionPane.showInputDialog("Nova nota:");
                    if (bloco.alterarNota(indexAlterar, novaNota)) {
                        JOptionPane.showMessageDialog(null, "Nota alterada!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Índice inválido.");
                    }
                    break;
                case 4:
                    bloco.listarNotas();
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

        } while (opcao != 5);
    }
}
