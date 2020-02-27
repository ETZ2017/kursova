package edu.zhenia.labtwodb.service.artistInGenre.interfaces;

import edu.zhenia.labtwodb.model.ArtistAtEvent;
import edu.zhenia.labtwodb.model.ArtistInGenre;

import java.util.List;

public interface IArtistInGenreService {
    ArtistInGenre save(ArtistInGenre artistInGenre);
    ArtistInGenre get(String id);
    List<ArtistInGenre> getAll();
    ArtistInGenre edit(ArtistInGenre group);
    ArtistInGenre delete(String id);
}
