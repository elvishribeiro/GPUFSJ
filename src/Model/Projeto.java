
package Model;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
   
	private String nome;
	private String resumo;
	private String palavraChave;
	private Professor professorResponsavel;
	private List<Professor> colaboradores;
	private List<SubProjeto> subProjetos;
	private ProducaoCientifica prodCientifica;
	private boolean aprovado;
	
	
	public Projeto(){
		colaboradores = new ArrayList<Professor>();
		subProjetos = new ArrayList<SubProjeto>();	
	}
	
	
	
	public void addColaborador(Professor colaborador) {
		colaboradores.add(colaborador);
	}
	
	public String getPalavraChave() {
		return palavraChave;
	}
	
	public String verColaboladores(){
		String retorno = "";
		for (Professor a : colaboradores){
			retorno += a.getNome()+"\n";
		}
		
	   return null; 
	}
	
	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}

	public List<Professor> getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(List<Professor> colaboradores) {
		this.colaboradores = colaboradores;
	}

	public List<SubProjeto> getSubProjetos() {
		return subProjetos;
	}

	public void setSubProjetos(List<SubProjeto> subProjetos) {
		this.subProjetos = subProjetos;
	}

	public ProducaoCientifica getProdCientifica() {
		return prodCientifica;
	}

	public void setProdCientifica(ProducaoCientifica prodCientifica) {
		this.prodCientifica = prodCientifica;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
  
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public Professor getProfessorResponsavel() {
		return professorResponsavel;
	}

	public void setProfessorResponsavel(Professor professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}  
}
