package edu.zhenia.labtwodb.controllers.api;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistInGenre;
import edu.zhenia.labtwodb.model.Contest;
import edu.zhenia.labtwodb.service.contest.impls.ContestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contest")
public class ContestAPIController {
    @Autowired
    ContestServiceImpl service;

    @RequestMapping("/list")
    List<Contest> getall(){
        return service.getAll();
    }

    @RequestMapping("getbyid/{id}")
    Contest get(@PathVariable("id") String id){
        return service.get(id);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    Contest edit(@RequestBody Contest contest){
        return service.save(contest);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Contest create(@RequestBody Contest contest){
        return service.save(contest);
    }

    @RequestMapping("/delete/{id}")
    Contest delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}