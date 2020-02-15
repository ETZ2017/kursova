package edu.zhenia.labtwodb.service.impressario.interfaces;

import edu.zhenia.labtwodb.model.Impressario;

import java.util.List;

public interface IImpressarioService {
    Impressario save(Impressario Impressario);
    Impressario get(String key);
    List<Impressario> getAll();
    Impressario edit(Impressario group);
    Impressario delete(String id);

}
