
package Controles.DAOs;

import Controles.Conexões.ExecuteSQL;
import Modelos.Candidato.Candidato;
import Modelos.Eleição.Eleicao;
import java.sql.*;
import java.util.*;

public class CandidatoDAO extends ExecuteSQL {

    public static void main(String[] args) {
        System.out.println("CandidatoDAO ok");
    }

    public CandidatoDAO(Connection con) {
        super(con);
    }
        
    //--------------------------------------------------------------------------
    
    //Cadastro (IN)
    
    public int verificarCod(String numEleicao){
        int finalResult=0;
        Candidato c = new Candidato();
            try{
                String consulta = "SELECT cod_candidato FROM candidato WHERE num_eleicao="+numEleicao+"";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            c.setCod_candidato(rs.getInt(1));
                        }
                        finalResult=c.getCod_candidato()+1;   
            } catch (SQLException ex){
                ex.getMessage();
            }
        return finalResult;
        
    }
    
    public String inserirCandidato(Candidato a){
        //String para insersão de dados(dado de alunos)
        String sql = "INSERT INTO candidato VALUES (?,?,?,?,?)";
        
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setInt(1, a.getCod_candidato());
                ps.setString(2, a.getNome());
                ps.setString(3, a.getFoto());
                ps.setInt(4, a.getVotos());
                ps.setInt(5, a.getNum_eleicao());
                
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
    
    public int verificarCandidatos() {
        int rest = 0;
        String sql = "SELECT MAX(cod_candidato) FROM candidato";
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                if(rs!=null){
                    while(rs.next()){
                        Candidato a = new Candidato();
                        a.setCod_candidato(rs.getInt(1));
                        rest = a.getCod_candidato();
                        return rest;
                    }
                }
                
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return rest;
    }
    
    //Cadastro (OUT)
    
    //--------------------------------------------------------------------------
    
    //Deletar Conteúdo (IN)
    
    public void deletarDados(){
            try{
                String consulta = "DELETE FROM candidato";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                int rs = ps.executeUpdate(consulta);
            } catch (SQLException ex){
                ex.getMessage();
            }
    }
    
    //Deletar Conteúdo(OUT)
 
    //--------------------------------------------------------------------------
    
    //Atualizar (IN)
    
    public String atualizarCandidato(Candidato a) {
        String sql = "UPDATE candidato SET nome=?, foto=? WHERE cod_candidato=?";
        
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setString(1, a.getNome());
                ps.setString(2, a.getFoto());
                ps.setInt(3, a.getCod_candidato());
                
                
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

    public List<Candidato> buscarCandidato(int codP) {
        String sql = "SELECT * FROM candidato WHERE cod_candidato=" + codP + "";
        List<Candidato> lista = new ArrayList<>();
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                if(rs!=null){
                    while(rs.next()){
                        Candidato a = new Candidato();
                        a.setCod_candidato(rs.getInt(1));
                        a.setNome(rs.getString(2));
                        a.setFoto(rs.getString(3));
                        lista.add(a);
                    }
                    return lista;
                }else{
                    return null;
                }
                
        } catch (SQLException ex) {
            return null;
        }

    }
    
    public boolean TestarCandidato(int cod){
        boolean Resultado = false;
        try{
            String sql = "SELECT * FROM candidato WHERE cod_candidato = " + cod + " ";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
                if(rs!=null){
                    while(rs.next()){
                        Resultado = true;   
                    }
                }
        }catch(Exception ex){
            ex.getMessage();
        }
        return Resultado;
    }
    
    public String deletarCandidatos(Candidato a){
            String sql = "DELETE FROM candidato WHERE cod_candidato=?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getCod_candidato());
            
                if(ps.executeUpdate()>0){
                    return "ok";
                }else{
                    return "nop";
                }
                
        }catch(Exception ex){
            return ex.getMessage();
        }
    }
    
    //Atualizar (OUT)
    
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
    
    //Votação (IN)
    
    public int SelecionarCodCandidato(int cod){
        int finalResult=0;
        Candidato c = new Candidato();
            try{
                String consulta = "SELECT cod_candidato FROM candidato WHERE cod_candidato="+cod+"";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            c.setCod_candidato(rs.getInt(1));
                        }
                        finalResult=c.getCod_candidato();
            } catch (SQLException ex){
                ex.getMessage();
            }
        return finalResult;
        
    }
    
    public int verificarVotos(int cod){
        int finalResult=0;
        Candidato c = new Candidato();
            try{
                String consulta = "SELECT votos FROM candidato WHERE cod_candidato="+cod+"";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            c.setVotos(rs.getInt(1));
                        }
                        finalResult=c.getVotos()+1;
            } catch (SQLException ex){
                ex.getMessage();
            }
        return finalResult;
        
    }
    
    public String votar(Candidato a){
        //String para insersão de dados(dado de eleicao)
        String sql = "UPDATE candidato SET votos=? WHERE cod_candidato=?";
        
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setInt(1, a.getVotos());
                ps.setInt(2, a.getCod_candidato());
                
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

    public int verificarValidos(int cod){
        int finalResult=0;
        Eleicao c = new Eleicao();
            try{
                String consulta = "SELECT validos FROM eleicao WHERE num_eleicao="+cod+"";
                PreparedStatement ps = getCon().prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                            c.setValidos(rs.getInt(1));
                        }
                        finalResult=c.getValidos()+1;
            } catch (SQLException ex){
                ex.getMessage();
            }
        return finalResult;
        
    }
    
    public String addValido(Eleicao a){
        //String para insersão de dados(dado de eleicao)
        String sql = "UPDATE eleicao SET validos=? WHERE num_eleicao=?";
        
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setInt(1, a.getValidos());
                ps.setInt(2, a.getNum_eleicao());
                
                    //Se a conexão for realizada vai dropar mais de 1, logo, se true, fucionou.
                    if(ps.executeUpdate()>0){
                        return "Sim";
                    }else{
                        return "Não";
                    }
                
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }    
    
    //Votação (OUT)
    
    
    //--------------------------------------------------------------------------
    
    //Listar Candidatos (IN)

    public boolean TestarNumEleicao(int cod){
        boolean Resultado = false;
        try{
            String sql = "SELECT * FROM candidato WHERE num_eleicao = " + cod + " ";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
                if(rs!=null){
                    while(rs.next()){
                        Resultado = true;   
                    }
                }
        }catch(Exception ex){
            ex.getMessage();
        }
        return Resultado;
    }
    
    public boolean TestarCod(int numEleicao, int cod){
        boolean Resultado = false;
        try{
            String sql = "SELECT cod_candidato FROM candidato WHERE num_eleicao = " + numEleicao + " AND cod_candidato="+cod+" ";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
                if(rs!=null){
                    while(rs.next()){
                        Resultado = true;   
                    }
                }
        }catch(Exception ex){
            ex.getMessage();
        }
        return Resultado;
    }
    
    public List<Candidato> listarCandidatos(int numEleicao){
        String sql = "SELECT cod_candidato,nome,votos FROM candidato WHERE num_eleicao ="+numEleicao+" ORDER BY votos DESC";
        List<Candidato> Lista = new ArrayList<>();
        
        try {
            //prepara a String sql para ser executada
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            //Recebe o resultado da consulta sql
            ResultSet rs = ps.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Candidato d = new Candidato();
                    d.setCod_candidato(rs.getInt(1));
                    d.setNome(rs.getString(2));
                    d.setVotos(rs.getInt(3));
                    
                    Lista.add(d);
                }
                return Lista;
            }else{
                return null;
            }
            
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public List<Candidato> ListarEleicoes(){
        String sql = "SELECT num_eleicao FROM candidato ORDER BY cod_candidato";
        List<Candidato> lista = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                if(rs!=null){
                    while(rs.next()){
                        Candidato a = new Candidato();
                        a.setNome(rs.getString(1));
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
    
    public List<Candidato> ListarComboCandidato(int resp){
        String sql = "SELECT nome FROM candidato WHERE num_eleicao="+resp+"";
        List<Candidato> lista = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                if(rs!=null){
                    while(rs.next()){
                        Candidato a = new Candidato();
                        a.setNome(rs.getString(1));
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
    
    //Listar Candidatos (OUT)
    
    //--------------------------------------------------------------------------

    public int ConsultarCodCandidato(String nome){
        int cod = 0 ;
        String sql = "SELECT cod_candidato FROM candidato WHERE nome = '" + nome + "'";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
                if(rs!=null){
                    while(rs.next()){
                        Candidato a = new Candidato();
                        a.setCod_candidato(rs.getInt(1));
                        cod=a.getCod_candidato();
                    }
                    return cod;
                }else{
                    return 0;
                }
        }catch(Exception ex){
            return 0;
        }
    }
    
    public boolean verificarConteudo(int numEleicao){
        boolean Resultado = false;
        try{
            String sql = "SELECT * FROM candidato WHERE num_eleicao = " + numEleicao + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
                if(rs!=null){
                    while(rs.next()){
                        Resultado = true;   
                    }
                }
        }catch(Exception ex){
            ex.getMessage();
        }
        return Resultado;
    }
    
}
