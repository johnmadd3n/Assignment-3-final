public record RecordA <T> (T t) implements InterfaceL<T> {

    @Override
    public T methodA() {
        return t;
    }
}
