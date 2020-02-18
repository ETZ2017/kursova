package edu.zhenia.labtwodb.service.winners.interfaces;

import edu.zhenia.labtwodb.model.Winners;

import java.util.List;

public interface IWinnersService {
    Winners save(Winners Winners);
    Winners get(String id);
    List<Winners> getAll();
    Winners edit(Winners group);
    Winners delete(String id);

}
