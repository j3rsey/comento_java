package com.shkwak.service;

import java.util.List;
import com.shkwak.vo.MovieVO;
 
public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}