
package Controles.Conexões;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {
    
    public static Connection abrirConexao(){
        //Objeto de conexao
        Connection con = null;

        try {
            //Define o driver de conexão com banco
            Class.forName("com.mysql.jdbc.Driver");
            
            //local de conexão do banco
            String url = "jdbc:mysql://localhost/projetoeleicao";
            
            //chama um objeto gerenciador de conexões passando o local, usuario e senha para se conectar
            con = DriverManager.getConnection(url, "root", "");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de conexão com o Banco de Dados", 
                    "Tores Pet Shop", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
        return con;
    }
    
    public static void fecharConexao(Connection con){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        
    }
    
}
