package com.orangedusk.mytemplate.covid.ui;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orangedusk.mytemplate.R;
import com.orangedusk.mytemplate.common.ui.BaseFragment;
import com.orangedusk.mytemplate.common.vo.Resource;
import com.orangedusk.mytemplate.common.vo.Status;
import com.orangedusk.mytemplate.covid.uimodel.CovidListItemUiModel;
import com.orangedusk.mytemplate.covid.viewmodel.ListFragmentViewModel;
import com.orangedusk.mytemplate.databinding.ListFragmentBinding;

import java.util.List;

public class ListFragment extends BaseFragment {

    static final String TAG= ListFragment.class.getSimpleName();

    private ListFragmentBinding mBinding;
    private CovidListAdapter covidListAdapter;


    public static ListFragment newInstance() {
        return new ListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater,R.layout.list_fragment, container,false);
        covidListAdapter= new CovidListAdapter();
        mBinding.covidList.setAdapter(covidListAdapter);
        return mBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ListFragmentViewModel.class);
        subscribeUiForData(((ListFragmentViewModel) mViewModel).getCovidData());
        mBinding.swiperefresh.setOnRefreshListener(()->{
            mBinding.swiperefresh.setRefreshing(false);
            refreshData();
        });
    }

    private void subscribeUiForData(LiveData<Resource<List<CovidListItemUiModel>>> covidData) {
        covidData.observe(this,covidUiModelsResource -> {
            mBinding.setCardsListResource(covidUiModelsResource);
            if(covidUiModelsResource.status== Status.SUCCESS){
                covidListAdapter.setCovidDataList(covidUiModelsResource.data);
            }
            else if(covidUiModelsResource.status== Status.ERROR){
                //Handle error
            }
        });
    }

}
