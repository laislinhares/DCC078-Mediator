import org.example.Cliente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteTest {
    @Test
    public void deveElogiarCentralAtendimento() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA central de atendimento respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A central de atendimento agradece a mensagem: Ótimo atendimento", cliente.elogiaCentralAtendimento("Ótimo atendimento"));
    }

    @Test
    public void deveReclamarCentralAtendimento() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA central de atendimento respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A central de atendimento vai procurar melhorar o serviço da reclamação: Lentidão no atendimento", cliente.reclamarCentralAtendimento("Lentidão no atendimento"));
    }

    @Test
    public void deveSugerirCentralAtendimento() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nA central de atendimento respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A central de atendimento vai analisar a sugestão: Aumentar número de atendentes", cliente.sugerirCentralAtendimento("Aumentar número de atendentes"));
    }
}
