package com.google.firebase.udacity.friendlychat;

/**
 * Created by Deepanshu on 12/13/2017.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";

    private ListView statusList;
    private StatusAdapter statusAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2_fragment,container,false);
        statusList = (ListView) view.findViewById(R.id.status);

        final List<StatusItem> StatusItems = new ArrayList<>();
        statusAdapter = new StatusAdapter(getActivity(),R.layout.item_status,StatusItems);
        statusList.setAdapter(statusAdapter);
        StatusItem s1 = new StatusItem(R.drawable.csi,"Status bhut bhut bhut bhut bhut bhut bhut bhut bhut bhut bhut bhut bhut bhut bhut bhut bhut bhut  bada likh k check k liye","12:23pm","CSI");
        statusAdapter.add(s1);
        StatusItem s2 = new StatusItem(R.drawable.csi,"Status2 ","12:24pm","CSI");
        statusAdapter.add(s2);
        StatusItem s3 = new StatusItem(R.drawable.fes,"Status mai likhne k liye kuch ho toh velle logh hai hum. society se logho koh nikalte hai hum toh woh chasma utar k chupte hai.. humse B)","5:51pm","FES");
        statusAdapter.add(s3);
        StatusItem s4 = new StatusItem(R.drawable.ecell,"Iska bhi ek check","7:44pm","ECell");
        statusAdapter.add(s4);
        return view;
    }
}