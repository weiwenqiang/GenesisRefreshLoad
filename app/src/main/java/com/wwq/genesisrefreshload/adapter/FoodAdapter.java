package com.wwq.genesisrefreshload.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wwq.genesisrefreshload.R;
import com.wwq.genesisrefreshload.adapter.base.BaseRecyclerAdapter;
import com.wwq.genesisrefreshload.adapter.base.CommonHolder;
import com.wwq.genesisrefreshload.beans.Food;
import com.wwq.genesisrefreshload.views.CircleImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lcodecore on 2016/12/6.
 */

public class FoodAdapter extends BaseRecyclerAdapter<Food> {
    @Override
    public CommonHolder<Food> setViewHolder(ViewGroup parent) {
        return new CardHolder(parent.getContext(), parent);
    }

    class CardHolder extends CommonHolder<Food> {

        @BindView(R.id.avatar)
        CircleImageView avatar;

        @BindView(R.id.tv_food)
        TextView tv_food;

        @BindView(R.id.tv_info)
        TextView tv_info;

        @BindView(R.id.iv_food)
        ImageView iv_food;

        public CardHolder(Context context, ViewGroup root) {
            super(context, root, R.layout.item_food);
        }

        @Override
        public void bindData(Food food) {
            avatar.setImageResource(food.avatar_id);
            iv_food.setImageResource(food.imageSrc);
            tv_food.setText(food.title);
            tv_info.setText(food.info);
        }
    }
}
