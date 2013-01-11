package tests;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collection;
public class FirstTest {

@Test
public void testEmptyCollection() {
Collection collection = new ArrayList();
assertTrue(collection.isEmpty());
}
@Test
public void testTrue() {
assertTrue(true);
}
@Test
public void testFalse() {
assertFalse(true);
}
public static void main(String[] args) {
org.junit.runner.JUnitCore.main("tests.FirstTest");
}
}