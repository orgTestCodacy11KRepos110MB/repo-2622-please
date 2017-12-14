package build.please.external_test;

import build.please.test.TestCoverage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExternalTest {
  // An "external" test, i.e. a test that is not in the same package as the thing it accesses.

  @Test
  public void testDeriveOriginalFilename() {
    assertEquals("src/build/java/build/please/test/TestCoverage",
                 TestCoverage.deriveOriginalFilename("src/build/java/build/please/test",
                                                     "build/please/test/TestCoverage"));
  }
}
