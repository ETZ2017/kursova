package edu.zhenia.labtwodb.dao.artistInGenre.interfaces;

import edu.zhenia.labtwodb.model.ArtistInGenre;

import java.util.List;

public interface IArtistInGenreDao {
    ArtistInGenre save(ArtistInGenre artistInGenre);
    ArtistInGenre get(String id);
    List<ArtistInGenre> getAll();
    ArtistInGenre edit(ArtistInGenre artistInGenre);
    ArtistInGenre delete(String id);
}
