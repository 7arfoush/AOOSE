/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.util.List;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author holo7
 */
public class TestDriver {
    
    public static void main(String[] args) throws Exception {

        Result result = JUnitCore.runClasses(TestCases.class);

        List<Failure> failures = result.getFailures();

        for (int i = 0; i < failures.size(); i++) {
            System.out.println(failures.get(i).toString());
        }

        if (result.wasSuccessful())
        {
            System.out.println("All test cases have passed successfully.");
        }
        else {
            System.out.println(result.getFailureCount() + " out of " + result.getRunCount() + " test cases have failed");
        }
    }
    
}
