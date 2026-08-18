package org.example.service.statistics;

import org.example.entity.DoubleArrayWrapper;

import java.util.Optional;

public interface ArrayStatistics {
    Optional<Double> findMin(DoubleArrayWrapper wrapper);
    Optional<Double> findMax(DoubleArrayWrapper wrapper);
    Optional<Double> calculateSum(DoubleArrayWrapper wrapper);
    Optional<Double> calculateAverage(DoubleArrayWrapper wrapper);
}
