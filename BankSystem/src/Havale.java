public class Havale {

    private static Double sourceAccountBalance;
    private static Double destAccountBalance;
    //SourceAccount  : Account
    //DestAccount : Account
    //Miktar : Double


    public static void havale(Account sourceAccount, Account destAccount, Double miktar){
        try {
            sourceAccountBalance = sourceAccount.balance;
            destAccountBalance = destAccount.balance;
            sourceAccount.balance -=miktar;
            destAccount.balance +=miktar;

        }catch (Exception e){
            System.err.println("Havale işlemi sırasında beklenmedik bir hata oluştu");
            havaleDurdur(sourceAccount,destAccount,sourceAccountBalance,destAccountBalance);
        }

    }

    private static void havaleDurdur(Account sourceAccount, Account destAccount, Double sourceAccountBalance, Double destAccountBalance){
        sourceAccount.balance = sourceAccountBalance;
        destAccount.balance = destAccountBalance;
    }
}
