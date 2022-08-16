package br.edu.ifsp.scl.ads.pdm.cadastro;

public class Formulario {
    private String nomeCompleto;
    private String telefone;
    private String email;
    private boolean ingressarListEmail;
    private String sexo;
    private String cidade;
    private Estados estado;

    public Formulario(String nomeCompleto, String telefone, String email, boolean ingressarListEmail, String sexo, String cidade, Estados estado) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.ingressarListEmail = ingressarListEmail;
        this.sexo = sexo;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Formulario() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIngressarListEmail() {
        return ingressarListEmail;
    }

    public void setIngressarListEmail(boolean ingressarListEmail) {
        this.ingressarListEmail = ingressarListEmail;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", ingressarListEmail=" + ingressarListEmail +
                ", sexo='" + sexo + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
