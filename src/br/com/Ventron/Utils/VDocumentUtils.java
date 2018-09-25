package br.com.Ventron.Utils;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class VDocumentUtils {

    /**
     * Método usado para validar se a placa brasileira de um veículo é valida.
     * @param carPlate Placa do carro
     * @return True, se a placa for válida. Falso, caso a placa não seja válida
     */
    public static boolean isValidCarPlate(String carPlate){
        carPlate = StringUtils.trimWhitespace(carPlate);
        if(carPlate == null || carPlate.length() < 6 || carPlate.length() > 7)
            return false;

        carPlate = carPlate.replaceAll("-","");
        List<String> patternsCarPlate = new ArrayList<>();
        patternsCarPlate.add("[a-zA-Z]{3}[0-9]{4}");
        patternsCarPlate.add("[a-zA-Z]{3}[0-9]{3}");
        patternsCarPlate.add("[a-zA-Z]{2}[0-9]{4}");
        patternsCarPlate.add("[a-zA-Z]{4}[0-9]{3}");
        for (String pattern: patternsCarPlate) {
            if(carPlate.matches(pattern))
                return true;
        }
        return false;
    }

}
