package conceitos_basicos;

import java.util.List;

public class AtribuicaoReferencia {

    public void main(String[] args) {

        int A = 1;
        int B = A;


        System.out.println("A = " + A +  " B = " + B);
        A = 2;
        System.out.println("A = " + A +  " B = " + B);


        MeuObjeto meuObjetoA = new MeuObjeto(1);
        MeuObjeto meuObjetoB = meuObjetoA;

        System.out.print("meuObjetoA = " + meuObjetoA +  " meuObjetoB = " + meuObjetoB);
            meuObjetoA.setIntA(2);
        System.out.println("\n");
        System.out.println("meuObjetoA = " + meuObjetoA +  " meuObjetoB = " + meuObjetoB);

    }
}
