package com.shkwak.dao;
import java.util.List;
import com.shkwak.vo.MovieVO;

public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}
