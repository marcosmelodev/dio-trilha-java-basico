public class TesteLogica {

    public static void main(String[] args) {
        String heroi;
        int xp;
        String categoria;
        heroi = "Marcos";
        xp = 1500;
        

        System.out.println(" O Herói de nome " + heroi + ". está no nível " + xp);

        if(xp < 1000){
            System.out.println("Categoria Ferro");
        }else if (xp > 1000 && xp <= 2000){
            System.out.println(" Categoria Bronze");
        }else if (xp > 2000 && xp <= 5000){
            System.out.println("Categoria Prata");
        }else if (xp > 6000 && xp <= 7000){
            System.out.println(" Categoria Ouro");

        }else if (xp > 7000 && xp <= 8000) {
            System.out.println(" Categoria Platina");
        }else if (xp > 8000 && xp <= 9000) {
            System.out.println("Categoria Ascendente");
        }else if (xp > 9000 && xp <= 10000){
            System.out.println("Categoria Imortal");
        }else{
            System.out.println("Categoria Radiante");
        }

    }
}