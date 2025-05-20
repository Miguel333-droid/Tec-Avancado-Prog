package Model;

import java.util.ArrayList;

public class BlocodeNotas {
    private ArrayList<String> notas;

    public BlocodeNotas() {
        notas = new ArrayList<String>();
    }

    public void adicionarNota(String nota) {
        notas.add(nota);
    }

    public boolean removerNota(int index) {
        if (index >= 0 && index < notas.size()) {
            notas.remove(index);
            return true;
        }
        return false;
    }

    public boolean alterarNota(int index, String novaNota) {
        if (index >= 0 && index < notas.size()) {
            notas.set(index, novaNota);
            return true;
        }
        return false;
    }

    public void listarNotas() {
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("[" + i + "] " + notas.get(i));
        }
    }
}
