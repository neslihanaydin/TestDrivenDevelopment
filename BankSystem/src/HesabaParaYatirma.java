
public class HesabaParaYatirma {

    //Account account
    //Double miktar

    public void kendiHesabinaParaYatirma( Account account, Double miktar){
        try{
            account.balance += miktar;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void vadeliHesabinaParaYatirma(VadeliHesap vadeliHesap, VadesizHesap vadesizHesap, Double miktar){
        try {
            if (vadesizHesap.balance - miktar >= 0){
                vadeliHesap.balance += miktar;
                vadesizHesap.balance -= miktar;
                vadeliHesap.vadeBozma(VadeOranlari.GUN);
            }

        }catch (Exception e){
            e.printStackTrace();

        }
    }

}
