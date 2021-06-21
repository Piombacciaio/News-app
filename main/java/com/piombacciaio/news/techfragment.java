package com.piombacciaio.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class techfragment extends Fragment {

    String apikey="5d977be5aa5441e1ba754234fa3af451";
    ArrayList<Model> modelClassArrayList;
    Adapter adapter;
    String country="it";
    private RecyclerView recycletech;
    private String category="technology";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.techfragment, null);

        recycletech=v.findViewById(R.id.recyclertech);
        modelClassArrayList=new ArrayList<>();
        recycletech.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new Adapter(getContext(), modelClassArrayList);
        recycletech.setAdapter(adapter);

        findNews();

        return v;
    }

    private void findNews() {

        Apiutils.getApiInterface().getCategoryNews(country, category, 100, apikey).enqueue(new Callback<mainnews>() {
            @Override
            public void onResponse(Call<mainnews> call, Response<mainnews> response) {
                if(response.isSuccessful())
                {
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<mainnews> call, Throwable t) {

            }
        });
    }
}
