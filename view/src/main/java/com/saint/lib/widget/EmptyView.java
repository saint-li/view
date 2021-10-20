package com.saint.lib.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EmptyView extends LinearLayout {
    private LinearLayout layoutEmpty;
    private TextView tvTips;
    private ImageView ivTips;

    public EmptyView(Context context) {
        super(context);
        init();
    }

    public EmptyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EmptyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setOrientation(VERTICAL);
        View view = inflate(getContext(), R.layout.view_layout_empty, null);
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        view.setLayoutParams(params);
        addView(view);
        layoutEmpty = view.findViewById(R.id.layout_empty);
        tvTips = view.findViewById(R.id.tv_empty_tips);
        ivTips = view.findViewById(R.id.iv_empty_tips);

    }

    public void setTextTips(String str) {
        tvTips.setText(str);
    }

    public void setTextTips(int strRes) {
        tvTips.setText(strRes);
    }

    public void noData() {
        tvTips.setText(R.string.noData);
        ivTips.setImageResource(R.mipmap.view_content_empty);
        layoutEmpty.setVisibility(VISIBLE);
    }

    public void noData(String tips) {
        tvTips.setText(tips);
        ivTips.setImageResource(R.mipmap.view_content_empty);
        layoutEmpty.setVisibility(VISIBLE);
    }

    public void noData(int strResId) {
        tvTips.setText(strResId);
        ivTips.setImageResource(R.mipmap.view_content_empty);
        layoutEmpty.setVisibility(VISIBLE);
    }

    public void netError() {
        tvTips.setText(R.string.loadDataError);
        ivTips.setImageResource(R.mipmap.view_network_error);
        layoutEmpty.setVisibility(VISIBLE);
    }

    public void setIvTips(int drawableId) {
        ivTips.setImageResource(drawableId);
    }

    public void setNoImg() {
        ivTips.setVisibility(GONE);
    }

    public void tips(String str, int resId) {
        if (!TextUtils.isEmpty(str))
            tvTips.setText(str);
        if (resId > 0)
            ivTips.setImageResource(resId);
    }

    public void tips(int strResId, int resId) {
        if (strResId > 0)
            tvTips.setText(strResId);
        if (resId > 0)
            ivTips.setImageResource(resId);
    }
}
