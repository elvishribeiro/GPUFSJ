
package Model;

import java.util.ArrayList;
import java.util.List;

public class Grupo{

	private String Nome;
	private String palavrasChave;
	private List<Projeto> projetos;
	private List<Professor> professores;
	
	
	public Grupo(){
		projetos = new ArrayList<Projeto>();
		professores = new ArrayList<Professor>();
	}
	
	public void addProjeto(Projeto projeto) {
		projetos.add(projeto);
	}
	
	public void addProfessor(Professor professor) {
		professores.add(professor);
	}
	
	public void addProfessores(List<Professor> professores) {
		this.professores.addAll(professores);
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getPalavrasChave() {
		return palavrasChave;
	}
	public void setPalavrasChave(String palavrasChave) {
		this.palavrasChave = palavrasChave;
	}
	
	public List<Projeto> getProjetos() {
		return projetos;
	}
	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}
	
	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	

}
