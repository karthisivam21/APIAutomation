package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class apiListeners implements ITestListener{
	
	  private static final Logger logger = LogManager.getLogger(apiListeners.class);
	  public void onTestStart(ITestResult result) {
		    logger.info("Test Start:" +result.getMethod().getMethodName());
		    logger.info("Test Start Description:" +result.getMethod().getMethodName());		
		    }


	  public void onTestSuccess(ITestResult result) {
		    logger.info("Test Success:" +result.getMethod().getMethodName());
		    logger.info("Test Success Description:" +result.getMethod().getMethodName());		
		    }


	  public void onTestFailure(ITestResult result) {
		    logger.info("Test Failed:" +result.getMethod().getMethodName());
		    logger.info("Test Failed Description:" +result.getMethod().getMethodName());

		  }


	  public void onTestSkipped(ITestResult result) {
		    logger.info("Test Skipped:" +result.getMethod().getMethodName());
		    logger.info("Test Skipped Description:" +result.getMethod().getMethodName());
		  }

	
	  public void onStart(ITestContext context) {
		    logger.info("Test Started");
		  }

	
	  public void onFinish(ITestContext context) {
		    logger.info("Test completed");
		  }
}
