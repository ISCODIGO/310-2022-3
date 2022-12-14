/**
 * Source code example for "A Practical Introduction to Data
 * Structures and Algorithm Analysis, 3rd Edition (Java)"
 * by Clifford A. Shaffer
 * Copyright 2008-2011 by Clifford A. Shaffer
 */
package tree.bin.search;

/** The Dictionary abstract class. */
public interface Dictionary<Key, E> {

    /** Reinitialize dictionary */
    void clear();

    /** Insert a record
     @param k The key for the record being inserted.
     @param e The record being inserted. */
    void insert(Key k, E e);

    /** Remove and return a record.
     @param k The key of the record to be removed.
     @return A maching record. If multiple records match
     "k", remove an arbitrary one. Return null if no record
     with key "k" exists. */
    E remove(Key k);

    /** Remove and return an arbitrary record from dictionary.
     @return the record removed, or null if none exists. */
    E removeAny();

    /** @return A record matching "k" (null if none exists).
    If multiple records match, return an arbitrary one.
     @param k The key of the record to find */
    E find(Key k);

    /** @return The number of records in the dictionary. */
    int size();
}
