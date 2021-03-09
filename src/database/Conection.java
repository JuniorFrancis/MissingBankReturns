package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conection {
    
    Connection conn;
    Statement st;

    public boolean conectionDB() {

        try {
            /*"Class.forName": Onde indicamos onde o driver está para conseguirmos
       fazer a ligação Banco de dados -> Netbeans / Netbeans -> Banco de dados*/
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            /*variavel "conn": variavel que usamos para guardar o caminho da
            conexão com o banco de dados*/
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_mailing", "root", "");
            

            /*Variavel "ST": Variavel que usamos para que o "STATEMENT(Permissão
            para alteração no banco)" ative, assim dando disponibilidade para 
            alterações no banco quando usarmos ela*/
            st = conn.createStatement();
            return true;
           
            //Bases CATCH:
            /*1º CATCH:(ClassNotFoundException): Este CATCH será executado caso não 
        consiga executar o "Class.forName()" que é o trecho que indica onde 
        está o driver usado*/
 /*2º CATCH(SQLException):  Será executado caso não consiga se conectar ao banco de
    dados solicitado, caso algum dos 3 (caminho, usuario, senha) esteja errado*/
            //              1ºCatch              2ºCatch
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        public void desconect()
        {

            i


            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        }
        
    }
    

}
