package com.gkv.app.Activity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.gkv.app.Adapter.SingleAdapter;
import com.gkv.app.Model.TransactionModel;
import com.gkv.app.R;
import com.gkv.app.Utility.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GOKUL on 31-08-2017.
 */
public class LedgerActivity extends BaseActivity implements View.OnClickListener, SingleAdapter.ReturnView {
    private TextView send;
    private TextView receive;
    private ListView listView;
    private TextView transaction_history;
    private TextView ethereum;
    private ImageView back;
    private TextView title;
    private ArrayList transactionModelArrayList = new ArrayList();

    @Override
    public void initialize(Bundle save) {
        send = (TextView) findViewById(R.id.send);
        receive = (TextView) findViewById(R.id.receive);
        listView = (ListView) findViewById(R.id.listview);
        transaction_history = (TextView) findViewById(R.id.transaction_history);
        ethereum = (TextView) findViewById(R.id.ethereum);
        back = (ImageView) findViewById(R.id.back);
        title = (TextView) findViewById(R.id.title);

        back.setImageDrawable(getResources().getDrawable(R.drawable.menuicon));


        ethereum.setPaintFlags(ethereum.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        transaction_history.setPaintFlags(transaction_history.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        title.setText("LedgerEX");

        send.setOnClickListener(this);
        receive.setOnClickListener(this);
        back.setOnClickListener(this);

        addData();

        listView.setAdapter(new SingleAdapter(this, R.layout.layout_listview_single_item, transactionModelArrayList, this, 0));
    }

    private void addData() {
        transactionModelArrayList.add(new TransactionModel("28 JULY 2017 | 8:36 AM", "Outgoing", "0.084316 ETH"));
    }

    @Override
    public int getActivityLayout() {
        return R.layout.activity_ledger;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.send:
                sendToActivity(SendActivity.class);
                break;
            case R.id.receive:
                sendToActivity(ReceiveActivity.class);
                break;
            case R.id.back:
                break;
        }
    }

    @Override
    public void getAdapterView(View view, List objects, int position, int from) {
        TransactionModel transactionModel = (TransactionModel) objects.get(position);
        TextView transaction_date = (TextView) view.findViewById(R.id.transaction_date);
        TextView transaction_amount = (TextView) view.findViewById(R.id.transaction_amount);

        transaction_date.setText(transactionModel.getTransactionDateTime());
        transaction_amount.setText(transactionModel.getTransactionAmount());
    }
}
