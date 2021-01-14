package com.example.submission3exp.listmovies.pojo;

import java.util.List;

import com.androidnetworking.error.ANError;
import com.google.gson.annotations.SerializedName;

public class ResponseMovies{

	@SerializedName("page")
	private int page;

	@SerializedName("total_pages")
	private int totalPages;

	@SerializedName("results")
	private List<ResultsItem> results;

	@SerializedName("total_results")
	private int totalResults;

	private ANError anError;

	public ANError getAnError() {
		return anError;
	}

	public ResponseMovies() {
	}

	public ResponseMovies(ANError anError) {
		this.anError = anError;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
	public String toString(){
		return
				"ResponseMovie{" +
						",page = '" + page + '\'' +
						",total_pages = '" + totalPages + '\'' +
						",results = '" + results + '\'' +
						",total_results = '" + totalResults + '\'' +
						"}";
	}


}