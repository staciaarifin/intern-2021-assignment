package com.intern.demo;


import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class CapitalizationTest {

    @Test
    public void convertToMapTest() {
        //TODO COMPLETE THIS
        ImportedBook importedBook1 = new ImportedBook("joHN dOE", "IMPORTED book 1", "joHN dOE");
        ImportedBook importedBook2 = new ImportedBook("joHN dOE", "IMPORTED book 2", "joHN dOE");
        ImportedBook importedBook3 = new ImportedBook("joHN dOE", "IMPORTED book 3", "joHN dOE");
        ImportedBook importedBook4 = new ImportedBook("joHN dOE", "IMPORTED book 4", "joHN dOE");

        LocalBook localBook1 = new LocalBook("jaNE stARk", "loCal bOok 1", "gramEDia");
        LocalBook localBook2 = new LocalBook("jaNE stARk", "loCal bOok 2", "gramEDia");
        LocalBook localBook3 = new LocalBook("jaNE stARk", "loCal bOok 3", "gramEDia");
        LocalBook localBook4 = new LocalBook("jaNE stARk", "loCal bOok 4", "gramEDia");

        List<Book> inputs = Arrays.asList(importedBook1, importedBook2, importedBook3, importedBook4, localBook1, localBook2, localBook3, localBook4);

        Map<String, List<String>> result = Capitalization.convertToMap(inputs);
        System.out.println(result);

        Map<String, List<String>> expected = new HashMap<String, List<String>>(){{
            put("Jane Stark", Arrays.asList("Local Book 1", "Local Book 2", "Local Book 3", "Local Book 4"));
            put("John Doe", Arrays.asList("Imported Book 1", "Imported Book 2", "Imported Book 3", "Imported Book 4"));
        }};

        assertEquals(expected, result);
    }
}
