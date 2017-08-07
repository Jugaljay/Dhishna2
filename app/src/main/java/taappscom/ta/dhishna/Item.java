package taappscom.ta.dhishna;

import android.view.View;




import java.util.ArrayList;

public class Item {



    private String branch;

    private String event1;

    private String event2;

    private String toAddress;

    private int requestsCount;

    private String date;

    private String time;



    private View.OnClickListener requestBtnClickListener;



    public Item() {

    }



    public Item(String branch, String event1, String event2, String toAddress, int requestsCount, String date, String time) {

        this.branch = branch;

        this.event1 = event1;

        this.event2 = event2;

        this.toAddress = toAddress;

        this.requestsCount = requestsCount;

        this.date = date;

        this.time = time;

    }



    public String getBranch() {

        return branch;

    }



    public void setBranch(String branch) {

        this.branch = branch;

    }



    public String getevent1() {

        return event1;

    }



    public void setevent1(String event1) {

        this.event1 = event1;

    }



    public String getevent2() {

        return event2;

    }



    public void setevent2(String event2) {

        this.event2 = event2;

    }



    public String getToAddress() {

        return toAddress;

    }



    public void setToAddress(String toAddress) {

        this.toAddress = toAddress;

    }



    public int getRequestsCount() {

        return requestsCount;

    }



    public void setRequestsCount(int requestsCount) {

        this.requestsCount = requestsCount;

    }



    public String getDate() {

        return date;

    }



    public void setDate(String date) {

        this.date = date;

    }



    public String getTime() {

        return time;

    }



    public void setTime(String time) {

        this.time = time;

    }



    public View.OnClickListener getRequestBtnClickListener() {

        return requestBtnClickListener;

    }



    public void setRequestBtnClickListener(View.OnClickListener requestBtnClickListener) {

        this.requestBtnClickListener = requestBtnClickListener;

    }



    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;



        Item item = (Item) o;



        if (requestsCount != item.requestsCount) return false;

        if (branch != null ? !branch.equals(item.branch) : item.branch != null) return false;

       // if (pledgePrice != null ? !pledgePrice.equals(item.pledgePrice) : item.pledgePrice != null)

         //   return false;

        if (event2 != null ? !event2.equals(item.event2) : item.event2 != null)

            return false;

        if (toAddress != null ? !toAddress.equals(item.toAddress) : item.toAddress != null)

            return false;

        if (date != null ? !date.equals(item.date) : item.date != null) return false;

        return !(time != null ? !time.equals(item.time) : item.time != null);



    }



    @Override

    public int hashCode() {

        int result = branch != null ? branch.hashCode() : 0;

       // result = 31 * result + (pledgePrice != null ? pledgePrice.hashCode() : 0);

        result = 31 * result + (event2 != null ? event2.hashCode() : 0);

        result = 31 * result + (toAddress != null ? toAddress.hashCode() : 0);

        result = 31 * result + requestsCount;

        result = 31 * result + (date != null ? date.hashCode() : 0);

        result = 31 * result + (time != null ? time.hashCode() : 0);

        return result;

    }



    /**

     * @return List of elements prepared for tests

     */

    public static ArrayList<Item> getTestingList() {

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("Information Technology", "Event 1", "Event 2", "W 139th St, NY, 10030", 3, "TODAY", "05:10 PM"));

        items.add(new Item("Computer Science", "$116", "W 36th St, NY, 10015", "W 114th St, NY, 10037", 10, "TODAY", "11:10 AM"));

        items.add(new Item("Electronics", "$350", "W 36th St, NY, 10029", "56th Ave, NY, 10041", 0, "TODAY", "07:11 PM"));

        items.add(new Item("Electrical", "$150", "12th Ave, NY, 10012", "W 57th St, NY, 10048", 8, "TODAY", "4:15 AM"));

        items.add(new Item("Civil", "$300", "56th Ave, NY, 10041", "W 36th St, NY, 10029", 0, "TODAY", "06:15 PM"));
        items.add(new Item("Safety And Fire", "$300", "56th Ave, NY, 10041", "W 36th St, NY, 10029", 0, "TODAY", "06:15 PM"));
        items.add(new Item("Mechanical", "$300", "56th Ave, NY, 10041", "W 36th St, NY, 10029", 0, "TODAY", "06:15 PM"));
        return items;



    }



}