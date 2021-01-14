package com.example.submission3exp.listtvshow.detailtvshow;

import androidx.lifecycle.ViewModel;

import com.example.submission3exp.listtvshow.pojo.ResultsItem;

public class DetailTvShowVIewModel extends ViewModel {
    private ResultsItem resultsItem;

    public ResultsItem getResultsItem() {
        return resultsItem;
    }

    public void setResultsItem(ResultsItem resultsItem) {
        this.resultsItem = resultsItem;
    }
}

