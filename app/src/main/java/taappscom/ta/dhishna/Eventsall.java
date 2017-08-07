package taappscom.ta.dhishna;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ramotion.foldingcell.FoldingCell;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Jugal on 02-08-2017.
 */
public class Eventsall extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
View view= inflater.inflate(R.layout.all_events,container,false);

        ListView theListView = (ListView)view.findViewById(R.id.mainListView);



        // prepare elements to display

        final ArrayList<Item> items = Item.getTestingList();



        // add custom btn handler to first list item

        items.get(0).setRequestBtnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

               Toast.makeText(getActivity(), "CUSTOM HANDLER FOR FIRST BUTTON", Toast.LENGTH_SHORT).show();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                itevents fragment=new itevents();
                fragmentTransaction.replace(R.id.contents,fragment);
                fragmentTransaction.commit();
            }

        });



        // create custom adapter that holds elements and their state (we need hold a id's of unfolded elements for reusable elements)

        final FoldingCellListAdapter adapter = new FoldingCellListAdapter(this.getActivity(), items);



        // add default btn handler for each request btn on each item if custom handler not found

        adapter.setDefaultRequestBtnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

               Toast.makeText(getActivity(), "DEFAULT HANDLER FOR ALL BUTTONS", Toast.LENGTH_SHORT).show();

            }

        });



        // set elements to adapter

        theListView.setAdapter(adapter);



        // set on click event listener to list view

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {

                // toggle clicked cell state

                ((FoldingCell) view).toggle(false);

                // register in adapter that state for selected cell is toggled

                adapter.registerToggle(pos);

            }

        });


       view.getOverScrollMode();
        return view;
    }

}
