package com.example.classexer1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button btnTask = view.findViewById(R.id.button_to_task_manager);
        Button btnSummary = view.findViewById(R.id.button_to_summary);

        btnTask.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_taskManagerFragment)
        );

        btnSummary.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_summaryFragment)
        );

        return view;
    }
}
