package service;

import bean.PmsBaseAttrInfo;

import java.util.List;

public interface AttrService {
    List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id);
}
