
package Controler;

import Model.BancoDeDados;
import Model.Projeto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ProjetoControler extends AbstractTableModel {
	private List<Projeto> dados = new ArrayList();
	private String[] colunas = {"Nome","Palavra Chave","Professor"};
	
	private static ProjetoControler instance = new ProjetoControler();
	
	private ProjetoControler(){
	
	}

	public void buscaProjetosPendentes(){
		BancoDeDados banco = BancoDeDados.getInstance();
		List<Projeto> projetos = banco.getProjetos();
		dados.clear();
		for (Projeto p : projetos){
			if(!p.isAprovado())				
				dados.add(p);				
				this.fireTableDataChanged();
		}	
	}
	
	public static ProjetoControler getInstance() {
			return instance;
	}
	 public List<Projeto> getDados() {
		return dados;
	}

	public void setDados(List<Projeto> dados) {
		this.dados = dados;
	}

	public String[] getColunas() {
		return colunas;
	}

	public void setColunas(String[] colunas) {
		this.colunas = colunas;
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column]; //To change body of generated methods, choose Tools | Templates.
	}
	
 @Override
	public int getRowCount() {
		return dados.size();
	}

 @Override
	public int getColumnCount() {
		return colunas.length;
	}

 @Override
	public Object getValueAt(int linha, int coluna) {
		
		switch(coluna){
			case 0:
				return dados.get(linha).getNome();
			case 1:
				return dados.get(linha).getPalavraChave();
			case 2: 
				return dados.get(linha).getProfessorResponsavel().getNome();
		}		
	return null;		
	}
	

	public Projeto pegaProjeto(int linha){			  
		return dados.get(linha);
	}
}
