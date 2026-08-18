package org.example.service;

import org.example.entity.DoubleArrayWrapper;
import org.example.service.statistics.ArrayStatistics;

import java.util.Optional;

public class ArrayStatisticsImpl implements ArrayStatistics {

    @Override
    public Optional<Double> findMin(DoubleArrayWrapper wrapper) {
        if (wrapper == null || wrapper.isEmpty()) {
            return Optional.empty();
        }

        double[] array = wrapper.getArray();
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return Optional.of(min);
    }

    @Override
    public Optional<Double> findMax(DoubleArrayWrapper wrapper) {
        if (wrapper == null || wrapper.isEmpty()) {
            return Optional.empty();
        }

        double[] array = wrapper.getArray();
        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return Optional.of(max);
    }

    @Override
    public Optional<Double> calculateSum(DoubleArrayWrapper wrapper) {
        if (wrapper == null || wrapper.isEmpty()) {
            return Optional.empty();
        }

        double[] array = wrapper.getArray();
        double sum = 0.0;

        for (double value : array) {
            sum += value;
        }

        return Optional.of(sum);
    }

    @Override
    public Optional<Double> calculateAverage(DoubleArrayWrapper wrapper) {
        if (wrapper == null || wrapper.isEmpty()) {
            return Optional.empty();
        }

        double[] array = wrapper.getArray();
        double sum = 0.0;

        for (double value : array) {
            sum += value;
        }

        return Optional.of(sum / array.length);
    }
}