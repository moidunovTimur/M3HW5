package com.example.thirdmonthhome_5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;

public class ListFragment extends Fragment {

   RecyclerView chatsRecyclerView;
   private ArrayList<ChatModel> chats;
   Button addButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        chatsRecyclerView = view.findViewById(R.id.chats_rv);
        addButton = view.findViewById(R.id.add_btn);
        setChats();
        ChatAdapter adapter = new ChatAdapter(chats,this::onClick);
        chatsRecyclerView.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chats.add(0,new ChatModel(R.drawable.jobs,"New Chat",""));
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void onClick(ChatModel chatModel) {
        Bundle bundle = new Bundle();
        bundle.putInt("image",chatModel.image);
        bundle.putString("title",chatModel.title);
        bundle.putString("message",chatModel.message);
        DetailsFragment fragment = new DetailsFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack("").commit();
    }

    private void setChats() {
        chats = new ArrayList<>();
        chats.add(new ChatModel(R.drawable.jobs,"Geectecth50-3","Timur Moidunov"));
        chats.add(new ChatModel(R.drawable.jobs,"GeekStudents","Timur Moidunov"));
        chats.add(new ChatModel(R.drawable.jobs,"DevKG","Продам PlayStation"));
        chats.add(new ChatModel(R.drawable.jobs,"Java","Java 2022"));
        chats.add(new ChatModel(R.drawable.jobs,"Книги для IT","скачать книгу"));
        chats.add(new ChatModel(R.drawable.jobs,"Geectecth50-3","Timur Moidunov"));
        chats.add(new ChatModel(R.drawable.jobs,"GeekStudents","Timur Moidunov"));
        chats.add(new ChatModel(R.drawable.jobs,"DevKG","Продам PlayStation"));
        chats.add(new ChatModel(R.drawable.jobs,"Java","Java 2022"));
        chats.add(new ChatModel(R.drawable.jobs,"Книги для IT","скачать книгу"));
    }
}