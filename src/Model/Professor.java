
package Model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
	private List<Projeto> projetos;
	
    public Professor() {
    	projetos = new ArrayList<Projeto>();
    }
    
    public Professor(String nome, String email) {
    	this.setNome(nome);
    	this.setEmail(email);
    }
    
    
    public void addProjeto(Projeto projeto) {
    	projetos.add(projeto);
    }
    
	public List<Projeto> getProjetos() {
		return projetos;
	}
  
   
   
}
