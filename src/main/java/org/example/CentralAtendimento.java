package org.example;

public class CentralAtendimento {
    private static final CentralAtendimento instancia = new CentralAtendimento();

    private CentralAtendimento() {}

    public static CentralAtendimento getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A central de atendimento vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A central de atendimento agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A central de atendimento vai analisar a sugestão: " + mensagem;
    }
}
