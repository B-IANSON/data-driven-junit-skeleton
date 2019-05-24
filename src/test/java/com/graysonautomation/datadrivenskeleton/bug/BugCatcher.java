package com.graysonautomation.datadrivenskeleton.bug;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class BugCatcher implements MethodRule {

	public Statement apply(final Statement statement, final FrameworkMethod frameworkMethod, final Object o) {
		return new Statement() {

			@Override
			public void evaluate() throws Throwable {

				try {
					statement.evaluate();
				}

				// Catch JUnit assertion failure
				catch (AssertionError e) {

					// Do stuff like grab a screenshot
					System.err.println("Caught the bug!");

					// Re-throw failure back up to JUnit
					throw e;
				}
			}
		};
	}
}
