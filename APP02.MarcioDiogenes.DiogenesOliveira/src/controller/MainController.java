package controller;
import model.Fila;

public class MainController {
        private Fila jFila;
 	
	public MainController (){
            jFila = new Fila();
		
	}
	
	public void retirarSenhaNormal (){
		System.out.println("Clicou no botão Normal");
                jFila.inserirNormal(3);
	}
	
	public void retirarSenhaPreferencial(){
		System.out.println("Clicou no botão Preferencial");
                jFila.inserirPreferencial(2);
	}
	
	public String chamarSenha (){
		System.out.println("Clicou no botão Chamar Senha");
                
                return jFila.oQueoBancoNaoFaz();
             
	}
	
	

}
