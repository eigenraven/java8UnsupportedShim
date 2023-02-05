package sun.reflect;

import java.io.OptionalDataException;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;
import java.security.Permission;
import java.util.Objects;

public class ReflectionFactory {

    private static final ReflectionFactory soleInstance = new ReflectionFactory();

    private ReflectionFactory() {
    }

    private static final Permission REFLECTION_FACTORY_ACCESS_PERM
            = new RuntimePermission("reflectionFactoryAccess");

    public static ReflectionFactory getReflectionFactory() {
        throw new UnsupportedOperationException();
    }

    public Constructor<?> newConstructorForSerialization(Class<?> cl,
                                                         Constructor<?> constructorToCall) {
        throw new UnsupportedOperationException();
    }

    public final Constructor<?> newConstructorForSerialization(Class<?> cl) {
        throw new UnsupportedOperationException();
    }

    public final Constructor<?> newConstructorForExternalization(Class<?> cl) {
        throw new UnsupportedOperationException();
    }

    public final MethodHandle readObjectForSerialization(Class<?> cl) {
        throw new UnsupportedOperationException();
    }

    public final MethodHandle readObjectNoDataForSerialization(Class<?> cl) {
        throw new UnsupportedOperationException();
    }

    public final MethodHandle writeObjectForSerialization(Class<?> cl) {
        throw new UnsupportedOperationException();
    }

    public final MethodHandle readResolveForSerialization(Class<?> cl) {
        throw new UnsupportedOperationException();
    }

    public final MethodHandle writeReplaceForSerialization(Class<?> cl) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasStaticInitializerForSerialization(Class<?> cl) {
        throw new UnsupportedOperationException();
    }

    public final OptionalDataException newOptionalDataExceptionForSerialization(boolean bool) {
        throw new UnsupportedOperationException();
    }
}
