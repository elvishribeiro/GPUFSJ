
package Controler;

import Model.BancoDeDados;
import Model.Grupo;
import Model.Professor;
import Model.Projeto;

public class CriaAsCoisas {
    
    public CriaAsCoisas(){
    
    }
    
    public void criaProjeto(){
    	
    }
    
    public void criaGrupo(){
    	BancoDeDados bd = BancoDeDados.getInstance();
    	
    	Grupo grupo = new Grupo();
    	grupo.setNome("Grupo de pesquisa em batatas");
    	grupo.setPalavrasChave("grupo, naosei, outrapalavra");
    	grupo.addProfessor(bd.buscaProfessor("Menino Leite"));
    	grupo.addProfessor(bd.buscaProfessor("Menino Jan"));
    	grupo.addProfessor(bd.buscaProfessor("Menino Elvis"));
    	
    	Projeto projeto = new Projeto();
    	projeto.setAprovado(false);
    	projeto.setNome("Estratégias ótimas para uma abordagem no problema de geração de batatas");
    	projeto.setProfessorResponsavel(bd.buscaProfessor("Menino Jan"));
    	projeto.addColaborador(bd.buscaProfessor("Menino Leite"));
    	projeto.addColaborador(bd.buscaProfessor("Menino Elvis"));
    	projeto.setPalavraChave("batata, problema");
    	projeto.setResumo(" O empenho em analisar o desafiador cenário globalizado "
    			+ "auxilia a preparação e a composição da gestão inovadora da qual "
    			+ "fazemos parte. Podemos já vislumbrar o modo pelo qual a estrutura "
    			+ "atual da organização não pode mais se dissociar do orçamento setorial. "
    			+ "O incentivo ao avanço tecnológico, assim como a contínua expansão "
    			+ "de nossa atividade afeta positivamente a correta previsão de "
    			+ "alternativas às soluções ortodoxas. Evidentemente, o surgimento "
    			+ "do comércio virtual promove a alavancagem dos procedimentos "
    			+ "normalmente adotados. \r\n");
    	grupo.addProjeto(projeto);
    	bd.buscaProfessor("Menino Jan").addProjeto(projeto);
    	
    	
    	projeto = new Projeto();
    	projeto.setAprovado(false);
    	projeto.setNome("Estratégias ótimas para uma abordagem no experimento de mutação de batatas");
    	projeto.setProfessorResponsavel(bd.buscaProfessor("Menino Leite"));
    	projeto.addColaborador(bd.buscaProfessor("Menino Jan"));
    	projeto.addColaborador(bd.buscaProfessor("Menino Elvis"));
    	projeto.setPalavraChave("batata, mutacao");
    	projeto.setResumo(" Não podemos esquecer que o consenso sobre "
    			+ "a necessidade de qualificação deve passar por modificações "
    			+ "independentemente das diversas correntes de pensamento. A "
    			+ "certificação de metodologias que nos auxiliam a lidar com "
    			+ "o julgamento imparcial das eventualidades maximiza as possibilidades "
    			+ "por conta dos modos de operação convencionais. Caros amigos, "
    			+ "a execução dos pontos do programa cumpre um papel essencial na "
    			+ "formulação das novas proposições");
    	grupo.addProjeto(projeto);
    	bd.buscaProfessor("Menino Leite").addProjeto(projeto);
    	
    	projeto = new Projeto();
    	projeto.setAprovado(false);
    	projeto.setNome("Estratégias ótimas para uma abordagem no problema de geração de batatas");
    	projeto.setProfessorResponsavel(bd.buscaProfessor("Menino Elvis"));
    	projeto.addColaborador(bd.buscaProfessor("Menino Leite"));
    	projeto.addColaborador(bd.buscaProfessor("Menino Jan"));
    	projeto.setPalavraChave("batata, problema");
    	projeto.setResumo("A nível organizacional, o julgamento imparcial das "
    			+ "eventualidades desafia a capacidade de equalização do "
    			+ "orçamento setorial. Podemos já vislumbrar o modo pelo qual "
    			+ "a consolidação das estruturas estende o alcance e a importância "
    			+ "das direções preferenciais no sentido do progresso. O incentivo "
    			+ "ao avanço tecnológico, assim como o surgimento do comércio virtual "
    			+ "causa impacto indireto na reavaliação dos modos de operação convencionais. ");
    	grupo.addProjeto(projeto);
    	bd.buscaProfessor("Menino Elvis").addProjeto(projeto);
    	
    }
}
