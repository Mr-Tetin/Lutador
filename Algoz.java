package Lutador;

public class Algoz extends Lutador{
    //construtores
    public Algoz(){
        super();
    }
    public Algoz(String nome, String alcunha){
        setNome(nome);
        setAlcunha(alcunha);
    }
    public Algoz(String nome,String alcunha, int forca, int velocidade, int vida){
        setNome(nome);
        setAlcunha(alcunha);
        setVida(vida);
        setVelocidade(velocidade);
        setForca(forca);
    }

    //7's
    public void setVelocidade(int velocidade) {
        if (velocidade > getForca() && velocidade > getCura() && velocidade > getVida()) {
            super.setVida(velocidade);
        }
    }

    @Override
    public int poderDeAtaque() {
        return getVelocidade() + (getForca() * getVelocidade());
    }
    @Override
    public int poderDeDefesa() {
        return getVelocidade() + (getCura() * getVida());
    }
}
