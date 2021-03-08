package com.intern.demo;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ImportedBook extends Book{
    private String translator;

    public ImportedBook(String author, String title, String translator) {
        super(author, title);
        this.translator = translator;
    }
}

