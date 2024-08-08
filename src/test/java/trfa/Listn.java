package trfa;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listn implements ITestListener  {

  public void onTestStart(ITestResult result) {
      System.out.println("Test started: " + result.getMethod().getMethodName());
  }

  @Override
  public void onTestSuccess(ITestResult result) {
      System.out.println("Test passed: " + result.getMethod().getMethodName());
  }

  @Override
  public void onTestFailure(ITestResult result) {
      System.out.println("Test failed: " + result.getMethod().getMethodName());
  }

  @Override
  public void onTestSkipped(ITestResult result) {
      System.out.println("Test skipped: " + result.getMethod().getMethodName());
  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
      // Not commonly used, but can be implemented if needed
  }

  @Override
  public void onStart(ITestContext context) {
      System.out.println("Test suite started: " + context.getName());
  }

  @Override
  public void onFinish(ITestContext context) {
      System.out.println("Test suite finished: " + context.getName());
  }
}