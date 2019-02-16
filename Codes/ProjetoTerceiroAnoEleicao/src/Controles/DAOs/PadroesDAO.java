
package Controles.DAOs;

import Controles.Conexões.ExecuteSQL;
import Modelos.TextosPadroes.Padroes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PadroesDAO extends ExecuteSQL {

    public static void main(String[] args){
        
    }

    public PadroesDAO(Connection con) {
        super(con);
    }
    
    public String atualizaTpOrganizador(Padroes a) {
        String sql = "UPDATE padroes SET tpOrganizador=? WHERE cod="+1+"";
        
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setString(1, a.getTpOrganizador());
                
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
    
    public String atualizaTpPleito(Padroes a) {
        String sql = "UPDATE padroes SET tpPleito=? WHERE cod="+1+"";
        
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setString(1, a.getTpPleito());
                
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
    
    public List<Padroes> buscarPadroes() {
        String sql = "SELECT tpOrganizador,tpPleito FROM padroes WHERE cod=" + 1 + "";
        List<Padroes> lista = new ArrayList<>();
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                if(rs!=null){
                    while(rs.next()){
                        Padroes a = new Padroes();
                        a.setTpOrganizador(rs.getString(1));
                        a.setTpPleito(rs.getString(2));
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
}
