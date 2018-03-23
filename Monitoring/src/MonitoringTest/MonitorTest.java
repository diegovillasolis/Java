package MonitoringTest;

import com.company.Monitor;
import com.company.StringList;

import java.util.ArrayList;

public class MonitorTest {
    public void verifyAdd_AdingElement_Message(){
//        StringList stringList = new StringList();
//        stringList.addString("Hola");
//        stringList.addString("Mundo");
//        stringList.addString("Desde");
//        stringList.addString("Java");
        String element = "Hola";
        StringList stringList = new StringList(new ArrayList<String>(5));
        stringList.addString(element);

        Monitor monitor = new Monitor();
        String result = monitor.verifyAdd();
        if (result.equals("The string " + element + " has been added")){
            System.out.println("The test passed succesfully");
        }
        else{
            System.out.println("The test did not pass succesfully");
        }
    }
}
