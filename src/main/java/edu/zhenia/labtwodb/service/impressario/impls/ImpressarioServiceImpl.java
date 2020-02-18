package edu.zhenia.labtwodb.service.impressario.impls;

import edu.zhenia.labtwodb.dao.impressario.impls.ImpressarioDaoImplFake;
import edu.zhenia.labtwodb.model.Impressario;
import edu.zhenia.labtwodb.service.impressario.interfaces.IImpressarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpressarioServiceImpl implements IImpressarioService {
    @Autowired
    ImpressarioDaoImplFake dao;

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
        return dao.getAll();
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
