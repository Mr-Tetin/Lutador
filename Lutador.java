package Lutador;

abstract class Lutador{
    private String nome;
    private String alcunha;
    private int forca;
    private int velocidade;
    private int vida;
    private int cura;

    public Lutador(){
        super();
    }
    public Lutador(String nome, String alcunha){
        setNome(nome);
        setAlcunha(alcunha);
    }
    public Lutador(String nome,String alcunha, int forca, int velocidade, int vida){
        setNome(nome);
        setAlcunha(alcunha);
        setVida(vida);
        setVelocidade(velocidade);
        setForca(forca);
    }

    //sets
    public void setNome(String nome) {
        if(nome != null) {
            this.nome = nome;
        }
    }
    public void setAlcunha(String alcunha) {
        if(alcunha != null){
            this.alcunha = alcunha;
        }
    }
    public void setCura(int cura) {
        if(cura > 0){
            this.cura = cura;
        }
    }
    public void setForca(int forca) {
        if(forca > 0){
            this.forca = forca;
        }
    }
    public void setVelocidade(int velocidade) {
        if(velocidade > 0){
            this.velocidade = velocidade;
        }
    }
    public void setVida(int vida) {
        if(vida > 0){
            this.vida = vida;
        }
    }

    //gets
    public String getNome() {
        return nome;
    }
    public String getAlcunha() {
        return alcunha;
    }
    public int getForca() {
        return forca;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public int getVida() {
        return vida;
    }
    public int getCura() {
        return cura;
    }
    //metodos
    abstract public int poderDeAtaque();
    abstract public int poderDeDefesa();
}
