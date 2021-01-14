package com.example.submission3exp.listtvshow;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.submission3exp.MovieCatalogue;
import com.example.submission3exp.listtvshow.pojo.ResponseTvShow;

public class ListTvShowViewModel extends ViewModel {
    private MutableLiveData<ResponseTvShow> responseTvShows = new MutableLiveData<>();

    MutableLiveData getTvShowList() {
        if (responseTvShows == null) {
            doRequestListTvShows();
        }
        return responseTvShows;
    }

    void doRequestListTvShows() {
        AndroidNetworking.get("https://api.themoviedb.org/3/discover/tv")
                .addQueryParameter("api_key", MovieCatalogue.MOVIE_DB_API_KEY)
                .addQueryParameter("language", "en-US")
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsObject(ResponseTvShow.class, new ParsedRequestListener<ResponseTvShow>() {

                    @Override
                    public void onResponse(ResponseTvShow response) {
                        responseTvShows.postValue(response);
                    }

                    @Override
                    public void onError(ANError anError) {
                        responseTvShows.setValue(new ResponseTvShow(anError));
                    }
                });
    }
}
