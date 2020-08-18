package test03;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import main03.Main03;

public class Test03 {

	@Test
    public void testGetColor1() {
		Main03 c1 = new Main03();
        String t1 = c1.getColor(1);
        assertThat(t1,is("赤"));
    }
    @Test
    public void testGetColor2() {
    	Main03 c1 = new Main03();
        String t1 = c1.getColor(2);
        assertThat(t1,is("青"));
    }
    @Test
    public void testGetColor3() {
    	Main03 c1 = new Main03();
        String t1 = c1.getColor(3);
        assertThat(t1,is("1or2を入力してください"));
    }
}
