import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParaCekmeTest {
    Integer accountNumberTest;
    Double miktar;
    Double miktarN; //miktarNegatif
    Double miktarB; //miktarBuyuk
    Double beklenenDeger;
    ParaCekme transaction;
    Account account;
    HesabaParaYatirma paraYatirma;

    @Before
    public void setUp() throws Exception {
        accountNumberTest = 12345;
        miktar = 10.0;
        miktarN = -10.0;
        miktarB = 20.0;
        beklenenDeger = 0.0;
        transaction = new ParaCekme();
        account = new Account(accountNumberTest);
        paraYatirma = new HesabaParaYatirma();
        paraYatirma.kendiHesabinaParaYatirma(account,10.0);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void paraCekme() { //Success
        transaction.paraCekme(account,miktar);
        assertEquals(beklenenDeger,account.balance);
    }
    @Test
    public void paraCekmeEksiDeger() { // Failed, Eksi deger
        transaction.paraCekme(account,miktarN);
        assertEquals(beklenenDeger,account.balance);
    }
    @Test
    public void paraCekmeOlmayanPara() { //Failed, Bakiye'den fazla para cekme
        transaction.paraCekme(account,miktarB);
        assertEquals(beklenenDeger,account.balance);
    }
}