package techproed.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStarts-Tum testlerden önce tek bir kere çalişır : "+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish-Tum testlerden sonra tek bir kere çalişır :"+context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart-Her bir @Testden önce tek bir kez çalısır :"+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess-Sadece PASS olan testlerden SONRA tek bir kez çalışır :"+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure-Sadece DAIL olan testlerden SONRA tek bir kez çagirilir :"+result.getName());
        try {
            ReusableMethods.getScreenshot("Test-Case-FAIL :"+result.getName());//bir methot fail ettinde otomatik olarak ekran goruntusunu al
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped -Sadece SKIP(ATLANAN) testlerden SONRA tek bır kez calısır :"+result.getName());
    }
}
