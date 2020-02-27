package edu.zhenia.labtwodb.dao.artistInGenre.interfaces;

import edu.zhenia.labtwodb.model.Artist;
import edu.zhenia.labtwodb.model.ArtistInGenre;

import java.util.List;

public interface IArtistInGenreDao {
    ArtistInGenre save(ArtistInGenre artistInGenre);
    ArtistInGenre get(String id);
    List<ArtistInGenre> getAll();
    ArtistInGenre edit(ArtistInGenre group);
    ArtistInGenre delete(String id);
}
