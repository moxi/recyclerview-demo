package rcgonzalezf.org.recyclerviewdemo.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import rcgonzalezf.org.recyclerviewdemo.R;
import rcgonzalezf.org.recyclerviewdemo.models.MainModel;

public class MainModelAdapter extends RecyclerView.Adapter<MainModelAdapter.ViewHolder> {


    private final Context mContext;
    private List<MainModel> mModels;

    public MainModelAdapter(List<MainModel> models, Context context) {
        mModels = models;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.main_row, parent, false);
        return new MainModelAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MainModel mainModel = mModels.get(position);
        holder.mainTextView.setText(mainModel.name);
    }

    @Override
    public int getItemCount() {
        return mModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mainTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            this.mainTextView = (TextView) itemView.findViewById(R.id.main_textView);
        }
    }
}
