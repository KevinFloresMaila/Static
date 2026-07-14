package com.Funcionales;

@FunctionalInterface
public interface MiFunction<R,S> {
    S generar(R s);
}
