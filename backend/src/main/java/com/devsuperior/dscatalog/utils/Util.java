package com.devsuperior.dscatalog.utils;

import com.devsuperior.dscatalog.entities.Product;
import com.devsuperior.dscatalog.projections.IdProjection;
import com.devsuperior.dscatalog.projections.ProductProjection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Util {
    public static <ID, T extends IdProjection<ID>, U extends IdProjection<ID>> List<U> replace(
            final Collection<T> ordered,
            final Collection<U> unordered) {
        final Map<ID, U> map = unordered.stream().collect(Collectors.toMap(U::getId, Function.identity()));
        final Function<T, U> fromUnorderedById = t -> map.get(t.getId());
        return ordered.stream().map(fromUnorderedById).toList();
    }
}
