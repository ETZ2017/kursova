package edu.zhenia.labtwodb.dao.contest.interfaces;

import edu.zhenia.labtwodb.model.Contest;

import java.util.List;

public interface IContestDao {
    Contest save(Contest Contest);
    Contest get(String key);
    List<Contest> getAll();
    Contest edit(Contest group);
    Contest delete(String id);
}
