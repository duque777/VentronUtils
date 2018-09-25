package vdateutils;

import br.com.Ventron.Utils.VDateUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class VDateUtilsNewDateTest {

    @Test
    public void testarDiaNovaData(){
        Calendar c = Calendar.getInstance();
        Assert.assertTrue(c.getTime().getDay() == VDateUtils.newDate().getDay());
    }

    @Test
    public void testarMesNovaData(){
        Calendar c = Calendar.getInstance();
        Assert.assertTrue(c.getTime().getMonth() == VDateUtils.newDate().getMonth());
    }

    @Test
    public void testarAnoNovaData(){
        Calendar c = Calendar.getInstance();
        Assert.assertTrue(c.getTime().getYear() == VDateUtils.newDate().getYear());
    }

    @Test
    public void testarMinutoNovaData(){
        Calendar c = Calendar.getInstance();
        Assert.assertTrue(c.getTime().getMinutes() == VDateUtils.newDate().getMinutes());
    }

    @Test
    public void testarHoraNovaData(){
        Calendar c = Calendar.getInstance();
        Assert.assertTrue(c.getTime().getHours() == VDateUtils.newDate().getHours());
    }

    @Test
    public void testarNovaDataErrada(){
        Calendar c = Calendar.getInstance();
        Assert.assertFalse(c.getTime().equals(VDateUtils.newDate()));
    }

}


