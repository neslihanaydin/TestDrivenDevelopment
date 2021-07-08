import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HesabaParaYatirmaTest {
    Integer accountNumberTest;
    Double miktar;
    Double miktarN;
    Double beklenenDeger;
    HesabaParaYatirma transaction;
    Account account;
    @Before
    public void setUp() {
        accountNumberTest = 12345;
        miktar = 10.0;
        miktarN = -10.0;
        beklenenDeger = 10.0;
        transaction = new HesabaParaYatirma();
        account = new Account(accountNumberTest);
    }


    @Test
    public void kendiHesabinaParaYatirma() {  //Success
        transaction.kendiHesabinaParaYatirma(account,miktar);
        assertEquals(beklenenDeger,account.balance);
    }
    @Test
    public void kendiHesabinaParaYatirmaEksiDeger() { //Failed, eksi deger yatirilamaz
        transaction.kendiHesabinaParaYatirma(account,miktarN);
        assertEquals(beklenenDeger,account.balance);

    }

}