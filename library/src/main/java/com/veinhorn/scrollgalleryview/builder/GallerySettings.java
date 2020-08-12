package com.veinhorn.scrollgalleryview.builder;


import androidx.fragment.app.FragmentManager;

public class GallerySettings {
    private int thumbnailSize;
    private int thumbnailMarginStart;
    private int thumbnailMarginEnd;
    private int thumbnailMarginTop;
    private int thumbnailMarginBottom;
    private boolean isZoomEnabled;
    private FragmentManager fragmentManager;

    public int getThumbnailSize() {
        return thumbnailSize;
    }

    public void setThumbnailSize(int thumbnailSize) {
        this.thumbnailSize = thumbnailSize;
    }

    public int getThumbnailMarginStart() {
        return thumbnailMarginStart;
    }

    public void setThumbnailMarginStart(int thumbnailMarginStart) {
        this.thumbnailMarginStart = thumbnailMarginStart;
    }

    public int getThumbnailMarginEnd() {
        return thumbnailMarginEnd;
    }

    public void setThumbnailMarginEnd(int thumbnailMarginEnd) {
        this.thumbnailMarginEnd = thumbnailMarginEnd;
    }

    public int getThumbnailMarginTop() {
        return thumbnailMarginTop;
    }

    public void setThumbnailMarginTop(int thumbnailMarginTop) {
        this.thumbnailMarginTop = thumbnailMarginTop;
    }

    public int getThumbnailMarginBottom() {
        return thumbnailMarginBottom;
    }

    public void setThumbnailMarginBottom(int thumbnailMarginBottom) {
        this.thumbnailMarginBottom = thumbnailMarginBottom;
    }

    public boolean isZoomEnabled() {
        return isZoomEnabled;
    }

    public void setZoomEnabled(boolean zoomEnabled) {
        isZoomEnabled = zoomEnabled;
    }

    public FragmentManager getFragmentManager() {
        return fragmentManager;
    }

    public void setFragmentManager(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public static GallerySettingsBuilder from(FragmentManager fm) {
        GallerySettingsBuilder builder = new GallerySettingsBuilderImpl();
        builder.withFragmentManager(fm);
        return builder;
    }
}
