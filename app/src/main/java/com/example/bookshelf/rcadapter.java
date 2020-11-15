package com.example.bookshelf;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class rcadapter extends RecyclerView.Adapter<rcadapter.ViewHolder> {
    private Context context;
    private List<Book> mdata;

    public rcadapter(Context context, List<Book> mdata) {
        this.context = context;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater minflater = LayoutInflater.from(context);
        view = minflater.inflate(R.layout.cardviewitembook, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.tvbooktitle.setText(mdata.get(position).getTitle());
        holder.imgbookthumbnail.setImageResource(mdata.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BookActivity.class);
                intent.putExtra("Title",mdata.get(position).getTitle());
                intent.putExtra("Thumbnail",mdata.get(position).getThumbnail());
                intent.putExtra("Description",mdata.get(position).getDescription());
                intent.putExtra("Category",mdata.get(position).getCategory());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvbooktitle;
        ImageView imgbookthumbnail;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvbooktitle = itemView.findViewById(R.id.booktitleid);
            imgbookthumbnail = itemView.findViewById(R.id.bookimgid);
            cardView = itemView.findViewById(R.id.cardviewid);

        }
    }
}
