package listas.lista4.Exercicio8;

public class Par <F, S > {
    private F f;
    private S s;

    Par (F f, S s){
        this.f=f;
        this.s=s;
    }
    

    public F getF(){
        return f;
    }
    public void setF(F f){
        this.f=f;
    }
    public S getS(){
        return s;
    }
    public void setS(S s){
        this.s=s;
    }
    
}
