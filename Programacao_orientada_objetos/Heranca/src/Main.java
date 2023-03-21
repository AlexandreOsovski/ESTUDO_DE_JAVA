import downcast.*;


public class Main {

    public static void main(String[] args) {
        String resultado;


        Carro carro = new Carro();


        System.out.println("____________ CARRO ______________");

        resultado = carro.marcaCarro = "Fiat";
        System.out.println(resultado);

        resultado = carro.modeloCarro = "Uno";
        System.out.println(resultado);

        resultado = carro.combustivel = "gasolina";
        System.out.println(resultado);

        resultado = carro.motor = "v8";
        System.out.println(resultado);

        int resultadoDois;
        resultadoDois = carro.anoFabricacao = 2021;
        System.out.println(resultadoDois);

        System.out.println("____________ CAMINHÃO ______________");

        Caminhao caminhao = new Caminhao();

        resultado = caminhao.empresaCaminhao = "Ford";
        System.out.println(resultado);

        resultadoDois = caminhao.pesoMaximoSuportado = 150000;
        System.out.println(resultadoDois);

        resultado = caminhao.motor = "v15";
        System.out.println(resultado);

        resultado = caminhao.combustivel = "Diesel";
        System.out.println(resultado);

        resultadoDois = caminhao.anoFabricacao = 2021;
        System.out.println(resultadoDois);


        //______________ DOWNCAST E UPCAST

        Funcionario funcionario = new Funcionario();

        //UPCAST
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        //DOWNCAST(classe pai "Funcionario" quero transformar na classe filho "vendedor")
        //precisam ter os mesmos dados
        Vendedor vendedor1 = (Vendedor) new Funcionario();

        //Vai trazer apenas os dados da classe pai
        //pega a classe filho e transforma na classe pai

        Veiculo carros = new Carro();

        //DOWNcast pega a classe pai e transforma na classe filho (não é recomendado usar por conta de erros)
        Veiculo carroDois = (Veiculo) new Carro();

    }


}