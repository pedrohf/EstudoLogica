import estudos.SimplesVetorNumerico;
import org.junit.Test;

public class TestSimplesVetorNumerico {

    @Test
    public void teste() {
        SimplesVetorNumerico vetorNumerico = new SimplesVetorNumerico();
        vetorNumerico.carregaMemoria();
        vetorNumerico.iteracao();
    }

    @Test
    public void testeQualOMenorNumero() {
//sabemos que o numero menor  e o 3
        SimplesVetorNumerico vetorNumerico = new SimplesVetorNumerico();
        vetorNumerico.carregaMemoria();
        vetorNumerico.qualOMenorNumero();
    }
}
