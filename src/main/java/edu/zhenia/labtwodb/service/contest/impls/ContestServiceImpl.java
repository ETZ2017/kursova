package edu.zhenia.labtwodb.service.contest.impls;

import edu.zhenia.labtwodb.dao.repository.ContestRepository;
import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.Contest;
import edu.zhenia.labtwodb.service.artist.impls.ArtistServiceImpl;
import edu.zhenia.labtwodb.service.contest.interfaces.IContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ContestServiceImpl implements IContestService {

    @Autowired
    ContestRepository repository;

    @PostConstruct
    void init(){

        //repository.saveAll(list);
    }

    @Override
    public Contest save(Contest contest) {
        contest.setDateCreated(LocalDateTime.now());
        contest.setDateModified(LocalDateTime.now());
        return repository.save(contest);
    }

    @Override
    public Contest get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Contest> getAll() {
        return repository.findAll();
    }

    @Override
    public Contest edit(Contest contest) {
        contest.setDateModified(LocalDateTime.now());
        return repository.save(contest);
    }

    @Override
    public Contest delete(String id) {
        Contest artist = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return artist;
    }

    public List<Contest> search(String word){
        List<Contest> contests = this.getAll();
        List<Contest> found = new ArrayList<>();

        String temp = word.toLowerCase();

        for(Contest contest : contests) {
            if(contest.getName().contains(word) ||
                    contest.getName().toLowerCase().contains(temp)){
                found.add(contest);
            }
        }

        return found;
    }

    public List<Contest> sortByName(List<Contest> contests){

        Collections.sort(contests, new ContestServiceImpl.ContestNameComparator());

        return contests;
    }

    private class ContestNameComparator implements Comparator<Contest> {
        public int compare(Contest p1, Contest p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }
}
