package com.thealgorithms.datastructures.trees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TreapTest {

    @Test
    public void searchAndFound() {
        Treap treap = new Treap();
        treap.insert(5);
        treap.insert(9);
        treap.insert(6);
        treap.insert(2);
        treap.insert(3);
        treap.insert(8);
        treap.insert(1);
        assertEquals(5, treap.search(5).value);
    }

    @Test
    public void searchAndNotFound() {
        Treap treap = new Treap();
        treap.insert(5);
        treap.insert(9);
        treap.insert(6);
        treap.insert(2);
        treap.insert(3);
        treap.insert(8);
        treap.insert(1);
        assertEquals(null, treap.search(4));
    }

    @Test
    public void lowerBound() {
        Treap treap = new Treap();
        treap.insert(5);
        treap.insert(9);
        treap.insert(6);
        treap.insert(2);
        treap.insert(3);
        treap.insert(8);
        treap.insert(1);
        assertEquals(5, treap.lowerBound(4).value);
    }

    @Test
    public void upperBound() {
        Treap treap = new Treap();
        treap.insert(5);
        treap.insert(9);
        treap.insert(6);
        treap.insert(2);
        treap.insert(3);
        treap.insert(8);
        treap.insert(1);
        assertEquals(6, treap.upperBound(5).value);
    }

    @Test
    public void misc() {
        Treap treap = new Treap();
        treap.insert(5);
        treap.insert(9);
        treap.insert(6);
        treap.insert(2);
        treap.insert(3);
        treap.insert(8);
        treap.insert(1);
        assertEquals(7, treap.size());
        assertEquals(false, treap.isEmpty());
    }
}
