package mvp.arit.com.mvvm;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DecimalUtil {
    public static String getValue(BigDecimal value){
        DecimalFormat formater = new DecimalFormat("#,###,###,00");
        return String.valueOf(formater.format(value));
    }
}
