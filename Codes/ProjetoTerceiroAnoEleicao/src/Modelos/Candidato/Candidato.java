
package Modelos.Candidato;

public class Candidato {

    public static void main(String[] args) {
        System.out.println("Modelo do candidato funcionando ok.");
    }
 
    private int cod_inu;
    private int cod_candidato;
    private String nome;
    private String foto;
    private int votos;
    private int num_eleicao;

    public int getCod_inu() {
        return cod_inu;
    }

    public void setCod_inu(int cod_inu) {
        this.cod_inu = cod_inu;
    }

    public int getCod_candidato() {
        return cod_candidato;
    }

    public void setCod_candidato(int cod_candidato) {
        this.cod_candidato = cod_candidato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getNum_eleicao() {
        return num_eleicao;
    }

    public void setNum_eleicao(int num_eleicao) {
        this.num_eleicao = num_eleicao;
    }

    
}
