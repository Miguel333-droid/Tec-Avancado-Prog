package Model;
import java.util.ArrayList;

public class Modificar {
	private ArrayList<Carro> carros;
	
	
	public Modificar() {
        carros = new ArrayList<Carro>();
    }
	
	public void addCarro(Carro carro) {
		carros.add(carro);
	}
	
	private int buscar(int id) {
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
	
	   public boolean removerCarro(int id) {
	        int pos = buscar(id);
	        if (pos >= 0) {
	            carros.remove(pos);
	            return true;
	        }
	        return false;
	    }
	   
	    public boolean alterarCarro(int id, String novoModelo, String novaMarca, int novoAno, double novoPreco) {
	        int pos = buscar(id);
	        if (pos >= 0) {
	            Carro c = carros.get(pos);
	            c.setModelo(novoModelo);
	            c.setMarca(novaMarca);
	            c.setAno(novoAno);
	            c.setPreco(novoPreco);
	            return true;
	        }
	        return false;
	    }
	    
	    public void listarTodos() {
	        for (Carro c : carros) {
	            System.out.println("Modelo do Carro: " + c.getModelo());
	            System.out.println("Marca do Carro: " + c.getMarca());
	            System.out.println("Ano do Carro: " + c.getAno());
	            System.out.println("Preço do Carro: " + c.getPreco());
	        }
	    }

	
	
	

}
