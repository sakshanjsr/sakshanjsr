package resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporting {
	
	static ExtentReports extent;
	
	public static ExtentReports report() {
		String reportPath = System.getProperty("user.dir")+"\\Reports\\Report.html";
		ExtentHtmlReporter report = new ExtentHtmlReporter(reportPath);
		report.config().setReportName("Saket Automated Suite");
		report.config().setDocumentTitle("Report");
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Sreelekha");
		
		return extent;
	}

}
