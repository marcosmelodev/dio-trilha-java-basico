public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        }catch(CepInvalidoException e){
            System.out.println("O cep não corresponde com as regras de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.lenght() !=8)
        throw new CepInvalidoException();

        //simulando um retorno de cep
        return"23.765-064";
    }
}
