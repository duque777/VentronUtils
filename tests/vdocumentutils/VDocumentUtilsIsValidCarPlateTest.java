package vdocumentutils;

import br.com.Ventron.Utils.VDocumentUtils;
import org.junit.Assert;
import org.junit.Test;

public class VDocumentUtilsIsValidCarPlateTest {

    @Test
    public void isValidCarPlateTest3Letras4Numeros(){
        String placa = "ABC-1234";
        Assert.assertTrue(VDocumentUtils.isValidCarPlate(placa));
    }

    @Test
    public void isValidCarPlateTest3Letras3Numeros(){
        String placa = "ABC-123";
        Assert.assertTrue(VDocumentUtils.isValidCarPlate(placa));
    }

    @Test
    public void isValidCarPlateTest2Letras4Numeros(){
        String placa = "AC-1234";
        Assert.assertTrue(VDocumentUtils.isValidCarPlate(placa));
    }

    @Test
    public void isValidCarPlateTest4Letras3Numeros(){
        String placa = "ABCD-123";
        Assert.assertTrue(VDocumentUtils.isValidCarPlate(placa));
    }

    @Test
    public void isValidCarPlateTestInvalidaCaracter(){
        String placa = "AC2-1234";
        Assert.assertFalse(VDocumentUtils.isValidCarPlate(placa));
    }

    @Test
    public void isValidCarPlateTestInvalidaNulo(){
        String placa = null;
        Assert.assertFalse(VDocumentUtils.isValidCarPlate(placa));
    }

    @Test
    public void isValidCarPlateTestInvalidaEspacoEmBranco(){
        String placa = "       ";
        Assert.assertFalse(VDocumentUtils.isValidCarPlate(placa));
    }

}
