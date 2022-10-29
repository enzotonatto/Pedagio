import java.util.Random;

public class Veiculo {
    private String placa;
    private TipoVeiculo tipo;
    private String ABC1234;
    public static int num=0;
    
    public Veiculo (String placa, TipoVeiculo tipo){
        this.placa = placa; 
        this.tipo = tipo;
    }
    
    public String getPlaca() {
        return placa;
    }

    public static Veiculo gerarNovoVeiculo(){
        Veiculo v = new Veiculo(gerarPlaca(), gerarTipoVeiculo());

        return v;
    }    

    public static String gerarPlaca(){
        Random random = new Random();
        String placa = "";
        for(int i=0; i<3; i++){
            char letras = (char)(random.nextInt(26) + 'A');
            placa = placa + letras;
        }

        for(int i=0; i<4; i++){
            char numeros  = (char)(random.nextInt((57-49)+1) + 49);
            placa = placa + numeros;
        }
        return placa; 
    }

    public static TipoVeiculo gerarTipoVeiculo(){
        Random random = new Random();
        int indice = random.nextInt(3);

        TipoVeiculo tipo = TipoVeiculo.values()[indice];
        return tipo;
    }

    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", tipo=" + tipo + "]";
    }

  

}
