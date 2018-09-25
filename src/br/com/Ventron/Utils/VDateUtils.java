package br.com.Ventron.Utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Classe de utilitários, usada para manipulação de datas
 */
public class VDateUtils {


    /**
     * Método usado para instanciar uma data atual.
     * @return Data Atual
     */
    public static Date newDate(){
        Calendar c = Calendar.getInstance();
        return c.getTime();
    }

}
