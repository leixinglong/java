import com.sun.xml.internal.ws.api.server.InstanceResolverAnnotation;
import com.zte.dom4j.JunitTest;
import org.junit.Assert;

public class Test {

    @org.junit.Test
    public void testAdd(){
        Assert.assertEquals(2, new JunitTest().add(1, 1));
    }

    @org.junit.Test
    public void testDivi(){
        Assert.assertEquals(1,new JunitTest().divi(1, 1));
    }
}
