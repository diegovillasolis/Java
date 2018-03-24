package MonitoringTest;

import com.company.Monitor;
import com.company.DataSource;

import java.util.ArrayList;
import java.util.Arrays;

public class MonitorTest {
    public void verifyAdd_AddingElement_Message() throws InterruptedException {
        String element = "From";
        String element1 = "Java";
        DataSource dataSource = new DataSource(new ArrayList<String>(Arrays.asList("Hello", "World", "From", "Java")));
        Monitor monitor = new Monitor();

        monitor.setDataSource(dataSource);
        dataSource.add(element);
        dataSource.add(element1);
        String result = monitor.verifyAdd();
        if (result.equals("The string(s) " + element + " " + element1 + " has/have been added")){
            System.out.println(result);
            System.out.println("The test passed successfully");
        }
        else{
            System.out.println(result);
            System.out.println("The test did not pass successfully");
        }
    }
}
