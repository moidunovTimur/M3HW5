package com.example.thirdmonthhome_5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailsFragment extends Fragment {

    ImageView imageView;
    TextView title,message;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageView = view.findViewById(R.id.chat_iv);
        title = view.findViewById(R.id.title_tv);
        message = view.findViewById(R.id.message_tv);

        Bundle bundle = getArguments();
        Integer image = bundle.getInt("image");
        imageView.setImageResource(image);

        String text = bundle.getString("text");
        title.setText(text);

        String messageText = bundle.getString("message");
        message.setText(messageText);
    }
}