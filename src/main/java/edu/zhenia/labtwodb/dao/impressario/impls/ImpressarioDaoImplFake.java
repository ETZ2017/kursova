package edu.zhenia.labtwodb.dao.impressario.impls;

import edu.zhenia.labtwodb.dao.impressario.interfaces.IImpressarioDao;
import edu.zhenia.labtwodb.dataSet.DataSet;
import edu.zhenia.labtwodb.model.Impressario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ImpressarioDaoImplFake implements IImpressarioDao {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getImpressarios();
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
