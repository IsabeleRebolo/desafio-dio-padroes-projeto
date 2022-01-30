package Subsistema3.contato;


public class ContatoApi {
    private static ContatoApi instancia = new ContatoApi();

    private ContatoApi() {
        super();
    }

    public static ContatoApi getInstancia() {
        return instancia;
    }

    public String solicitarTelefone(String cpf) {
        return "(11)98786-2637)";
    }

    public String solicitarEmail(String cpf) {
        return "venilton@gmail.com";
    }

    public String solicitarLinkedin(String cpf) {
        return "www.linkedin.com/in/venilton";
    }

    public String solicitarInstagran(String cpf) {
        return "@venilton";
    }
}
