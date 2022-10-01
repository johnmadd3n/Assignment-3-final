import java.util.Optional;

public record RecordC <T> (Optional<Integer> optional1, Optional<Integer> optional2) implements InterfaceL<T> {
    RecordC() {
        this(Optional.empty(), Optional.of(1));
    }
    @Override
    public T methodA() {
        return null;
    }
}
