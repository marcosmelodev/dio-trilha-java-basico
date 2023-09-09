public class ResiltadoEscolar {

    public static void main(String[] args) {
        //int nota = 6;

        /*Scanner valorNota = new Scanner(System.in);
        *System.out.println("Insira a nota: ");
       * byte nota = valorNota.nextByte();
        */

        /*if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");
            */

        //Cond. Ternária
        int nota = 6;
        String resultado = nota >= 7? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
    
}
