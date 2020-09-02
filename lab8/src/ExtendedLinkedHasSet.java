import java.util.Collection;
import java.util.LinkedHashSet;

public class ExtendedLinkedHasSet<Integer> extends LinkedHashSet<Integer> {
    LinkedHashSet<Integer> hash;

    ExtendedLinkedHasSet(LinkedHashSet<Integer> set) {
        hash = set;
    }

    @Override
    public boolean add(Integer i) {
        if ((int) i % 2 == 0) {
            hash.add(i);
            return true;
        } else return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean result = true;
        for (Integer i : c) {
            if ((int) i % 2 == 0) {
                hash.add(i);
            } else {
                result = false;
            }
        }
        return result;
    }

}
