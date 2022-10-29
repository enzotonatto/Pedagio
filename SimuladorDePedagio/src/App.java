public class App {

    public static String ABC1234;

    public static void main(String[] args) throws Exception {
        
        Veiculo v1 = new Veiculo(Veiculo.gerarPlaca(), Veiculo.gerarTipoVeiculo());
        Veiculo v2 = new Veiculo(Veiculo.gerarPlaca(), Veiculo.gerarTipoVeiculo());
        Veiculo v3 = new Veiculo(Veiculo.gerarPlaca(), Veiculo.gerarTipoVeiculo());
        Veiculo v4 = new Veiculo(Veiculo.gerarPlaca(), Veiculo.gerarTipoVeiculo());

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v4.toString());
        


    }
}
