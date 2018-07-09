package com.example.muhammad.nytimespopulararticles.main_activity;


import com.example.muhammad.nytimespopulararticles.model.Article;

import java.util.ArrayList;

/**
 * Created by bpn on 12/7/17.
 */

public class PresenterImpl implements MainInterface.presenter, MainInterface.DataIntractor.OnFinishedListener {

    private MainInterface.MainView mainView;
    private MainInterface.DataIntractor getNoticeIntractor;

    public PresenterImpl(MainInterface.MainView mainView, MainInterface.DataIntractor getNoticeIntractor) {
        this.mainView = mainView;
        this.getNoticeIntractor = getNoticeIntractor;
    }

    @Override
    public void onDestroy() {

        mainView = null;

    }

    @Override
    public void onRefreshButtonClick() {

        if(mainView != null){
            mainView.showProgress();
        }
        getNoticeIntractor.getNoticeArrayList(this);

    }

    @Override
    public void requestDataFromServer() {
        getNoticeIntractor.getNoticeArrayList(this);
    }


    @Override
    public void onFinished(ArrayList<Article> articleArrayList) {
        if(mainView != null){
            mainView.setDataToRecyclerView(articleArrayList);
            mainView.hideProgress();
        }
    }

    @Override
    public void onFailure(Throwable t) {
        if(mainView != null){
            mainView.onResponseFailure(t);
            mainView.hideProgress();
        }
    }
}
