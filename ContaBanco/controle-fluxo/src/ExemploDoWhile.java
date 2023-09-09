public class ExemploDoWhile {
    public static void main(String[] args) {

       /*System.out.println("Discando...");

        do {
            //executado repetidas vezes até que alguém atenda
            System.out.println("Telefone tocando");
        }while (tocando());

        System.out.println("Alô!!!");
        
        
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? "  + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;*/
    int num = 5, count = 1;
    do{
        num += count;
        System.out.println(num);
    }while(count <=3);
    }

    }
    
    
}
