package conceitos_basicos;

public class MeuObjeto {

    Integer IntA;

    public MeuObjeto(Integer intA) {
        IntA = intA;
    }

    public void setIntA(Integer intA) {

        IntA = intA;
    }

    @Override
    public String toString() {

        return this.IntA.toString();
    }
}
