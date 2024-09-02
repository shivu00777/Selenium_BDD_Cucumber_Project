package file_Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
features= {"src/test/resources/Features"},

glue= {"code_Steps"},

plugin= {"pretty","html:target/htmlreport.html",})



public class runnerFile extends AbstractTestNGCucumberTests {

	
    
}
