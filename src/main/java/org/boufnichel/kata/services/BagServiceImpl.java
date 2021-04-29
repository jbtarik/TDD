package org.boufnichel.kata.services;

import org.boufnichel.kata.bags.Bag;
import org.boufnichel.kata.model.Total;
import org.springframework.stereotype.Service;

@Service
public class BagServiceImpl implements BagService {
    @Override
    public Total getBagPrice(String bagDesc) {
        Bag bag=new Bag(bagDesc);
        return new Total(bag.calculate());
    }
}
