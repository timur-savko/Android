package by.bsu.timur.lec8;

import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserViewHolder> {

    class UserViewHolder extends RecyclerView.ViewHolder {
        private final TextView userItemView;

        private UserViewHolder(View itemView) {
            super(itemView);
            userItemView = itemView.findViewById(R.id.textView);
        }
    }

    private final LayoutInflater mInflater;
    private List<User> users = Collections.emptyList();

    UserListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        View itemView = mInflater.inflate(R.layout.recycleview_item, viewGroup, false);
        return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int i) {
        User current = users.get(i);
        userViewHolder.userItemView.setText(current.getUser());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    void setUsers(List<User> users) {
        this.users = users;
        notifyDataSetChanged();
    }
}
