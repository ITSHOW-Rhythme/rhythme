package com.example.rhythme.dao;

import com.example.rhythme.dto.RecentWordDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecentWordDAO {
    List<RecentWordDTO> findRecentWordsByUserId(String userId);
}
