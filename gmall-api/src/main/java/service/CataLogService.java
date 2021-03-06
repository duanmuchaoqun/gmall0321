package service;

import bean.PmsBaseCatalog1;
import bean.PmsBaseCatalog2;
import bean.PmsBaseCatalog3;

import java.util.List;

public interface CataLogService {
    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
