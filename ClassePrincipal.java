package Lutador;

public class ClassePrincipal {
    public static void main(String[] args){
        //Aqui você pode instanciar seus objetos conforme as classes disponibilizadas, para voce poder ver como funciona ja instanciei alguns lutadores

        //lutadores
        Tanque Cleiton = new Tanque("Cleiton", "Cavalo De Guerra", 250, 30, 100);
        Curandeiro Jeniffer = new Curandeiro("Jeniffer", "Bruxa do Bosque", 25, 50, 250);
        Algoz Wally = new Algoz("Wally", "Flash", 50, 250, 100);

        //Primeira Luta
        Ringue Luta1 = new Ringue(Cleiton, Jeniffer); //Quem ganhar luta contra o wally(chaveamento)
        String Apresentar = Luta1.apresentandoLutadores();
        String Vencedor1 = Luta1.lutar();

        System.out.printf(Apresentar);
        System.out.printf(Vencedor1);

        //Segunda Luta
        String Vencedor2;

        if(Cleiton.getNome().equals(Ringue.resultado)){
            Ringue Luta2 = new Ringue(Cleiton, Wally);
            Vencedor2 = Luta2.lutar();
            String Apresentar2 = Luta2.apresentandoLutadores();

            System.out.printf(Apresentar2);
            System.out.printf(Vencedor2);
        }else{
            Ringue Luta2 = new Ringue(Jeniffer, Wally);
            Vencedor2 = Luta2.lutar();
            String Apresentar2 = Luta2.apresentandoLutadores();

            System.out.printf(Apresentar2);
            System.out.printf(Vencedor2);
        }
    }
}
