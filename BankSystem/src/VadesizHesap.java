import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class VadesizHesap extends Account {
    public String hesapAcilisTarihi;

    public VadesizHesap(Integer accountNumber) {
        super(accountNumber);
        this.hesapAcilisTarihi = Util.initializeDate();
    }

}
