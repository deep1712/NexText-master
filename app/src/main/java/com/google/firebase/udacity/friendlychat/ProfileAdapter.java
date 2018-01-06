package com.google.firebase.udacity.friendlychat;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ProfileAdapter extends ArrayAdapter<ProfileItem> {
    public ProfileAdapter(Context context, int resource, List<ProfileItem> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_profile, parent, false);
        }

        ImageView dpView = (ImageView) convertView.findViewById(R.id.dp);
        TextView messageView = (TextView) convertView.findViewById(R.id.message);
        TextView userNameView = (TextView) convertView.findViewById(R.id.username);

        ProfileItem profile = getItem(position);
        dpView.setVisibility(View.VISIBLE);
        messageView.setVisibility(View.VISIBLE);
        userNameView.setVisibility(View.VISIBLE);
        dpView.setImageResource(profile.getDp());
        messageView.setText(profile.getMessage());
        userNameView.setText(profile.getUsername());

        return convertView;
    }

    @Nullable
    @Override
    public ProfileItem getItem(int position) {
        return super.getItem(position);
    }
}