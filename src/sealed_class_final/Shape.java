package sealed_class_final;

public sealed class Shape permits Circle, Rectangle, Square, SealedClass, NonSealedClass {
}
