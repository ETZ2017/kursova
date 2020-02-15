package edu.zhenia.labtwodb.service.contest.interfaces;

import edu.zhenia.labtwodb.model.Contest;

import java.util.List;

public interface IContestService {
    Contest save(Contest Contest);
    Contest get(String key);
    List<Contest> getAll();
    Contest edit(Contest group);
    Contest delete(String id);

}