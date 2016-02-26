package com.example.kiran.slidedrawermenu;

/**
 * Created by Kiran on 21-12-2015.
 */
public class RowItem {
    private String title;
    private int icon;

    public RowItem(int icon, String title) {
        this.icon = icon;
        this.title = title;
    }
    public String getTitle()
    {
        return (this.title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
