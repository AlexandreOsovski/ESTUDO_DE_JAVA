public class Caminhao extends Veiculo{

    int pesoMaximoSuportado;
    String empresaCaminhao;


    void setPesoMaximoSuportado(int pesoMaximoSuportado){
        this.pesoMaximoSuportado = pesoMaximoSuportado;
    }
    int getPesoMaximoSuportado(){
        return pesoMaximoSuportado;
    }
    void setEmpresaCaminhao(String empresaCaminhao){
        this.empresaCaminhao = empresaCaminhao;
    }
    String getEmpresaCaminhao(){
        return empresaCaminhao;
    }
}
