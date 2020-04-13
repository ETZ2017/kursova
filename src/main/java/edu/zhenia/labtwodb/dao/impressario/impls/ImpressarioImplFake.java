package edu.zhenia.labtwodb.dao.impressario.impls;

import edu.zhenia.labtwodb.dao.impressario.interfaces.IImpressarioDao;
import edu.zhenia.labtwodb.model.Impressario;
import edu.zhenia.labtwodb.service.impressario.impls.ImpressarioServiceImpl;

import java.util.List;

public class ImpressarioImplFake implements IImpressarioDao {
    ImpressarioServiceImpl service;
    @Override
    public Impressario save(Impressario Impressario) {
        return null;
    }

    @Override
    public Impressario get(String id) {
        return null;
    }

    @Override
    public List<Impressario> getAll() {
        return service.getAll();
    }

    @Override
    public Impressario edit(Impressario group) {
        return null;
    }

    @Override
    public Impressario delete(String id) {
        return null;
    }
}
