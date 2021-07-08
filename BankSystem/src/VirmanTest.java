import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VirmanTest {


    VadeliHesap vadeliHesap;
    VadesizHesap vadesizHesap;
    ParaCekme paraCekme;
    HesabaParaYatirma paraYatirma;
    Double miktar;
    Integer accountNumber;
    Integer vadeliHesapNumarasiTest;
    Virman virman;


    @Before
    public void setUp() throws Exception {

        vadeliHesapNumarasiTest = 12345;
        accountNumber = 11111;
        miktar = 100.0;
        String hesapAcilisTarihi = Util.initializeDate();
        vadeliHesap = new VadeliHesap(VadeOranlari.GUN, accountNumber, vadeliHesapNumarasiTest, hesapAcilisTarihi );
        vadesizHesap = new VadesizHesap(accountNumber);
        paraCekme = new ParaCekme();
        paraYatirma = new HesabaParaYatirma();
        virman = new Virman();
        paraYatirma.kendiHesabinaParaYatirma(vadesizHesap, miktar);
        paraYatirma.vadeliHesabinaParaYatirma(vadeliHesap,vadesizHesap,10.0);

    }

    @Test
    public void vadeliHesaptanParaAktarma() {
        virman.vadeliHesaptanParaAktarma(vadeliHesap,vadesizHesap,10.0);

        Double[] beklenenBalances = {0.0,100.0};
        Double[] anlikBalances = {vadeliHesap.balance, vadesizHesap.balance};
        assertArrayEquals(beklenenBalances, anlikBalances);
    }
}