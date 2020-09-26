package com.example.gadsleaderboard2020;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;


public class TabFragment2 extends Fragment {


    View view;
    private final LinkedList<String> mWordList = new LinkedList<String>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;


    public TabFragment2() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tab2, container, false);

        for(int i =0; i< 100; i++){

            mWordList.addLast("word" + i);
        }
        System.out.println(mWordList);
        mRecyclerView = view.findViewById(R.id.recycler_view2);
        mAdapter = new WordListAdapter(getContext(),mWordList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(mAdapter);
        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }
}