package Model;
import java.util.ArrayList;
import java.util.List;

import Exceptions.FooException;

public class BancoDeDados {
	private List<Professor> professores;
	private List<Grupo> grupos;
	private List<Aluno> alunos;
	private List<Projeto> projetos;

	private static BancoDeDados instance = new BancoDeDados();
	private BancoDeDados(){
		projetos = new ArrayList<Projeto>();
		grupos = new ArrayList<Grupo>();

		professores = new ArrayList<Professor>();
		professores.add(new Professor("Menino Leite", "meninoleite@ufsj.edu.br"));
		professores.add(new Professor("Menino Jan", "meninojan@ufsj.edu.br"));
		professores.add(new Professor("Menino Elvis", "meninoelvis@ufsj.edu.br"));

		alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("Sofia", "sofia@gmail.com"));
		alunos.add(new Aluno("Sachetto", "sachetto@yahoo.com"));
		alunos.add(new Aluno("Xandao", "xandao@bol.com.br"));
	}

	public static BancoDeDados getInstance() {
		return instance;
	}
	
	public Professor buscaProfessor(String nome) throws Exception{
		for (Professor p: professores) {
			if (p.getNome().equals(nome))
				return p;
		}
		throw new FooException("Professor " + nome + " Inexistente!");
	}
	
	public Aluno buscaAluno(String nome) {
		for (Aluno a: alunos) {
			if (a.getNome().equals(nome))
				return a;
		}
		return null;
	}
	
	public Grupo buscaGrupo(String nome) throws FooException {
		for (Grupo g: grupos) {
			if (g.getNome().equals(nome))
				return g;
		}
		throw new FooException("Grupo "+nome+" Inexistente!");
	}
	
	public boolean existeGrupo(String nome) {
		for (Grupo g: grupos) {
			if (g.getNome().equals(nome))
				return true;
		}
		return false;
	}
	
	public void aprovaProjeto(String nome) {
		for (Projeto p: projetos) {
			if (p.getNome().equals(nome)){
				p.setAprovado(true);
			}							
		}			
	}
	public void recusaProjeto(String nome) {
		Projeto aux = null;
		for (Projeto p: projetos) {
			if (p.getNome().equals(nome)){
				aux = p;
				break;
			}							
		}
		projetos.remove(aux);
	}
	
	
	public void addProjeto (Projeto projeto, String grupoNome) throws Exception{
		projetos.add(projeto);
		Grupo g = buscaGrupo(grupoNome);
		if (g != null) {
			g.addProjeto(projeto);
		}
	}
	
	public void addGrupo (Grupo grupo) throws Exception{
		grupo.setPalavrasChave(grupo.getPalavrasChave().trim());
		String []palavras = grupo.getPalavrasChave().split(",");
		
		//Fluxo alternativo 2a
		if(existeGrupo(grupo.getNome()))				
			throw new FooException("Grupo Existente!");
		
		//Fluxo alternativo 2b
		else if(palavras.length < 3)
			throw new FooException("Insira mais de 3 palavras-chave!");
		
		//Fluxo alternativo 2b
		else if (palavras.length > 5)
			throw new FooException("Insira menos de 5 palavras-chave!");
		
		grupos.add(grupo);
		
	}
	
	public void listaGrupos() {
		for (Grupo g: grupos)
			System.out.println(g.getNome());
	}


	public List<Professor> getProfessores() {
		return professores;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}		

	public List<Projeto> getProjetos() {
		return projetos;
	}
	
}
