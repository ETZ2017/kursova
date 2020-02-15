package edu.zhenia.labtwodb.dao.genre.interfaces;

import edu.zhenia.labtwodb.model.Genre;

import java.util.List;

public interface IGenreDao {
    Genre save(Genre Genre);
    Genre get(String key);
    List<Genre> getAll();
    Genre edit(Genre group);
    Genre delete(String id);
}
