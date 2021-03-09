package database;

import java.sql.SQLException;


public class Commands {
    String comando;

    //Classe para execução do comando.
    public boolean Select(Conection conectionDB)
    {

        try {
           comando = "select * from crm_mailing.tb_arq_retorno " +
                   "where CD_CONVENIO_SEQ = 288 " +
                   "and DT_PROCESSAMENTO >= '2020-02-01' " +
                   "order by DT_RETORNO_BANCO desc";

           conectionDB.st.execute(comando);
           return true;
       } catch (SQLException ex) {
           return false;
       } finally {
            conectionDB.st.desconect();
        }

       }

}
