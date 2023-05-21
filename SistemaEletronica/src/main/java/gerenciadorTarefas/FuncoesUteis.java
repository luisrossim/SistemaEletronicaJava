package gerenciadorTarefas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FuncoesUteis {
    public static Date strToDate( String strDt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("dd/MM/yyyy");
        dtForm.setLenient(false);
        return dtForm.parse(strDt);
    }
}
