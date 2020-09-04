package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import classroom.Taller2;

import java.io.*;

public class TestCoincidencia {

   @Test
   public void testMain()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Taller2.main(null);
     
     String texto= "Sin nombre 10122 882 50 0 1 ";
     
     // assertion
     assertEquals(texto, bos.toString().replaceAll("(?:\\\\[rn]|[\\r\\n]+)+", " "));

     // undo the binding in System
     System.setOut(originalOut);
   }
}
