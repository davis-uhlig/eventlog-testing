import com.theironyard.davisUhlig.Event;
import com.theironyard.davisUhlig.EventLog;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by duhlig on 7/27/17.
 */
public class EventLogTest {
    @Test
    public void addEventSuccess(){
        Event firstEvent = new Event();
        EventLog eventLog = new EventLog();

        firstEvent.setName("Davis");
        firstEvent.setAction("Face2Face");
        boolean addEventTest = eventLog.addEvent(firstEvent);

        assertEquals("should return true", addEventTest, true);
        assertEquals("number of events should be 1", eventLog.getNumEvents(), 1);
    }

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void illegalArgumentExceptionTest(){
        expected.expect(IllegalArgumentException.class);
        Event emptyEvent = new Event();
        EventLog failingEventLog = new EventLog();

        failingEventLog.addEvent(emptyEvent);

    }
}
