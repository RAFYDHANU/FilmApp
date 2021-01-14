package com.example.submission3exp.listmovies.detailmovie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.submission3exp.R;
import com.example.submission3exp.databinding.ActivityDetailMovieBinding;
import com.example.submission3exp.listmovies.pojo.ResultsItem;

import java.util.Objects;

public class DetailMovie extends AppCompatActivity {

    public static final String SELECTED_MOVIE = "selected_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DetailMovieModel viewModel = ViewModelProviders.of(this).get(DetailMovieModel.class);
        ActivityDetailMovieBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_movie);
        ResultsItem movieModel = getIntent().getParcelableExtra(SELECTED_MOVIE);
        viewModel.setResultsItem(movieModel);
        binding.setViewmodel(viewModel);

        Glide.with(this).load("https://image.tmdb.org/t/p/w185/"+movieModel.getPosterPath()).into(binding.imgPoster);
        setTitle(viewModel.getResultsItem().getTitle());

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
