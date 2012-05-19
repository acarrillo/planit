package com.planit;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ActivityDetails extends Activity {

	TableLayout activity_details_table;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        activity_details_table = (TableLayout)findViewById(R.id.ActivityTable);
        fillActivityDetailsTable();
    }

	public void fillActivityDetailsTable()
	{
		TableRow row;
		TextView text;
		// Activity loop
		for(int i = 0; i < ActivityInfo.activity_info.length; i++)
		{
			row = new TableRow(this);
			text = new TextView(this);
			text.setTextColor(Color.WHITE);
			text.setTextSize(15);
			text.setText(ActivityInfo.activity_info[i]);
			row.addView(text);
			activity_details_table.addView(row, new TableLayout.LayoutParams(
					LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			System.out.println(ActivityInfo.activity_info[i]);
			
		}
		// Friend loop
		for(int i = 0; i < ActivityInfo.list_of_friends.length; i++)
		{
			row = new TableRow(this);
			text = new TextView(this);
			text.setTextColor(Color.WHITE);
			text.setTextSize(15);
			text.setText(ActivityInfo.list_of_friends[i]);
			row.addView(text);
			activity_details_table.addView(row, new TableLayout.LayoutParams(
                    LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			System.out.println(ActivityInfo.list_of_friends[i]);
		}
	}
}
