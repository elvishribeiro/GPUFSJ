package Model;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private List<Professor> professores;
    private List<Grupo> grupos;
    private List<Aluno> alunos;
    private List<Projeto> projetos;

    private static BancoDeDados instance = new BancoDeDados();

    private BancoDeDados(){
            projetos = new ArrayList<Projeto>();

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
    
    public void addProjeto (Projeto p) {
        projetos.add(p);
    }
    
    public Aluno buscaAluno(String nome) {
            for (Aluno a: alunos) {
                    if (a.getNome().equals(nome))
                            return a;
            }
            return null;
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
