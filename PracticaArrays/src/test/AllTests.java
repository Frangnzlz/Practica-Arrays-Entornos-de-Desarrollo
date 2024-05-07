package test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestMaximaNota.class, TestMedianaNotas.class, TestMediaNotas.class, TestMinimaNota.class })
public class AllTests {

}
