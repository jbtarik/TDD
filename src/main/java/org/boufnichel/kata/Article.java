package org.boufnichel.kata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
public abstract class Article {
    private final String name;
    protected final double price;
    protected int qtte;

    public abstract double getPrixTotalHT();
}
