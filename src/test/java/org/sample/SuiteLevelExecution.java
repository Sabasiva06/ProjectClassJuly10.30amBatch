package org.sample;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SampleBrowserLaunch.class, SampleBrowserLaunch2.class, SampleBrowserLaunch3.class,
		SampleBrowserLaunch4.class })
// suite--> collection of class
public class SuiteLevelExecution {

	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(SuiteLevelExecution.class);

		int runCount = runClasses.getRunCount();
		System.out.println("Total Method Executing Count :" + runCount);

		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println("Total Method Ignored :" + ignoreCount);

		int failureCount = runClasses.getFailureCount();
		System.out.println("Total Failure COunt :" + failureCount);

		List<Failure> failures = runClasses.getFailures();
		for (int i = 0; i < failures.size(); i++) {
			String string = failures.get(i).toString();
			System.out.println("Failure Methods Name :" + string);
		}

	}

}
