import org.ita.EmbaralhaFacil;
import org.ita.EmbaralhaFisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmbaralhamentoTests {
    @Test
    public void testEmbaralhaFacil() {
        EmbaralhaFacil embaralhaFacil = new EmbaralhaFacil();
        String palavraEmbaralhada = embaralhaFacil.embaralhaPalavra("JOSE");
        assertEquals("OEJS", palavraEmbaralhada);
        System.out.println(palavraEmbaralhada);
    }


    @Test
    public void testEmbaralhaFisher() {
        EmbaralhaFisher embaralhaFisher = new EmbaralhaFisher();
        String palavraEmbaralhada = embaralhaFisher.embaralhaPalavra("JOSE");
        System.out.println(palavraEmbaralhada);
    }
}
