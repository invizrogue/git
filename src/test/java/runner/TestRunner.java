package runner;

import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    static TestNG testNg;

    public static void main(String[] args) {

        testNg = new TestNG();

        String pathTestNgXml = System.getProperty("user.dir") + "\\testng.xml";
        List<String> xmlList = new ArrayList<String>();
        xmlList.add(pathTestNgXml);

        testNg.setTestSuites(xmlList);
        testNg.run();
    }
}
