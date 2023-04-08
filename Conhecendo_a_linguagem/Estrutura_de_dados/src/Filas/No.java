package Filas;

public class No {
    private Object object; //conteúdo do nó
    private No refNo;

    public No getRefNo() {
        return refNo;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void setRefNo(No refNo) {

        this.refNo = refNo;
    }

    public No(){

    }
    public No(Object object){
        this.refNo = null;
        this.object = object;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }


}
