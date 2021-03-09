package com.intern.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class Capitalization {

    private static String capitalize (String input) {
        //TODO Add logic to capitalize String Input
        //TODO Input = "I want to lEARN JAVA"
        //TODO Output = "I Want To Learn Java"
        return WordUtils.capitalizeFully(input);
    }

    public static Map<String, List<String>> convertToMap (List<Book> object) {
        // TODO Add logic to capitalize Author and Title Of Books to Map with Key: Author, Value: List of Title Grouped By Author
        // TODO INPUT: List<Book>
        // TODO OUTPUT: Map<String, List<String>>
        for(Book input : object) {
            input.setAuthor(capitalize(input.getAuthor()));
            input.setTitle(capitalize(input.getTitle()));
        }

        return object.stream()
                .collect(Collectors.groupingBy(Book::getAuthor,
                        Collectors.mapping(Book::getTitle, Collectors.toList())));
    }
}