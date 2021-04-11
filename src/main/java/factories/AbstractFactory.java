package factories;

public interface AbstractFactory<T> {
    T create(Enum kind);
}
