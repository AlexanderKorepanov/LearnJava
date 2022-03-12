package collections.workWithArrayList;

//Возможные сигнатуры объявления ArrayList:

import java.util.ArrayList;
import java.util.List;

public class ArrayListSignature {
    public static void main(String[] args) {
        //1. DateType в правой части указывается.
        ArrayList<String> ar1 = new ArrayList<String>();

        //2. DateType в правой части не указывается.
        ArrayList<String> ar2 = new ArrayList<>();

        //3. Объявление с указанием вместительности ArrayList.
        //при этом size - размер - это то, сколько элементов фактически, вместимость - capacity - это сколько м/б.
        ArrayList<String> ar3 = new ArrayList<>(30);

        //4. List является интерфейсом, который имплементирует ArrayList.
        List<String> ar4 = new ArrayList<>();

        //5. Объявление, когда в параметр ArrayList закладывается какой-либо list.
        //необходимо тогда, когда необходимо создать идентичный объект, но как отдельный объект(с другой ссылкой).
        ArrayList<String> ar5 = new ArrayList<>(ar4);
    }
}

