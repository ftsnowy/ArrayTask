package org.example.factory.impl;

import org.example.entity.DoubleArrayWrapper;
import org.example.factory.DoubleArrayWrapperFactory;

public class DoubleArrayWrapperFactoryImpl implements DoubleArrayWrapperFactory {

    @Override
    public DoubleArrayWrapper create(double[] array) {
        return new DoubleArrayWrapper(array);
    }
}
