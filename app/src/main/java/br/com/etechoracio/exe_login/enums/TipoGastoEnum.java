package br.com.etechoracio.exe_login.enums;

public enum TipoGastoEnum {

    ALIMENTECAO("Alimentação"),
    COMBUSTIVEL("Combustível"),
    TRANSPORTE("Transporte"),
    HOSPEDAGEM("Hospedagem"),
    OUTROS("Outros");
    private String descricao;

    @Override
    public String toString() {
        return descricao;

    }
}
