package Model;

import javax.swing.JOptionPane;

public class AppCarro {
    public static void main(String[] args) {
        Modificar carro = new Modificar();
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "1) Inserir Carro\n2) Remover Carro\n3) Alterar Carro\n" +
                "4) Consultar Todos\n5) Sair"));

            switch (opcao) {
                case 1:
                    String modelo = (JOptionPane.showInputDialog("Modelo do Carro:"));
                    String marca = JOptionPane.showInputDialog("Marca do Carro:");
                    int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do Carro:"));
                    double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do Carro:"));
                    carro.addCarro(new Carro(modelo,marca,ano,preco));
                    break;
                case 2:
                    int idRemover = Integer.parseInt(JOptionPane.showInputDialog("ID do carro a remover:"));
                    if (carro.removerCarro(idRemover)) {
                        JOptionPane.showMessageDialog(null, "Carro removido!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Carro não encontrado.");
                    }
                    break;
                case 3:
                    int idAlterar = Integer.parseInt(JOptionPane.showInputDialog("ID do Carro a alterar:"));
                    String novoModelo = JOptionPane.showInputDialog("Novo Modelo:");
                    String novaMarca = JOptionPane.showInputDialog("Nova Marca:");
                    int novoAno = Integer.parseInt(JOptionPane.showInputDialog("Novo ano do Carro:"));
                    double novoPreco = Double.parseDouble(JOptionPane.showInputDialog("Novo preço do Carro:"));
                    
                    if (carro.alterarCarro(idAlterar, novoModelo, novaMarca, novoAno, novoPreco)) {
                        JOptionPane.showMessageDialog(null, "Carro alterado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "ID não encontrado.");
                    }
                    break;
                case 4:
                	 carro.listarTodos();
                     break;
                case 5:
                	break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
             
            }
        } while (opcao != 5);
    }
}