package Controler;
import Model.BancoDeDados;
import Model.Grupo;
import Model.Professor;
import java.util.List;

import javax.swing.JOptionPane;

import Exceptions.FooException;

public class GrupoControler {
	private static GrupoControler instance = new GrupoControler();
	
	private GrupoControler() {
		
	}
	
	public static GrupoControler getInstance() {
		return instance;
	}
	
	public void novoGrupo(String nome, String palavrasChave, String professores) throws Exception{
		
		BancoDeDados bd = BancoDeDados.getInstance();
		Grupo grupo = new Grupo();
		grupo.setNome(nome);
		grupo.setPalavrasChave(palavrasChave);
		grupo.addProfessores(professores);

		bd.addGrupo(grupo);

	}
	
	
}
