package com.orangedusk.mytemplate.covid.domain;

import androidx.lifecycle.LiveData;

import com.orangedusk.mytemplate.common.vo.Resource;
import com.orangedusk.mytemplate.covid.uimodel.CovidListItemUiModel;

import java.util.List;

public interface CovidInteractor {

    LiveData<Resource<List<CovidListItemUiModel>>> getCovidUiModelList();

    void refreshData();
}
