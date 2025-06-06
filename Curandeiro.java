package Lutador;

public class Curandeiro extends Lutador{

    //construtores
    public Curandeiro(){
        super();
    }
    public Curandeiro(String nome, String alcunha){
        setNome(nome);
        setAlcunha(alcunha);
    }
    public Curandeiro(String nome,String alcunha, int forca, int velocidade, int vida){
        setNome(nome);
        setAlcunha(alcunha);
        setVida(vida);
        setVelocidade(velocidade);
        setForca(forca);
    }

    //7's
    public void setCura(int cura) {
        if (cura > getForca() && cura > getCura() && cura > getVelocidade()) {
            super.setVida(cura);
        }
    }

    @Override
    public int poderDeAtaque() {
        return getCura() + (getCura() * getVelocidade());
    }
    @Override
    public int poderDeDefesa() {
        return getCura() + (getCura() * getVida());
    }
}
