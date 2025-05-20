package Model;

import java.util.ArrayList;

public class BancoDeClientes {
    private ArrayList<Cliente> clientes;

    public BancoDeClientes() {
        clientes = new ArrayList<Cliente>();
    }

    public void inserirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public boolean removerCliente(int id) {
        int pos = buscar(id);
        if (pos >= 0) {
            clientes.remove(pos);
            return true;
        }
        return false;
    }

    public boolean alterarCliente(int id, String novoNome, String novoFone) {
        int pos = buscar(id);
        if (pos >= 0) {
            Cliente c = clientes.get(pos);
            c.setNome(novoNome);
            c.setFone(novoFone);
            return true;
        }
        return false;
    }

    public Cliente consultarCliente(int id) {
        int pos = buscar(id);
        if (pos >= 0) {
            return clientes.get(pos);
        }
        return null;
    }

    public void listarTodos() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    private int buscar(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
