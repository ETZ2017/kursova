package edu.zhenia.labtwodb.service.genre.interfaces;

import edu.zhenia.labtwodb.model.Genre;

import java.util.List;

public interface IGenreService {
    Genre save(Genre Genre);
    Genre get(String id);
    List<Genre> getAll();
    Genre edit(Genre group);
    Genre delete(String id);

}
