
package Controles.DAOs;

import Controles.Conexões.ExecuteSQL;
import Modelos.Administrador.Administrador;
import java.sql.*;
import java.util.*;

public class AdminDAO extends ExecuteSQL {

    public static void main(String[] args) {
        System.out.println("AdminDAO ok");
    }

    public AdminDAO(Connection con) {
        super(con);
    }

    //--------------------------------------------------------------------------
    
    //Alterar senha admin(IN)

    public String atualizarSenha(Administrador a) {
        String sql = "UPDATE administrador SET senha=? WHERE cod_admin="+1+"";
        
        try {
            //Organia a string sql para inserir no banco de dados
            PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setString(1, a.getSenha());
                
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
    
    //Alterar senha admin(OUT)

    //--------------------------------------------------------------------------
    
    
    
    //--------------------------------------------------------------------------
    
    //Selecionar senha (IN)
    
    public boolean VerificarSenha(String cod){
        boolean Resultado = false;
        try{
            String sql = "SELECT * FROM administrador WHERE senha = " + cod + " ";
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
    
    //Selecionar senha (OUT)

    //--------------------------------------------------------------------------
}
