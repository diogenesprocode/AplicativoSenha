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
    
    public void inserirNormal(int lugar){
        Posicao posicao = new Posicao();
        posicao.proximo=null;
        posicao.numSenha=lugar;
        posicao.tipo="Normal";
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
    
    public void inserirPreferencial(int lugar){
        Posicao posicao = new Posicao();
        posicao.proximo=null;
        posicao.numSenha=lugar;
        posicao.tipo="Prefencial";
        if(semFila()){
            primeiraSenha=posicao;
        }else if(primeiraSenha.tipo.equals("Normal")){
            posicao.proximo=primeiraSenha;
            primeiraSenha=posicao;
        }else{
            Posicao proxposicao = primeiraSenha;
            while(proxposicao.proximo!=null && proxposicao.proximo.tipo.equals("Prefencial")){
                proxposicao=proxposicao.proximo;
            }
            posicao.proximo=proxposicao.proximo;
            proxposicao.proximo=posicao;
        }
    }
    
    public String Remover(){
        String atual;
        if(semFila()){
            atual= "Fila Vazia";
        }else {
            atual=primeiraSenha.numSenha+" "+primeiraSenha.tipo;
            primeiraSenha=primeiraSenha.proximo;       
        }
        return atual;
    }
   
}
