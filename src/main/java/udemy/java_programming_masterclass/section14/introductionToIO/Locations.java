package udemy.java_programming_masterclass.section14.introductionToIO;

import java.io.*;
import java.util.*;

/**
 * created 2020.10.13 by RS
 */

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {

        try (ObjectOutputStream locFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/udemy/java_programming_masterclass/section14/introductionToIO/locations.dat")));) {
            for (Location location : locations.values()) {
                locFile.writeObject(location);
            }
        }

    }

    static {

        try (ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream((new FileInputStream("src/main/java/udemy/java_programming_masterclass/section14/introductionToIO/locations.dat"))))) {
            boolean eof = false;
            while (!eof) {
                try {
                    Location location = (Location) locFile.readObject();
                    System.out.println("Read location " + location.getLocationID() + " : " + location.getLocationID());
                    System.out.println("Found " + location.getExits().size() + " exits");

                    locations.put(location.getLocationID(), location);
                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (InvalidClassException e) {
            System.out.println("InvalidClassException " + e.getMessage());
        } catch (IOException io) {
            System.out.println("IO Exception" + io.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException " + e.getMessage());
        }

    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}