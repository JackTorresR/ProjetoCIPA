
package Modelos.Eleição;

public class Eleicao {

    public static void main(String[] args) {
        System.out.println("Modelo da eleição funcionando ok.");
    }
    
    private int num_eleicao;
    private String nome_eleicao;
    private String data;
    private String organizador;
    private int nulos;
    private int brancos;
    private int validos;

    public int getNum_eleicao() {
        return num_eleicao;
    }

    public void setNum_eleicao(int num_eleicao) {
        this.num_eleicao = num_eleicao;
    }

    public String getNome_eleicao() {
        return nome_eleicao;
    }

    public void setNome_eleicao(String nome_eleicao) {
        this.nome_eleicao = nome_eleicao;
    }
        
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public int getNulos() {
        return nulos;
    }

    public void setNulos(int nulos) {
        this.nulos = nulos;
    }

    public int getBrancos() {
        return brancos;
    }

    public void setBrancos(int brancos) {
        this.brancos = brancos;
    }

    public int getValidos() {
        return validos;
    }

    public void setValidos(int validos) {
        this.validos = validos;
    }
    
    
    
}
