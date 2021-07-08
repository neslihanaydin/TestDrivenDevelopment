import java.util.Date;

public class Virman {

    //sourceAccount : Account -> Vadeli
    //desAccount : Account  -> Vadesiz
    //miktar : Double


    public static void vadeliHesaptanParaAktarma(VadeliHesap sourceAccount, VadesizHesap destAccount, Double miktar){
        Double vadeliHesapBakiye = sourceAccount.balance;
        Date vadeBitisTarihi = Util.addDate((Util.StringToDate(sourceAccount.vadeBaslangicTarihi)), sourceAccount.vadeOran.getGunSayisi());


        if (new Date().compareTo(vadeBitisTarihi) >= 0 && (vadeliHesapBakiye-miktar) >= 0.0) {
            destAccount.balance += miktar;
            sourceAccount.balance -= miktar;
        }
        else if(new Date().compareTo(vadeBitisTarihi) < 0 && (vadeliHesapBakiye-miktar) >= 0.0) {
            destAccount.balance += miktar;
            sourceAccount.balance -= miktar;
            sourceAccount.vadeBozma(VadeOranlari.GUN);
        }

    }
}
