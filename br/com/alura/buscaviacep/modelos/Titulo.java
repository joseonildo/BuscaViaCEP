package br.com.alura.buscaviacep.modelos;

public class Titulo {
    private final String cep;
    private final String logradouro;
    private final String complemento;
    private final String bairro;
    private final String cidade;
    private final String uf;
    private final String ibge;
    private final String gia;
    private final String ddd;
    private final String siafi;
    private final Boolean erro;

    public Titulo(TituloJson meuTituloJson) {

        this.cep = meuTituloJson.cep();
        this.logradouro = meuTituloJson.logradouro();
        this.complemento = meuTituloJson.complemento();
        this.bairro = meuTituloJson.bairro();
        this.cidade = meuTituloJson.localidade();
        this.uf = meuTituloJson.uf();
        this.ibge = meuTituloJson.ibge();
        this.gia = meuTituloJson.gia();
        this.ddd = meuTituloJson.ddd();
        this.siafi = meuTituloJson.siafi();
        if (meuTituloJson.erro() == null) {
            this.erro = false;
        } else {
            this.erro = meuTituloJson.erro();
        }
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getLocalidade() {
        return this.cidade;
    }

    public String getUf() {
        return this.uf;
    }

    public String getIbge() {
        return ibge;
    }

    public String getGia() {
        return gia;
    }

    public String getDdd() {
        return ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public Boolean getErro() {
        return erro;
    }

    public String toString() {
        return "\nCEP: " + this.getCep() +
                "\nLogradouro: " + this.getLogradouro() +
                "\nComplemento: " + this.getComplemento() +
                "\nBairro: " + getBairro() +
                "\nCidade: " + getLocalidade() +
                "\nUF: " + getUf();

    }
}