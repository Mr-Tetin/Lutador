package Lutador;

public class Destruidor extends Lutador{

    //construtores
    public Destruidor(){
        super();
    }
    public Destruidor(String nome, String alcunha){
        setNome(nome);
        setAlcunha(alcunha);
    }
    public Destruidor(String nome,String alcunha, int forca, int velocidade, int vida){
        setNome(nome);
        setAlcunha(alcunha);
        setVida(vida);
        setVelocidade(velocidade);
        setForca(forca);
    }

    //7's
    public void setForca(int forca) {
        if (forca > getVida() && forca > getCura() && forca > getVelocidade()) { //se nao der tenta trocar por getforca e assim por diante
            super.setForca(forca);
        }
    }

    @Override
    public int poderDeAtaque() {
        return getForca() + (getForca() * getVelocidade());
    }
    @Override
    public int poderDeDefesa() {
        return getForca() + (getCura() * getVida());
    }
}
