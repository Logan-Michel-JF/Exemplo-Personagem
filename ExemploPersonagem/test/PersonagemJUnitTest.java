
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Logan Michel
 */
public class PersonagemJUnitTest {
    
    @Test
    public void testeDefinirEObterNome() {
        Personagem sakura = new Personagem();
        sakura.setNome("Sakura");
        assertEquals("Sakura", sakura.getNome());
        sakura.setNome("Sakura Haruno");
        assertEquals("Sakura Haruno", sakura.getNome());
    }
    
    @Test
    public void testeDefinirEObter() {
        Personagem choji = new Personagem();
        choji.setNome("Choji");
        choji.setIdade((byte) 17);
        assertEquals(17, choji.getIdade());
    }
    
    @Test
    public void testeDefinirEObterNivelSexo() {
        Personagem zabuza = new Personagem();
        zabuza.setSexo('m');
        assertEquals('m', zabuza.getSexo());
    }
    
    @Test
    public void testeDefinirEObterNivelChakra() {
        Personagem deidara = new Personagem();
        deidara.setNivelChakra(500);
        assertEquals(500, deidara.getNivelChakra());
        
    }
    
    @Test
    public void testeDefinirEObterAldeia() {
        Personagem rookLee = new Personagem();
        rookLee.setAldeia("Folha");
        assertEquals("Folha", rookLee.getAldeia());
        
    }
    
    @Test
    public void testeDefinirEObterCla() {
        Personagem hinata = new Personagem();
        hinata.setCla("Hyuuga");
        assertEquals("Hyuuga", hinata.getCla());
        
    }
    
    @Test
    public void testeDefinirEObterIdadeMental(){
        Personagem jiraya = new Personagem();
        jiraya.setIdadeMental((byte) -10);
        assertEquals(-10, jiraya.getIdadeMental());
    }
}
