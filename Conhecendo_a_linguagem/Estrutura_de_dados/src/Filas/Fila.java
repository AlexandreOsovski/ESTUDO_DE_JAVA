package Filas;

public class Fila {
    private No refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public No first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }
            break;
            }
            return primeiroNo;

        }
        return null;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    public No dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;

            while (true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return noAuxiliar;

        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override   
    public String toString() {
        String stringRetorno = "";

        No noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null){
            while (true){

                stringRetorno += "[no{objeto =" + noAuxiliar.getObject() + "}]\n";

                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
