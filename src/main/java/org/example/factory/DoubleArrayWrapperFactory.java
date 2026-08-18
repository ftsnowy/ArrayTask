package org.example.factory;

import org.example.entity.DoubleArrayWrapper;

public interface DoubleArrayWrapperFactory {
    DoubleArrayWrapper create(double[] array);
}
