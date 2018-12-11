package Model;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
	private List<Professor> professores;
	private List<Grupo> grupos;
	private List<Aluno> alunos;
	
	private static BancoDeDados instance = new BancoDeDados();
	
	private BancoDeDados(){
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
	
	public Professor buscaProfessor(String nome) {
		for (Professor p: professores) {
			if (p.getNome().equals(nome))
				return p;
		}
		return null;
	}
	
	public Aluno buscaAluno(String nome) {
		for (Aluno a: alunos) {
			if (a.getNome().equals(nome))
				return a;
		}
		return null;
	}
	
	
	
	
}
