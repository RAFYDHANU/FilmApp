package com.example.submission3exp.listmovies.detailmovie;

import androidx.lifecycle.ViewModel;

import com.example.submission3exp.listmovies.pojo.ResultsItem;

public class DetailMovieModel extends ViewModel {
    private ResultsItem resultsItem;

    public ResultsItem getResultsItem() {
        return resultsItem;
    }

    public void setResultsItem(ResultsItem resultsItem) {
        this.resultsItem = resultsItem;
    }
}

