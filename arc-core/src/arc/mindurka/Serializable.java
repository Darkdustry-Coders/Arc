package arc.mindurka;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A desperate attempt to get native images to cooperate.
 * <p>
 * Will cause the class to be registered by {@code SerializationProcess}. Only works in {@code mindustry} project.
 * <p>
 * Consider using {@code coreplugin/src/main/kotlin/mindurka/coreplugin/nativeimage/Heat.kt} instead.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Serializable {
}
