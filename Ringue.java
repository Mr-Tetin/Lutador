package Lutador;

public class Ringue {

    private Lutador lutadorUm;
    private Lutador lutadorDois;

    public Ringue(){
        super();
    }
    public Ringue(Lutador lutadorUm, Lutador lutadorDois){
        setLutadorUm(lutadorUm);
        setLutadorDois(lutadorDois);
    }

    //7's
    public void setLutadorUm(Lutador lutadorUm){
        this.lutadorUm = lutadorUm;
    }
    public void setLutadorDois(Lutador lutadorDois){
        this.lutadorDois = lutadorDois;
    }

    //gets
    private Lutador getLutadorUm(){
        return lutadorUm;
    }
    private Lutador getLutadorDois(){
        return lutadorDois;
    }

    public String lutar(){
        String maisataque = "";
        String maisdefesa = "";
        String resultado = "";

        //forca
        if(lutadorUm.poderDeAtaque() > lutadorDois.poderDeAtaque()){
            maisataque = lutadorUm.getNome();
        }else if(lutadorUm.poderDeAtaque() < lutadorDois.poderDeAtaque()){
            maisataque = lutadorDois.getNome();
        }else{
            maisataque = "Empatados";
        }

        //defesa
        if(lutadorUm.poderDeDefesa() > lutadorDois.poderDeDefesa()){
            maisdefesa = lutadorUm.getNome();
        }else if(lutadorUm.poderDeDefesa() < lutadorDois.poderDeDefesa()){
            maisdefesa = lutadorDois.getNome();
        }else{
            maisdefesa = "Empatados";
        }

        //resultado

        //lutador 1
        if(lutadorUm.poderDeAtaque() > lutadorDois.poderDeAtaque()){
            resultado = lutadorUm.getNome();
        }else if(lutadorUm.poderDeDefesa() > lutadorDois.poderDeDefesa()){
            resultado = lutadorUm.getNome();
        }
        //lutador dois
        else if(lutadorDois.poderDeAtaque() > lutadorUm.poderDeAtaque()){
            resultado = lutadorDois.getNome();
        }else if(lutadorDois.poderDeDefesa() > lutadorUm.poderDeDefesa()){
            resultado = lutadorDois.getNome();
        }else if(lutadorUm.poderDeAtaque() == lutadorDois.poderDeAtaque() && lutadorUm.poderDeDefesa() == lutadorDois.poderDeDefesa()){
            resultado = "Empate";
        }else{
            resultado = "Empate";
        }

        return "Maior poder de ataque: " + maisataque + "\nMaior poder de defesa: " + maisdefesa + "\nO resultado e: " + resultado;
    }

    public String apresentandoLutadores(){
        return "De um lado o(a) " + lutadorUm.getNome() + " o(a) incrivel " + lutadorUm.getAlcunha() + "\nVS\nE do outro " + lutadorDois.getNome() + " o(a) espetacular " + lutadorDois.getAlcunha() + "\nQuem sera o(a) campeao";
    }

}
