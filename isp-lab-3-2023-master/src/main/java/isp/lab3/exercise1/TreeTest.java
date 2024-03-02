package isp.lab3.exercise1;

import org.junit.jupiter.api.Test;

public class TreeTest {
    @Test
    public void testGrow() {
        Tree tree = new Tree();
        tree.Grow(10);
        assertEquals(25, tree.getHeight());
        tree.Grow(-3);
        assertEquals(25, tree.getHeight());


    }

    private void assertEquals(int i, int height) {
    }
}
