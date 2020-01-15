import static org.hamcrest.core.Is.*;

import org.junit.Test;

public class fizzbuzztest {

    @Test
    public void test() {
        //fail("Not yet implemented");
        fizzbuzz fb = new fizzbuzz();
        assertThat(fb.out(1), is("1"));
        assertThat(fb.out(3), is("Fizz"));
        assertThat(fb.out(5), is("Buzz"));
        assertThat(fb.out(15), is("FizzBuzz"));
    }

}
