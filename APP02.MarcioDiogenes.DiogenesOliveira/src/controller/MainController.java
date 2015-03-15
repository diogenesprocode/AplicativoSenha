package controller;
import model.Fila;

public class MainController {
        private Fila jFila;
        private int senhaNumNor;
        private int senhaNumPref;
 	
	public MainController (){
            jFila = new Fila();
            senhaNumNor= 0;
            senhaNumPref = 0;
		
	}
	
	public void retirarSenhaNormal (){	
                senhaNumNor ++; 
                jFila.inserirNormal(senhaNumNor);
                System.out.println("Clicou no botão Normal numero da senha = "+senhaNumNor);
	}
	
	public void retirarSenhaPreferencial(){
		
                senhaNumPref++;
                System.out.println("Clicou no botão Preferencial numero da senha = "+senhaNumPref);
                jFila.inserirPreferencial(senhaNumPref);
	}
	
	public String chamarSenha (){
		System.out.println("Clicou no botão Chamar Senha");
                
                return jFila.oQueoBancoNaoFaz();    
	}
        public String chamarAtual (){
                 if(jFila.posInicial() == null){
                      return "Fila Vazia";
                 }else{
                      return jFila.posInicial().numSenha +" "+ jFila.posInicial().tipo;     
                 }
                
	}
	
	

}
