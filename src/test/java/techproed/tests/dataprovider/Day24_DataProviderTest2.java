package techproed.tests.dataprovider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Day24_DataProviderTest2 {
    //    DATA PRIVIDER METOTU
    @DataProvider
    public Object[][] customerData(){
        Object[][] musteriBilgileri = {
                {"sam.walker@bluerentalcars.com", "c!fas_art"},
                {"kate.brown@bluerentalcars.com", "tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^" },
                {"pam.raymond@bluerentalcars.com", "Nga^g6!"}
        };
        return musteriBilgileri;
    }
    //    TEST
    @Test(dataProvider = "customerData")
    public void dataProviderTest(String email, String password){
        System.out.println("EMAIL : "+email+" | SIFRE : "+password);
    }
    //    BU 4 CUSTOMER DATALARI ILE LOGIN TESTI YAPALIM
    @Test
    public void dataProviderLoginTest(){
    }
}
