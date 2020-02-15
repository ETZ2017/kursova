package edu.zhenia.labtwodb.dao.winners.interfaces;

import edu.zhenia.labtwodb.model.Winners;

import java.util.List;

public interface IWinnersDao {
    Winners save(Winners Winners);
    Winners get(String key);
    List<Winners> getAll();
    Winners edit(Winners group);
    Winners delete(String id);
}
