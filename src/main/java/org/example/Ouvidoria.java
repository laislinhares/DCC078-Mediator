package org.example;

public class Ouvidoria {
    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioCentralAtendimento(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A central de atendimento respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CentralAtendimento.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoCentralAtendimento(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A central de atendimento respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CentralAtendimento.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoCentralAtendimento(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A central de atendimento respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CentralAtendimento.getInstancia().receberSugestao(mensagem);
    }
}
