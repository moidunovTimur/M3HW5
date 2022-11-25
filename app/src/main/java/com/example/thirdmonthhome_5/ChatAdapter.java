package com.example.thirdmonthhome_5;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatViewHolder> {

    private ArrayList<ChatModel> chats;

    public ChatAdapter(ArrayList<ChatModel> chats) {
        this.chats = chats;
    }
    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
       holder.bind(chats.get(position).image, chats.get(position).title, chats.get(position).message);
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }
}
