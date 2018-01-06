package com.google.firebase.udacity.friendlychat;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Deepanshu on 12/28/2017.
 */

public class StatusAdapter extends ArrayAdapter<StatusItem> {
    public StatusAdapter(Context context, int resource, List<StatusItem> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_status, parent, false);
        }

        ImageView photoUrlView = (ImageView) convertView.findViewById(R.id.photourl);
        TextView statusView = (TextView) convertView.findViewById(R.id.status);
        TextView userNameView = (TextView) convertView.findViewById(R.id.username);
        TextView timeView = (TextView) convertView.findViewById(R.id.time);

        StatusItem statusItem = getItem(position);

        photoUrlView.setVisibility(View.VISIBLE);
        statusView.setVisibility(View.VISIBLE);
        userNameView.setVisibility(View.VISIBLE);
        timeView.setVisibility(View.VISIBLE);

        photoUrlView.setImageResource(statusItem.getPhotoUrl());
        statusView.setText(statusItem.getStatus());
        userNameView.setText(statusItem.getUserName());
        timeView.setText(statusItem.getTime());

        return convertView;
    }
}
