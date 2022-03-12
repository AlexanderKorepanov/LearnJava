package generics.igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Класс Team параметризован парметром Т, являющимся наследником класса Participant. Т.е. это класс может работать только
с параметром, который может принимать участников игры.
List также может принимать в параметр только тип <Т>, т.е. определенная команда может содержать только конкретный тип
участников (школьники или студенты или рабочие)
 */

public class Team <T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    /*
    Метод addNewParticipant также параметризирован, причём находится в параметризированном классе. Этот метод
    добавляет в команду игроков. Параметризация здесь необходима для того, чтобы в конкретный List, могли быть
    добавлены только конкретные участники. Причем т.к. этот параметризированный метод находтся в параметризированном
    классе, то нет необходимости делать casting в строке (*)
     */

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("В команду " + name + " был добавлен новый игрок " + participant.getName());  // (*)
    }

    /*
    метод playWith также параметризирован. Команда участников может играть только с похожим типом команды:
    школьники - школьники и т.д.
     */

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);

        if (i==0) {
            winnerName = this.name;
        }
        else {
            winnerName = team.name;
        }

        System.out.println("Выйграла команда " + winnerName);
    }
}
