package com.example.patterns.datamapperandidentitymap;

import java.util.HashMap;
import java.util.Map;

public class IdentityUserMap {
    private static IdentityUserMap instance;

    private Map<Long, User> userMap = new HashMap<>();

    private IdentityUserMap() {}

    public static IdentityUserMap getInstance() {
        if (instance == null) {
            instance = new IdentityUserMap();
        }
        return instance;
    }

    public static void addUser(User user) {
        instance.userMap.put((long) user.getId(), user);
    }

    public static User getUser(Long id) {
        return instance.userMap.get(id);
    }
}
