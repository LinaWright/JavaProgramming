package day63_functional_interface;

import java.util.List;
@FunctionalInterface
public interface ListFunction <T,R> {
    R apply(List<T> list);
}
