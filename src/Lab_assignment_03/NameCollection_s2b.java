package Lab_assignment_03;

public class NameCollection_s2b implements Enumeration_s2a {
    String[] names;
    int size;
    // to track actual number of names

    public NameCollection_s2b(String[] inputNames) {
        names = new String[100];
        size = inputNames.length;
        for (int i = 0; i < size; i++) {
            names[i] = inputNames[i];
        }
    }
    @Override
    public boolean hasNext(int index) {
        return index < size;
    }
    @Override
    public Object getNext(int index) {
        if (hasNext(index)) {
            return names[index];
        } else {
            return null;
        }
    }
}
