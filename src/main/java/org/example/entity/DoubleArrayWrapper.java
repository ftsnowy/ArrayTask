package org.example.entity;

import java.util.Arrays;

public class DoubleArrayWrapper extends AbstractArrayWrapper {

    private double[] array;

    public DoubleArrayWrapper() {
        this.array = new double[0];
    }

    public DoubleArrayWrapper(double[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public double[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(double[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        DoubleArrayWrapper that = (DoubleArrayWrapper) object;
        return Arrays.equals(this.array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ArrayWrapper{");
        stringBuilder.append("array=").append(Arrays.toString(array));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}
