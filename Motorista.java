class Motorista{
    private String nome;
    private int anoNascimento;
    private char tipoCNH = '-';

public int getAnoNascimento() {
    return anoNascimento;
}
public String getNome() {
    return nome;
}
public char getTipoCNH() {
    return tipoCNH;
}
public void setTipoCNH(String tipo) {
    char tipoCNH[] = tipo.toUpperCase().toCharArray();

    if(tipoCNH[0] == 'A' || tipoCNH[0] == 'B' || tipoCNH[0] == 'Z'){
        this.tipoCNH = tipoCNH[0];
    }
}
    
    public Motorista (String nome, String anoNascimento) {
        super();
        this.nome = nome;
        this.anoNascimento = Integer.parseInt(anoNascimento);
        
    }



}