package com.clouway;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class MyClassTest {

    @Test
    public void helloWorldTest() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        MyClass.print(new PrintStream(out));
        String s = out.toString();
        Assert.assertEquals("Hello, World!\n", s);
    }

}
