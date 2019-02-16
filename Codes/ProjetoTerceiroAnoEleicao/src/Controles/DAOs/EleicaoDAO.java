
package Controles.DAOs;

import Controles.Conexões.ExecuteSQL;
import Modelos.Eleição.Eleicao;
import java.sql.*;
import java.util.*;

public class EleicaoDAO extends ExecuteSQL {

    public static void main(String[] args) {
        System.out.println("EleicãoDAO ok");
    }

    public EleicaoDAO(Connection con) {
        super(con);
    }

    //--------------------------------------------------------------------------
    
    //Cadastro eleicao(IN)
    
    public int verificarCod(){
        int finalResult=0;
        Eleicao c = new Eleicao();
            try{
                String consulta = "SELECT num_eleicao FROM eleicao ORDER BY num_eleicao DESC LIMIT 1";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            c.setNum_eleicao(rs.getInt(1));
                        }
                        finalResult=c.getNum_eleicao()+1;
            } catch (SQLException ex){
                ex.getMessage();
            }
        return finalResult;
        
    }
    
    public String inserirEleicao(Eleicao a){
        //String para insersão de dados(dado de alunos)
        String sql = "INSERT INTO eleicao VALUES (?,?,?,?,?,?,?)";
        
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setInt(1, a.getNum_eleicao());
                ps.setString(2, a.getNome_eleicao());
                ps.setString(3, a.getData());
                ps.setString(4, a.getOrganizador());
                ps.setInt(5, a.getNulos());
                ps.setInt(6, a.getBrancos());
                ps.setInt(7, a.getValidos());
                
                    //Se a conexão for realizada vai dropar mais de 1, logo, se true, fucionou.
                    if(ps.executeUpdate()>0){
                        return "ok";
                    }else{
                        return "Não ok";
                    }
                
        } catch (SQLException ex) {
            return ex.getMessage();
        }

    }
    
    //Cadastro eleicao(OUT)

    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
    
    //Cadastro votos(IN)
    
    public int verificarEleicao(){
        int finalResult=0;
        Eleicao c = new Eleicao();
            try{
                String consulta = "SELECT num_eleicao FROM eleicao ORDER BY num_eleicao DESC LIMIT 1";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            c.setNum_eleicao(rs.getInt(1));
                        }
                        finalResult=c.getNum_eleicao();
            } catch (SQLException ex){
                ex.getMessage();
            }
        return finalResult;
        
    }
    
    public int verificarNulos(int cod){
        int finalResult=0;
        Eleicao c = new Eleicao();
            try{
                String consulta = "SELECT nulos FROM eleicao WHERE num_eleicao="+cod+"";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            c.setNulos(rs.getInt(1));
                        }
                        finalResult=c.getNulos()+1;
            } catch (SQLException ex){
                ex.getMessage();
            }
        return finalResult;
        
    }
    
    public String votarNulo(Eleicao a){
        //String para insersão de dados(dado de eleicao)
        String sql = "UPDATE eleicao SET nulos=? WHERE num_eleicao=?";
        
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setInt(1, a.getNulos());
                ps.setInt(2, a.getNum_eleicao());
                
                    //Se a conexão for realizada vai dropar mais de 1, logo, se true, fucionou.
                    if(ps.executeUpdate()>0){
                        return "ok";
                    }else{
                        return "Não ok";
                    }
                
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
    public int verificarBrancos(int cod){
        int finalResult=0;
        Eleicao c = new Eleicao();
            try{
                String consulta = "SELECT brancos FROM eleicao WHERE num_eleicao="+cod+"";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            c.setBrancos(rs.getInt(1));
                        }
                        finalResult=c.getBrancos()+1;
            } catch (SQLException ex){
                ex.getMessage();
            }
        return finalResult;
        
    }
    
    public String votarBranco(Eleicao a){
        //String para insersão de dados(dado de eleicao)
        String sql = "UPDATE eleicao SET brancos=? WHERE num_eleicao=?";
        
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setInt(1, a.getBrancos());
                ps.setInt(2, a.getNum_eleicao());
                
                    //Se a conexão for realizada vai dropar mais de 1, logo, se true, fucionou.
                    if(ps.executeUpdate()>0){
                        return "ok";
                    }else{
                        return "Não ok";
                    }
                
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }
    
        
    //Cadastro votos(OUT)
    
    //--------------------------------------------------------------------------
    
    //Capturando o resultado (IN)
    
    public int vN(int cod){
        int finalResult=0;
        Eleicao c = new Eleicao();
            try{
                String consulta = "SELECT nulos FROM eleicao WHERE num_eleicao="+cod+"";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            c.setNulos(rs.getInt(1));
                        }
                        finalResult=c.getNulos();
            } catch (SQLException ex){
                ex.getMessage();
            }
        return finalResult;
        
    }
    
    public int vB(int cod){
        int finalResult=0;
        Eleicao c = new Eleicao();
            try{
                String consulta = "SELECT brancos FROM eleicao WHERE num_eleicao="+cod+"";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            c.setBrancos(rs.getInt(1));
                        }
                        finalResult=c.getBrancos();
            } catch (SQLException ex){
                ex.getMessage();
            }
        return finalResult;
        
    }
    
    public int vV(int cod){
        int finalResult=0;
        Eleicao c = new Eleicao();
            try{
                String consulta = "SELECT validos FROM eleicao WHERE num_eleicao="+cod+"";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            c.setValidos(rs.getInt(1));
                        }
                        finalResult=c.getValidos();
            } catch (SQLException ex){
                ex.getMessage();
            }
        return finalResult;
        
    }
    
    //Capturando o resultado (OUT)
    
    //--------------------------------------------------------------------------
    
    //Listagens (IN)
    
    public List<Eleicao> ListarEleicoes(){
        String sql = "SELECT num_eleicao FROM eleicao ORDER BY num_eleicao";
        List<Eleicao> lista = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                if(rs!=null){
                    while(rs.next()){
                        Eleicao a = new Eleicao();
                        a.setNum_eleicao(rs.getInt(1));
                        lista.add(a);
                    }
                    return lista;
                }else{
                    return null;
                }
        }catch(Exception ex){
            return null;
        }
    }
    
    //Listagens (OUT)
        
    //--------------------------------------------------------------------------
    
}
