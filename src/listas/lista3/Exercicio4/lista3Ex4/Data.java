package listas.lista3.Exercicio4.lista3Ex4;
class Data {
    private String mes;
    private int dia;
    private int ano;
    private int m;
    private int diasCorridos;
    private int diasDoAno;

    Data (int dia, int m, int ano){
        this.dia=dia;
        this.ano=ano;
        this.m=m;
    }
    Data (int dia, String Mes, int ano){
        this.dia=dia;
        this.ano=ano;
        this.mes=Mes;
    }
    Data (int diasCorridos, int diasDoAno){
        this.diasCorridos=diasCorridos;
        this.diasDoAno=diasDoAno;

    }
    public String getMes() {
        return this.mes;
    }
    public int getAno() {
        return this.ano;
    }
    public int getDia() {
        return this.dia;
    }
    public int getM() {
        return this.m;
    }
    public int getDiasCorridos() {
        return this.diasCorridos;
    }
    public int getDiasDoAno() {
        return this.diasDoAno;
    }


}
