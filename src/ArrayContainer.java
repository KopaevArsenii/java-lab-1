class ArrayContainer<T> {
    private T[] array;
    private int size;
    private int capacity;

    // Конструктор
    @SuppressWarnings("unchecked")
    public ArrayContainer(int initialCapacity) {
        this.capacity = initialCapacity;
        this.size = 0;
        this.array = (T[]) new Object[capacity]; // Создаем массив объектов
    }

    // Метод для добавления элемента
    public void add(T element) {
        if (size == capacity) {
            resize(); // Увеличиваем размер массива, если он заполнен
        }
        array[size++] = element;
    }

    // Метод для извлечения элемента по индексу
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }
        return array[index];
    }

    // Метод для удаления элемента по индексу
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null; // Уменьшаем размер и очищаем последнюю ячейку
    }

    // Метод для изменения размера массива
    @SuppressWarnings("unchecked")
    private void resize() {
        capacity = capacity * 2;
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    // Получение текущего размера контейнера
    public int size() {
        return size;
    }
}
