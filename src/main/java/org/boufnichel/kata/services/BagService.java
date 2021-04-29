package org.boufnichel.kata.services;

import org.boufnichel.kata.model.Total;

public interface BagService {
    Total getBagPrice(String bagDesc);
}
