package ru.netology.javarest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.javarest.Authorities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new ArrayList<>();
        Map<String, String> users = new ConcurrentHashMap<>();
        users.put("vadim", "112233");
        users.put("olga", "332211");
        users.put("danil", "123456");

        if (users.containsKey(user) && users.get(user).equals(password)){
            list.add(Authorities.WRITE);
            list.add(Authorities.READ);
            list.add(Authorities.DELETE);
        } else {
            return new ArrayList<>();
        }
        return list;
    }
}