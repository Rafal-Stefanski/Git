package pro1.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarsContainer implements Iterable<Car> {
    private List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }

    public Iterable<Car> oneColorIterable(String color) {
        return new Iterable<Car>() {
            @Override
            public Iterator<Car> iterator() {
                return new OneColorIterator(color);
            }
        };
    }

    private class OneColorIterator implements Iterator<Car> {
        private String color;
        private int currentIndex = -1;

        private OneColorIterator(String color) {
            this.color = color;
        }

        @Override
        public boolean hasNext() {
            return getNext(false) != null;
        }

        @Override
        public Car next() {
            return getNext(true);
        }

        private Car getNext(boolean updateIndex) {
            int nextIndex = currentIndex + 1;
            List<Car> cars = CarsContainer.this.cars;
            while(nextIndex < cars.size()) {
                Car car = cars.get(nextIndex);
                if(car.getColor().equals(color)) {
                    if(updateIndex) {
                        currentIndex = nextIndex;
                    }
                    return car;
                }
                nextIndex++;
            }

            if(updateIndex) {
                currentIndex = nextIndex;
            }

            return null;
        }
    }
}
