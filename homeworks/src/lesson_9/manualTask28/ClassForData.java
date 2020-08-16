package lesson_9.manualTask28;

public class ClassForData <T> {
    private T[] arr;

    public ClassForData(T[] arr) {this.arr = arr;}

    public T get(int index) {
        if (arr.length - 1 >= index) {
            return arr[index];
        } else {
            System.out.println("В массиве такого идекса нет!");
            return null;
        }
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }
}
