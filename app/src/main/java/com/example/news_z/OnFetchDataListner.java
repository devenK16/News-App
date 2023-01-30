package com.example.news_z;

import com.example.news_z.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListner<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list , String message);
    void onError(String message);
}
