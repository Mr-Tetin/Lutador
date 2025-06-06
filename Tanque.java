package Lutador;

public class Tanque extends Lutador{

    //construtores
    public Tanque(){
        super();
    }
    public Tanque(String nome, String alcunha){
        setNome(nome);
        setAlcunha(alcunha);
    }
    public Tanque(String nome,String alcunha, int forca, int velocidade, int vida){
        setNome(nome);
        setAlcunha(alcunha);
        setVida(vida);
        setVelocidade(velocidade);
        setForca(forca);
    }

    //7's
    public void setVida(int vida) {
        if (vida > getForca() && vida > getCura() && vida > getVelocidade()) {
            super.setVida(vida);
        }
    }

    @Override
    public int poderDeAtaque() {
        return getVida() + (getForca() * getVelocidade());
    }
    @Override
    public int poderDeDefesa() {
        return getVida() + (getCura() * getVida());
    }
}
