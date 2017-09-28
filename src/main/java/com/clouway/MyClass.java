package com.clouway;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.PrintStream;
import java.sql.SQLException;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class MyClass {

    private static final Logger log = Logger.getLogger(MyClass.class.getName());

    public static void main(String[] args) throws IOException, SQLException {
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");

        print(System.out);
        System.out.println("And...Good bye!");
    }

    public static void print(PrintStream out) {
        out.println("Hello, World!");
    }

}
