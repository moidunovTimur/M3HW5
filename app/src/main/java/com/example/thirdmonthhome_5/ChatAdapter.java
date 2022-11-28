package com.example.thirdmonthhome_5;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatViewHolder> {

    private ArrayList<ChatModel> chats;
    private onClickListener onClickListener;

    public ChatAdapter(ArrayList<ChatModel> chats, com.example.thirdmonthhome_5.onClickListener onClickListener) {
        this.chats = chats;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(chats.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickListener.onClickListener(chats.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }
}
