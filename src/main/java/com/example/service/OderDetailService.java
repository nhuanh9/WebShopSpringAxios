package com.example.service;

import com.example.model.OderDetail;

public interface OderDetailService extends IService<OderDetail>{

    public Iterable<OderDetail>findAllByOrderId(Long id);
}
