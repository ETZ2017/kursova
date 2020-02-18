package edu.zhenia.labtwodb.dao.impressario.interfaces;

import edu.zhenia.labtwodb.model.Impressario;

import java.util.List;

public interface IImpressarioDao {
    Impressario save(Impressario Impressario);
    Impressario get(String id);
    List<Impressario> getAll();
    Impressario edit(Impressario group);
    Impressario delete(String id);
}
