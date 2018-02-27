package com.github.bohnman.squiggly.core.function.functions;

import com.github.bohnman.squiggly.core.function.annotation.SquigglyClass;

@SquigglyClass(include = {
        CollectionFunctions.class,
        DateFunctions.class,
        MathFunctions.class,
        MixedFunctions.class,
        ObjectFunctions.class,
        StringFunctions.class
})
public class DefaultFunctions {

    private DefaultFunctions() {
    }

}