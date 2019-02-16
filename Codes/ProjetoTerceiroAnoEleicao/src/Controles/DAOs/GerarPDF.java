
package Controles.DAOs;

import Controles.Conexões.ExecuteSQL;
import Modelos.Candidato.Candidato;
import Modelos.Eleição.Eleicao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GerarPDF extends ExecuteSQL {

    public static void main(String[] args){
        
    }

    public GerarPDF(Connection con) {
        super(con);
    }
    
    public String selecionarNomeEleicao(int cod){
        String finalResult="";
        Eleicao c = new Eleicao();
            try{
                String consulta = "SELECT nome_eleicao FROM eleicao WHERE num_eleicao="+cod+"";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            c.setNome_eleicao(rs.getString(1));
                        }
                        finalResult=c.getNome_eleicao();
            } catch (SQLException ex){
                ex.getMessage();
            }
        return finalResult;
    }
    
    public List<Candidato> listarCandidatos(int num_eleicao){
        String sql = "SELECT cod_candidato,nome,votos FROM candidato WHERE num_eleicao="+num_eleicao+" ORDER BY votos DESC";
        List<Candidato> lista = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                if(rs!=null){
                    while(rs.next()){
                        Candidato a = new Candidato();
                        a.setCod_candidato(rs.getInt(1));
                        a.setNome(rs.getString(2));
                        a.setVotos(rs.getInt(3));
                        lista.add(a);
                    }
                    return lista;
                }else{
                    return null;
                }
        }catch(SQLException ex){
            return null;
        }
    }
    
    public List<Eleicao> listarEleicao(int num_eleicao){
        String sql = "SELECT * FROM eleicao WHERE num_eleicao="+num_eleicao+"";
        List<Eleicao> lista = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                if(rs!=null){
                    while(rs.next()){
                        Eleicao a = new Eleicao();
                        a.setNum_eleicao(rs.getInt(1));
                        a.setNome_eleicao(rs.getString(2));
                        a.setData(rs.getString(3));
                        a.setOrganizador(rs.getString(4));
                        a.setNulos(rs.getInt(5));
                        a.setBrancos(rs.getInt(6));
                        a.setValidos(rs.getInt(7));
                        lista.add(a);
                    }
                    return lista;
                }else{
                    return null;
                }
        }catch(SQLException ex){
            return null;
        }
    }
    
}
