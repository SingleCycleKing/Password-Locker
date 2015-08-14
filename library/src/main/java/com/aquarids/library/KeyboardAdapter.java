package com.aquarids.library;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class KeyboardAdapter extends RecyclerView.Adapter<KeyboardAdapter.ViewHolder> {

    private Context mContext;
    private String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};

    public KeyboardAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_keyboard, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case 0:
                ViewHolder viewHolder = (ViewHolder) holder;
                viewHolder.lockButton.setText(numbers[position]);
                break;
        }

    }

    public String getText(int position) {
        return numbers[position];
    }


    @Override
    public int getItemCount() {
        return null == numbers ? 0 : numbers.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        LockButton lockButton;

        public ViewHolder(View itemView) {
            super(itemView);
            lockButton= (LockButton) itemView.findViewById(R.id.key_number);
        }
    }
}
