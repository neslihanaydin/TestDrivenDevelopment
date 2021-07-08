import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class VadeliHesap extends Account {
    Integer vadeliHesapNo;
    String hesapAcilisTarihi;
    String vadeBaslangicTarihi; // 14 Haziran
    VadeOranlari vadeOran;

    public VadeliHesap(VadeOranlari vadeTuru , Integer accountNumber,Integer vadeliHesapNo, String vadeBaslangicTarihi) {
        super(accountNumber);
        this.balance = 0.0;
        this.vadeliHesapNo = vadeliHesapNo;
        this.vadeOran = vadeTuru;
        this.vadeBaslangicTarihi = vadeBaslangicTarihi;
        this.hesapAcilisTarihi = Util.initializeDate();

    }
    public void vadeBozma(VadeOranlari vadeTuru){
        this.vadeBaslangicTarihi = Util.initializeDate();
        this.vadeOran = vadeTuru;

    }

}
