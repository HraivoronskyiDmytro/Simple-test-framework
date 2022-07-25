package framework;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;


public abstract class TestListener extends BaseTest implements ITestListener {

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    /**
     * Text attachments for Allure Report
     */
    @Attachment(value = "{message}", type = "text/plain")
    private static String saveTextLog(String message) {
        return message;
    }

    /**
     * Screen attachments for Allure Report
     */
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG() {
        return ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
    }

    /**
     * Add text log and screenshot
     * ON FAILURE
     */
    @Override
    public void onTestFailure(ITestResult iTestResult) {
        saveScreenshotPNG();
        String textLog = getTestMethodName(iTestResult) + " is FAILED and screenshot taken!";
        saveTextLog(textLog);
    }

}
