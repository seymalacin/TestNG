package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day20_SoftAssertion {

    @Test
    public void softAssertTest() {

        // 1. softAssertTest objesını olustur
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Satır 14");

        softAssert.assertEquals(2, 5);//fail 2 5 e esitmı
        System.out.println("Satır 16");

        softAssert.assertTrue("JAVA".contains("U"));//FALSE
        System.out.println("Satır 18");

        softAssert.assertTrue(true);//pass
        System.out.println("Satır 20");

        softAssert.assertAll();//pass yada faıl olarak assertionları isaretler bunu koymamız sart

    }
}
