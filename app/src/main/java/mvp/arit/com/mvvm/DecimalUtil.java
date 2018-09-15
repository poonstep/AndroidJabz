package mvp.arit.com.mvvm;

import android.databinding.InverseMethod;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DecimalUtil {

    @InverseMethod("convertToString")
    public static BigDecimal stringToDecimal(String value){
        if(!value.isEmpty()) {
            return new BigDecimal(value.replaceAll(",",""));
        }else{
            return BigDecimal.valueOf(0);
        }
    }

    public static String convertToString(BigDecimal value){
        DecimalFormat formatter = new DecimalFormat("#,###,###,00");
        return String.valueOf(formatter.format(value));
    }
}
