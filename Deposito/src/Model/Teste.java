package Model;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "1) Adicionar caixa\n2) Remover caixa\n3) Procurar caixa\n4) Alterar caixa" +
                "\n5) Listar caixas > 10kg\n6) Sair\n7) Listar todas"));

            switch (opcao) {
                case 1:
                    Caixa nova = new Caixa();
                    nova.setDono(JOptionPane.showInputDialog("Dono da caixa:"));
                    nova.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso da caixa:")));
                    nova.setCorredor(JOptionPane.showInputDialog("Corredor:"));
                    nova.setPosicao(Integer.parseInt(JOptionPane.showInputDialog("Posição:")));
                    deposito.adicionarCaixa(nova);
                    break;
                case 2:
                    String donoRemover = JOptionPane.showInputDialog("Nome do dono:");
                    if (deposito.removerCaixa(donoRemover)) {
                        JOptionPane.showMessageDialog(null, "Removido!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não encontrado.");
                    }
                    break;
                case 3:
                    String donoBuscar = JOptionPane.showInputDialog("Nome do dono:");
                    int pos = deposito.buscar(donoBuscar);
                    if (pos >= 0) {
                        JOptionPane.showMessageDialog(null, "Encontrado na posição " + pos);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não encontrado.");
                    }
                    break;
                case 4:
                    String donoAlt = JOptionPane.showInputDialog("Nome do dono:");
                    String corredor = JOptionPane.showInputDialog("Novo corredor:");
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Nova posição:"));
                    if (deposito.alterarCaixa(donoAlt, corredor, posicao)) {
                        JOptionPane.showMessageDialog(null, "Alterado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não encontrado.");
                    }
                    break;
                case 5:
                    Caixa[] pesadas = deposito.listarMaisPesadas(10.0);
                    for (Caixa caixa : pesadas) {
                        System.out.println(caixa);
                    }
                    break;
                case 6:
                    break;
                case 7:
                    deposito.listarTodas();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

        } while (opcao != 6);
    }
}
