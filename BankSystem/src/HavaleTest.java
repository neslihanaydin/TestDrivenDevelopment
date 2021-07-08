import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HavaleTest {
    Account sourceAccountTest;
    Account destAccountTest;
    Double sourceAccountBalance; //100
    Double aktarilacakMiktar; //10
    Double beklenenSourceAccountBalance; //90
    Double beklenenDestAccountBalance; //10
    Integer sourceAccountNumberTest; //11111
    Integer destAccountNumberTest; //22222
    Havale transaction;

    @Before
    public void setUp() throws Exception {
        sourceAccountNumberTest = 11111;
        destAccountNumberTest = 22222;
        sourceAccountTest = new Account(sourceAccountNumberTest);
        destAccountTest = new Account(destAccountNumberTest);
        sourceAccountBalance = 100.0;
        sourceAccountTest.balance = sourceAccountBalance;
        aktarilacakMiktar = 10.0;
        beklenenSourceAccountBalance = 90.0;
        beklenenDestAccountBalance = 10.0;
        transaction = new Havale();
    }

    @Test
    public void havale() {  //success
        transaction.havale(sourceAccountTest,destAccountTest,aktarilacakMiktar);
        Double[] beklenenBalances = {beklenenSourceAccountBalance,beklenenDestAccountBalance};
        Double[] anlikBalances = {sourceAccountTest.balance,destAccountTest.balance};
        assertArrayEquals(beklenenBalances,anlikBalances);
    }


    @Test
    public void havaleYetersizBakiye() {  //Failed , sourceAccount'ta yeterli para yok
        transaction.havale(sourceAccountTest,destAccountTest,aktarilacakMiktar);
        Double tempBakiye = sourceAccountTest.balance - aktarilacakMiktar;
        assertTrue(tempBakiye >= 0 );
    }

}