package com.orangedusk.mytemplate.covid.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.orangedusk.mytemplate.R;
import com.orangedusk.mytemplate.covid.uimodel.CovidListItemUiModel;
import com.orangedusk.mytemplate.databinding.ListItemBinding;

import java.util.List;

public class CovidListAdapter extends RecyclerView.Adapter<CovidListAdapter.ListItemViewHolder> {
    private List<CovidListItemUiModel> mCovidUiModelList;

    public void setCovidDataList(final List<CovidListItemUiModel> covidListItemUiModels){
        if(mCovidUiModelList==null){
            mCovidUiModelList= covidListItemUiModels;
            notifyDataSetChanged();
        }else{
            DiffUtil.DiffResult result = DiffUtil.calculateDiff(new DiffUtil.Callback() {
                @Override
                public int getOldListSize() {
                    return mCovidUiModelList.size();
                }

                @Override
                public int getNewListSize() {
                    return covidListItemUiModels.size();
                }

                @Override
                public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                    return (mCovidUiModelList.get(oldItemPosition).getStateName().equals(covidListItemUiModels.get(newItemPosition).getStateName()));
                }

                @Override
                public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                    return (mCovidUiModelList.get(oldItemPosition).getConfirmedCases().equals(covidListItemUiModels.get(newItemPosition).getConfirmedCases())&&
                            mCovidUiModelList.get(oldItemPosition).getDeaths().equals(covidListItemUiModels.get(newItemPosition).getDeaths()));
                }
            });
            mCovidUiModelList= covidListItemUiModels;
            result.dispatchUpdatesTo(this);
        }
    }
    @NonNull
    @Override
    public ListItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.list_item,parent,false);
        return new ListItemViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ListItemViewHolder holder, int position) {
        holder.binding.setViewmodel(mCovidUiModelList.get(position));
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mCovidUiModelList ==null? 0: mCovidUiModelList.size();
    }

    static class ListItemViewHolder extends RecyclerView.ViewHolder{
        final ListItemBinding binding;

        public ListItemViewHolder(ListItemBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
