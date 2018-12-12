
package Controler;

import Model.BancoDeDados;


public class BancoDeDadosControler {
    
    public BancoDeDadosControler(){
        
        
    }
    
    public void autorizaProjeto(String nome){
       BancoDeDados bd = BancoDeDados.getInstance();
       bd.aprovaProjeto(nome);
    }
    
    public void removeProjeto(String nome){
       BancoDeDados bd = BancoDeDados.getInstance();
       bd.recusaProjeto(nome);
    }
}
