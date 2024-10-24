public class Main {
    public static void main(String[] args) {
        ArrayContainer<Integer> arrayContainer = new ArrayContainer<>(2);
        arrayContainer.add(10);
        arrayContainer.add(20);
        arrayContainer.add(30); // Тестируем увеличение размера массива
        System.out.println("Элемент по индексу 1: " + arrayContainer.get(1));
        arrayContainer.remove(1);
        System.out.println("Размер после удаления: " + arrayContainer.size());
    }
}
