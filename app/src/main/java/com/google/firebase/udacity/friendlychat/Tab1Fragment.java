package com.google.firebase.udacity.friendlychat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by User on 2/28/2017.
 */

public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";

    private Button btnTEST;
    private ListView mProfileList;
    private ProfileAdapter mProfileAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment,container,false);

        mProfileList = (ListView) view.findViewById(R.id.profiles);

        final List<ProfileItem> ProfileItems = new ArrayList<>();
        mProfileAdapter = new ProfileAdapter(getActivity(), R.layout.item_profile, ProfileItems);
        mProfileList.setAdapter(mProfileAdapter);
        //TESTING by adding items
        ProfileItem pi = new ProfileItem("Message 1","FES",R.drawable.fes);
        mProfileAdapter.add(pi);
        ProfileItem pi1 = new ProfileItem("Message 2","CSI",R.drawable.csi);
        mProfileAdapter.add(pi1);
        ProfileItem pi2 = new ProfileItem("Message 3","Ecell",R.drawable.ecell);
        mProfileAdapter.add(pi2);
        mProfileList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ProfileItem p = (ProfileItem) parent.getAdapter().getItem(position);
                Intent msgWindow = new Intent(getActivity(), list_of_users.class);
                msgWindow.putExtra("username",p.getUsername());
                startActivity(msgWindow);
                //Toast.makeText(getActivity(),p.getUsername(),Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

}
