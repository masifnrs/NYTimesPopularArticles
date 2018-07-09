package com.example.muhammad.nytimespopulararticles.main_activity;

import android.util.Log;


import com.example.muhammad.nytimespopulararticles.model.ArticleList;
import com.example.muhammad.nytimespopulararticles.my_interface.GetNoticeDataService;
import com.example.muhammad.nytimespopulararticles.network.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by bpn on 12/7/17.
 */

public class DataIntractorImpl implements MainInterface.DataIntractor {

    @Override
    public void getNoticeArrayList(final OnFinishedListener onFinishedListener) {


        /** Create handle for the RetrofitInstance interface*/
        GetNoticeDataService service = RetrofitInstance.getRetrofitInstance().create(GetNoticeDataService.class);

        /** Call the method with parameter in the interface to get the notice data*/
        Call<ArticleList> call = service.getNoticeData("95b1a4698fbc4ae29a88e57747d73ff8");

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<ArticleList>() {
            @Override
            public void onResponse(Call<ArticleList> call, Response<ArticleList> response) {
                onFinishedListener.onFinished(response.body().getNoticeArrayList());

            }

            @Override
            public void onFailure(Call<ArticleList> call, Throwable t) {
                onFinishedListener.onFailure(t);
            }
        });

    }

}
