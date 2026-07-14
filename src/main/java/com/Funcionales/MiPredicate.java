package com.Funcionales;

@FunctionalInterface
public interface MiPredicate <T> {
    
    boolean evaluar(T objeto);
}
