package org.acme.Endereco;

public class EnderecoVO {
    
    private String logradouro;
    
    private String numero;
    
    private String complemento;
    
    private String localidade;
    
    private String cep;
    
    private String bairro;
    
    private String cidade;
    
    private String uf;

    public EnderecoVO() {
    }

    public EnderecoVO(String logradouro, String numero, String complemento, String localidade, String cep,
            String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.localidade = localidade;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}
