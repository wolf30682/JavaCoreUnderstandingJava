package understanding_java;

public class JvmComprehension { //Загрузка информации о классе JvmComprehension в Metaspace (Application ClassLoader)
    public static void main(String[] args) { // В момент вызова метода создаётся фрейм main() в стеке
        int i = 1;                      // 1 В фрейм main() записывается примитив int i = 1
        Object o = new Object();        // 2 Объект Object записывается в heap, а ссылка на него записывается в фрейм main()
        Integer ii = 2;                 // 3 Объект Integer записывается в heap, а ссылка на него записывается в фрейм main()
        printAll(o, i, ii);             // 4 В момент вызова метода создаётся фрейм printAll() в стеке в который записываются ссылки на объекты "о","ii" и примитив int i = 1;
        System.out.println("finished"); // 7 Создаётся новый фрейм в который передаётся ссылка на объект содержащий строку "finished"
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 Объект и ссылка на него не записываются в память т.к. не используются
        System.out.println(o.toString() + i + ii);  // 6 Создаётся новый фрейм с сылкой на объект String образованный о.String(), с примитивом int i = 1 и ссылкой на объект ii
    }
}
