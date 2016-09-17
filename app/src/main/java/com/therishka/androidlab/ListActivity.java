package com.therishka.androidlab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rishad Mustafaev
 */

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView list = (RecyclerView) findViewById(R.id.list);

        ListAdapter adapter = new ListAdapter();
        list.setAdapter(adapter);

        List<String> items = new ArrayList<>();

        for (int i = 0; i < 55; i++) {
            items.add("String with ID = " + i);
        }

        adapter.setItems(items);
    }

    private class ListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        private List<String> mItems = new ArrayList<>();

        public void setItems(List<String> items) {
            this.mItems = items;
            notifyDataSetChanged();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            return new ListVH(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if (holder instanceof ListVH) {
                ((ListVH) holder).bind(position);
            }
        }

        @Override
        public int getItemCount() {
            return 0;
        }

        @SuppressWarnings("WeakerAccess")
        private class ListVH extends RecyclerView.ViewHolder {

            private TextView mTextView;

            public ListVH(View itemView) {
                super(itemView);
                mTextView = (TextView) itemView.findViewById(R.id.item_text);
            }

            public void bind(int position) {
                if (isThereItem(position)) {
                    mTextView.setText(mItems.get(position));
                }
            }

            private boolean isThereItem(int pos) {
                return mItems != null && !mItems.isEmpty() && mItems.get(pos) != null;
            }
        }
    }
}
