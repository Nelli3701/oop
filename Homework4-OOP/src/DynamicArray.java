import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DynamicArray<T> {
    private T[] array;
    private int size;

    public DynamicArray() {
        this.array = (T[]) new Object[0];
        this.size = 0;
    }

    public DynamicArray(T[] arr) {
        this.array = Arrays.copyOf(arr, arr.length);
        this.size = arr.length;

    }

    //добавление в массив
    public void add(T elementToAdd) {
        this.array = Arrays.copyOf(array, array.length + 1);
        this.array[array.length - 1] = elementToAdd;
        this.size++;
    }

    //Удаление элемента по индексу
    public void delete(int elIndex) {
        for (int i = elIndex + 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        this.size--;
    }

    //Удаление всех элементов с заданным значением
    public void deleteAll(T value) {
        int curIndex = 0;
        for (int i = 0; i < size; i++) {
            if (!array[i].equals(value)) {
                array[curIndex++] = array[i];
            }
        }
        for (int i = curIndex; i < size; i++) {
            array[i] = null;
        }

        size = curIndex;
    }

    //Поиск минимума
    public T getMin() {
        T min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] instanceof Comparable) {
                if (((Comparable) array[i]).compareTo(min) < 0) {
                    min = array[i];
                }
            }

        }
        return min;
    }
    //Поиск максимума
    public T getMax() {
        T max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] instanceof Comparable) {
                if (((Comparable) array[i]).compareTo(max) > 0) {
                    max = array[i];
                }
            }

        }
        return max;
    }

    //Поиск суммы элементов массива
    public <T extends Number> T getSum() {
        double sum = 0;;
        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Number) {
                sum += ((Number) array[i]).doubleValue();
            }
        }
        return (T) Double.valueOf(sum);
    }

    //Поиск произведения элементов массива
    public <T extends Number> T getProduct() {
        double product = 1;
        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Number) {
                product *= ((Number) array[i]).doubleValue();
            }
        }
        return (T) Double.valueOf(product);
    }

    //Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
    public int getIndex(T value) {
        int ind = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                ind = i;
            } 
            else ind = -1;
        }
        return ind;
    }

    //Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.
    public boolean findEl(T value) {
        Set<T> set = new HashSet<>(Arrays.asList(array));
        return set.contains(value);
    }

    //Пузырьковая сортировка
    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(((Comparable) array[j]).compareTo(array[j + 1]) > 0) {
                    T swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }

    //??Сортировка простыми вставками

    public void insertionSort() {
        int j;
        for (int i = 1; i < size; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            T swap = array[i];
            for (j = i - 1; j >= 0 && ((Comparable) array[j]).compareTo(swap) > 0; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                array[j + 1] = array[j];
            }
            array[j + 1] = swap;
        }
    }

    //Сортировка простым выбором
    public void selectionSort() {
        for (int i = 0; i < size; i++) {
            int pos = i;
            T min = array[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < size; j++) {
                if (((Comparable) array[j]).compareTo(min) < 0) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            //меняем местами наименьший с sortArr[i]
            array[i] = min;
        }
    }

    //Получение элемента массива по индексу
    public T getEl(int i) {
        return array[i];
    }

    //Задание значения элементу массива с заданным индексом
    public void setValue(int i, T value) {
        array[i] = value;
    }

    //Печать массива
    public void print() {
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + "\n");
        }
    }
    //Длина массива

    public int getSize() {
        return size;
    }

}