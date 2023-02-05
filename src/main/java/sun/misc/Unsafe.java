package sun.misc;

import java.lang.reflect.Field;
import java.util.Objects;

public final class Unsafe {
    private Unsafe() {
    }

    private static final Unsafe theUnsafe = new Unsafe();

    public static Unsafe getUnsafe() {
        throw new UnsupportedOperationException();
    }

    public int getInt(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putInt(Object o, long offset, int x) {
        throw new UnsupportedOperationException();
    }

    public Object getObject(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putObject(Object o, long offset, Object x) {
        throw new UnsupportedOperationException();
    }

    public boolean getBoolean(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putBoolean(Object o, long offset, boolean x) {
        throw new UnsupportedOperationException();
    }

    public byte getByte(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putByte(Object o, long offset, byte x) {
        throw new UnsupportedOperationException();
    }

    public short getShort(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putShort(Object o, long offset, short x) {
        throw new UnsupportedOperationException();
    }

    public char getChar(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putChar(Object o, long offset, char x) {
        throw new UnsupportedOperationException();
    }

    public long getLong(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putLong(Object o, long offset, long x) {
        throw new UnsupportedOperationException();
    }

    public float getFloat(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putFloat(Object o, long offset, float x) {
        throw new UnsupportedOperationException();
    }

    public double getDouble(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putDouble(Object o, long offset, double x) {
        throw new UnsupportedOperationException();
    }

    public byte getByte(long address) {
        throw new UnsupportedOperationException();
    }

    public void putByte(long address, byte x) {
        throw new UnsupportedOperationException();
    }

    public short getShort(long address) {
        throw new UnsupportedOperationException();
    }

    public void putShort(long address, short x) {
        throw new UnsupportedOperationException();
    }

    public char getChar(long address) {
        throw new UnsupportedOperationException();
    }

    public void putChar(long address, char x) {
        throw new UnsupportedOperationException();
    }

    public int getInt(long address) {
        throw new UnsupportedOperationException();
    }

    public void putInt(long address, int x) {
        throw new UnsupportedOperationException();
    }

    public long getLong(long address) {
        throw new UnsupportedOperationException();
    }

    public void putLong(long address, long x) {
        throw new UnsupportedOperationException();
    }

    public float getFloat(long address) {
        throw new UnsupportedOperationException();
    }

    public void putFloat(long address, float x) {
        throw new UnsupportedOperationException();
    }

    public double getDouble(long address) {
        throw new UnsupportedOperationException();
    }

    public void putDouble(long address, double x) {
        throw new UnsupportedOperationException();
    }

    public long getAddress(long address) {
        throw new UnsupportedOperationException();
    }

    public void putAddress(long address, long x) {
        throw new UnsupportedOperationException();
    }

    public long allocateMemory(long bytes) {
        throw new UnsupportedOperationException();
    }

    public long reallocateMemory(long address, long bytes) {
        throw new UnsupportedOperationException();
    }

    public void setMemory(Object o, long offset, long bytes, byte value) {
        throw new UnsupportedOperationException();
    }

    public void setMemory(long address, long bytes, byte value) {
        throw new UnsupportedOperationException();
    }

    public void copyMemory(Object srcBase, long srcOffset,
                           Object destBase, long destOffset,
                           long bytes) {
        throw new UnsupportedOperationException();
    }

    public void copyMemory(long srcAddress, long destAddress, long bytes) {
        throw new UnsupportedOperationException();
    }

    public void freeMemory(long address) {
        throw new UnsupportedOperationException();
    }

    public static final int INVALID_FIELD_OFFSET = Objects.requireNonNull(null);

    public long objectFieldOffset(Field f) {
        throw new UnsupportedOperationException();
    }

    public long staticFieldOffset(Field f) {
        throw new UnsupportedOperationException();
    }

    public Object staticFieldBase(Field f) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public boolean shouldBeInitialized(Class<?> c) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void ensureClassInitialized(Class<?> c) {
        throw new UnsupportedOperationException();
    }

    public int arrayBaseOffset(Class<?> arrayClass) {
        throw new UnsupportedOperationException();
    }

    public static final int ARRAY_BOOLEAN_BASE_OFFSET
            = theUnsafe.arrayBaseOffset(boolean[].class);

    public static final int ARRAY_BYTE_BASE_OFFSET
            = theUnsafe.arrayBaseOffset(byte[].class);

    public static final int ARRAY_SHORT_BASE_OFFSET
            = theUnsafe.arrayBaseOffset(short[].class);

    public static final int ARRAY_CHAR_BASE_OFFSET
            = theUnsafe.arrayBaseOffset(char[].class);

    public static final int ARRAY_INT_BASE_OFFSET
            = theUnsafe.arrayBaseOffset(int[].class);

    public static final int ARRAY_LONG_BASE_OFFSET
            = theUnsafe.arrayBaseOffset(long[].class);

    public static final int ARRAY_FLOAT_BASE_OFFSET
            = theUnsafe.arrayBaseOffset(float[].class);

    public static final int ARRAY_DOUBLE_BASE_OFFSET
            = theUnsafe.arrayBaseOffset(double[].class);

    public static final int ARRAY_OBJECT_BASE_OFFSET
            = theUnsafe.arrayBaseOffset(Object[].class);

    public int arrayIndexScale(Class<?> arrayClass) {
        throw new UnsupportedOperationException();
    }

    public static final int ARRAY_BOOLEAN_INDEX_SCALE
            = theUnsafe.arrayIndexScale(boolean[].class);

    public static final int ARRAY_BYTE_INDEX_SCALE
            = theUnsafe.arrayIndexScale(byte[].class);

    public static final int ARRAY_SHORT_INDEX_SCALE
            = theUnsafe.arrayIndexScale(short[].class);

    public static final int ARRAY_CHAR_INDEX_SCALE
            = theUnsafe.arrayIndexScale(char[].class);

    public static final int ARRAY_INT_INDEX_SCALE
            = theUnsafe.arrayIndexScale(int[].class);

    public static final int ARRAY_LONG_INDEX_SCALE
            = theUnsafe.arrayIndexScale(long[].class);

    public static final int ARRAY_FLOAT_INDEX_SCALE
            = theUnsafe.arrayIndexScale(float[].class);

    public static final int ARRAY_DOUBLE_INDEX_SCALE
            = theUnsafe.arrayIndexScale(double[].class);

    public static final int ARRAY_OBJECT_INDEX_SCALE
            = theUnsafe.arrayIndexScale(Object[].class);

    public int addressSize() {
        throw new UnsupportedOperationException();
    }

    /**
     * The value of {@code addressSize()}
     */
    public static final int ADDRESS_SIZE = theUnsafe.addressSize();

    public int pageSize() {
        throw new UnsupportedOperationException();
    }

    public Object allocateInstance(Class<?> cls)
            throws InstantiationException {
        throw new UnsupportedOperationException();
    }

    public void throwException(Throwable ee) {
        throw new UnsupportedOperationException();
    }

    public boolean compareAndSwapObject(Object o, long offset,
                                        Object expected,
                                        Object x) {
        throw new UnsupportedOperationException();
    }

    public boolean compareAndSwapInt(Object o, long offset,
                                     int expected,
                                     int x) {
        throw new UnsupportedOperationException();
    }

    public boolean compareAndSwapLong(Object o, long offset,
                                      long expected,
                                      long x) {
        throw new UnsupportedOperationException();
    }

    public Object getObjectVolatile(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putObjectVolatile(Object o, long offset, Object x) {
        throw new UnsupportedOperationException();
    }

    public int getIntVolatile(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putIntVolatile(Object o, long offset, int x) {
        throw new UnsupportedOperationException();
    }

    public boolean getBooleanVolatile(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putBooleanVolatile(Object o, long offset, boolean x) {
        throw new UnsupportedOperationException();
    }

    public byte getByteVolatile(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putByteVolatile(Object o, long offset, byte x) {
        throw new UnsupportedOperationException();
    }

    public short getShortVolatile(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putShortVolatile(Object o, long offset, short x) {
        throw new UnsupportedOperationException();
    }

    public char getCharVolatile(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putCharVolatile(Object o, long offset, char x) {
        throw new UnsupportedOperationException();
    }

    public long getLongVolatile(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putLongVolatile(Object o, long offset, long x) {
        throw new UnsupportedOperationException();
    }

    public float getFloatVolatile(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putFloatVolatile(Object o, long offset, float x) {
        throw new UnsupportedOperationException();
    }

    public double getDoubleVolatile(Object o, long offset) {
        throw new UnsupportedOperationException();
    }

    public void putDoubleVolatile(Object o, long offset, double x) {
        throw new UnsupportedOperationException();
    }

    public void putOrderedObject(Object o, long offset, Object x) {
        throw new UnsupportedOperationException();
    }

    public void putOrderedInt(Object o, long offset, int x) {
        throw new UnsupportedOperationException();
    }

    public void putOrderedLong(Object o, long offset, long x) {
        throw new UnsupportedOperationException();
    }

    public void unpark(Object thread) {
        throw new UnsupportedOperationException();
    }

    public void park(boolean isAbsolute, long time) {
        throw new UnsupportedOperationException();
    }

    public int getLoadAverage(double[] loadavg, int nelems) {
        throw new UnsupportedOperationException();
    }

    public int getAndAddInt(Object o, long offset, int delta) {
        throw new UnsupportedOperationException();
    }

    public long getAndAddLong(Object o, long offset, long delta) {
        throw new UnsupportedOperationException();
    }

    public int getAndSetInt(Object o, long offset, int newValue) {
        throw new UnsupportedOperationException();
    }

    public long getAndSetLong(Object o, long offset, long newValue) {
        throw new UnsupportedOperationException();
    }

    public Object getAndSetObject(Object o, long offset, Object newValue) {
        throw new UnsupportedOperationException();
    }


    public void loadFence() {
        throw new UnsupportedOperationException();
    }

    public void storeFence() {
        throw new UnsupportedOperationException();
    }

    public void fullFence() {
        throw new UnsupportedOperationException();
    }

    public void invokeCleaner(java.nio.ByteBuffer directBuffer) {
        throw new UnsupportedOperationException();
    }
}
