package org.boufnichel.kata.bags;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class ArticlePesable extends Article{
    public ArticlePesable(String name, double price, int qtte) {
        super(name, price, qtte);
    }

    @Override
    public double getPrixTotalHT() {
        return price*qtte/1000;
    }
}
