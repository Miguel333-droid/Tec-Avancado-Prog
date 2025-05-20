package Model;

import java.util.ArrayList;

public class Deposito {
    private ArrayList<Caixa> caixas;

    public Deposito() {
        caixas = new ArrayList<Caixa>();
    }

    public void adicionarCaixa(Caixa caixa) {
        caixas.add(caixa);
    }

    public boolean removerCaixa(String dono) {
        int pos = buscar(dono);
        if (pos >= 0) {
            caixas.remove(pos);
            return true;
        }
        return false;
    }

    public int buscar(String dono) {
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equalsIgnoreCase(dono)) {
                return i;
            }
        }
        return -1;
    }

    public boolean alterarCaixa(String dono, String novoCorredor, int novaPosicao) {
        int pos = buscar(dono);
        if (pos >= 0) {
            Caixa caixa = caixas.get(pos);
            caixa.setCorredor(novoCorredor);
            caixa.setPosicao(novaPosicao);
            return true;
        }
        return false;
    }

    public Caixa[] listarMaisPesadas(double pesoLimite) {
        ArrayList<Caixa> resultado = new ArrayList<Caixa>();
        for (Caixa caixa : caixas) {
            if (caixa.getPeso() > pesoLimite) {
                resultado.add(caixa);
            }
        }
        return resultado.toArray(new Caixa[0]);
    }

    public void listarTodas() {
        for (Caixa caixa : caixas) {
            System.out.println(caixa);
        }
    }
}
