package model;

public class Fila {    
    public Posicao primeiraSenha;
    
    public Fila() {            
        primeiraSenha = null;            
    }
    
    public boolean semFila(){ 
        if(primeiraSenha == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void inserirNormal(String lugar){
        Posicao posicao = new Posicao();
        posicao.proximo=null;
        posicao.numSenha=lugar;
        if(semFila()){
            primeiraSenha=posicao;
        }
        else{
            Posicao proxposicao = primeiraSenha;
            while(proxposicao.proximo != null){
                proxposicao=proxposicao.proximo;
            }
            proxposicao.proximo=posicao;
        }
    }
    
    public void inserirPreferencial(){
        
    }
    
    public void oQueoBancoNaoFaz(){
        
    }
}
