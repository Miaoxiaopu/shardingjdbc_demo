package com.fish.mapper;

import java.util.List;
import java.util.Map;

public interface FileInfoMapper {
    List<Map<String, Object>> getFileList();

    List<Map<String, Object>> findById(Long id);

    List<Map<String, Object>> findByName(String fileName);

    void insertFile(Map<String, Object> map);
}
