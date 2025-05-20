package Model;

import javax.swing.JOptionPane;

public class CadastroApp {
    public static void main(String[] args) {
        BancoDeClientes banco = new BancoDeClientes();
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "1) Inserir cliente\n2) Remover cliente\n3) Alterar cliente\n" +
                "4) Consultar cliente\n5) Listar todos\n6) Sair"));

            switch (opcao) {
                case 1:
                    int id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
                    String nome = JOptionPane.showInputDialog("Nome:");
                    String fone = JOptionPane.showInputDialog("Telefone:");
                    banco.inserirCliente(new Cliente(id, nome, fone));
                    break;
                case 2:
                    int idRemover = Integer.parseInt(JOptionPane.showInputDialog("ID do cliente a remover:"));
                    if (banco.removerCliente(idRemover)) {
                        JOptionPane.showMessageDialog(null, "Cliente removido!");
                    } else {
                        JOptionPane.showMessageDialog(null, "ID não encontrado.");
                    }
                    break;
                case 3:
                    int idAlterar = Integer.parseInt(JOptionPane.showInputDialog("ID do cliente a alterar:"));
                    String novoNome = JOptionPane.showInputDialog("Novo nome:");
                    String novoFone = JOptionPane.showInputDialog("Novo telefone:");
                    if (banco.alterarCliente(idAlterar, novoNome, novoFone)) {
                        JOptionPane.showMessageDialog(null, "Cliente alterado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "ID não encontrado.");
                    }
                    break;
                case 4:
                    int idConsultar = Integer.parseInt(JOptionPane.showInputDialog("ID do cliente:"));
                    Cliente c = banco.consultarCliente(idConsultar);
                    if (c != null) {
                        JOptionPane.showMessageDialog(null, c.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                    }
                    break;
                case 5:
                    banco.listarTodos();
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 6);
    }
}
